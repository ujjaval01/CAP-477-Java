package project;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class ProjectJavaGUI extends JFrame {
    private Connection cons;

    // Constructor for the GUI
    public ProjectJavaGUI() {
        cons = connectToDatabase();

        // Set up the main frame
        setTitle("Student Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1));

        // Create buttons for each operation
        JButton registerButton = new JButton("Registration");
        JButton updatePasswordButton = new JButton("Update Password");
        JButton viewDataButton = new JButton("View Data");
        JButton deleteDataButton = new JButton("Delete Data");

        // Add ActionListeners to buttons
        registerButton.addActionListener(e -> showRegistrationForm());
        updatePasswordButton.addActionListener(e -> showUpdatePasswordForm());
        viewDataButton.addActionListener(e -> viewData());
        deleteDataButton.addActionListener(e -> showDeleteForm());

        // Add buttons to the frame
        add(registerButton);
        add(updatePasswordButton);
        add(viewDataButton);
        add(deleteDataButton);
    }

    // Connect to the MySQL database
    public Connection connectToDatabase() {
        Connection cons = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root", "");
            System.out.println("Connection is Established");
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return cons;
    }

    // Show the registration form
    public void showRegistrationForm() {
        JFrame frame = new JFrame("Registration");
        frame.setSize(300, 300);
        frame.setLayout(new GridLayout(6, 2));

        JTextField nameField = new JTextField();
        JTextField passwordField = new JTextField();
        JTextField regField = new JTextField();
        JTextField branchField = new JTextField();
        JTextField cgpaField = new JTextField();

        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Password:"));
        frame.add(passwordField);
        frame.add(new JLabel("Reg No.:"));
        frame.add(regField);
        frame.add(new JLabel("Branch:"));
        frame.add(branchField);
        frame.add(new JLabel("CGPA:"));
        frame.add(cgpaField);

        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);
        submitButton.addActionListener(e -> {
            String name = nameField.getText();
            String password = passwordField.getText();
            int regNo = Integer.parseInt(regField.getText());
            String branch = branchField.getText();
            float cgpa = Float.parseFloat(cgpaField.getText());
            Registration(cons, name, password, regNo, branch, cgpa);
            frame.dispose();
        });

        frame.setVisible(true);
    }

    // Registration functionality
    public void Registration(Connection cons, String username, String pass, int reg, String branch, float cgpa) {
        try {
            String sql = "insert into students value (?,?,?,?,?)";
            PreparedStatement pstmt = cons.prepareStatement(sql);
            pstmt.setString(1, username);
            pstmt.setString(2, pass);
            pstmt.setInt(3, reg);
            pstmt.setString(4, branch);
            pstmt.setFloat(5, cgpa);
            pstmt.execute();
            JOptionPane.showMessageDialog(this, "Data is Inserted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Show the update password form
    public void showUpdatePasswordForm() {
        JFrame frame = new JFrame("Update Password");
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(4, 2));

        JTextField nameField = new JTextField();
        JTextField oldPassField = new JTextField();
        JTextField newPassField = new JTextField();

        frame.add(new JLabel("Name:"));
        frame.add(nameField);
        frame.add(new JLabel("Old Password:"));
        frame.add(oldPassField);
        frame.add(new JLabel("New Password:"));
        frame.add(newPassField);

        JButton submitButton = new JButton("Submit");
        frame.add(submitButton);
        submitButton.addActionListener(e -> {
            String username = nameField.getText();
            String oldPass = oldPassField.getText();
            String newPass = newPassField.getText();
            updatePassword(cons, username, oldPass, newPass);
            frame.dispose();
        });

        frame.setVisible(true);
    }

    // Update password functionality
    public void updatePassword(Connection cons, String username, String oldPass, String newPass) {
        try {
            String sql = "select password from students where name = ?";
            PreparedStatement pstmt = cons.prepareStatement(sql);
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String storedPass = rs.getString("password");
                if (storedPass.equals(oldPass)) {
                    String updateQuery = "update students set password = ? where name = ?";
                    pstmt = cons.prepareStatement(updateQuery);
                    pstmt.setString(1, newPass);
                    pstmt.setString(2, username);
                    pstmt.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Password updated successfully.");
                } else {
                    JOptionPane.showMessageDialog(this, "Old password is incorrect.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No user found with this name.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // Show the delete data form
    public void showDeleteForm() {
        JFrame frame = new JFrame("Delete Data");
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(2, 2));

        JTextField nameField = new JTextField();
        frame.add(new JLabel("Name:"));
        frame.add(nameField);

        JButton deleteButton = new JButton("Delete");
        frame.add(deleteButton);
        deleteButton.addActionListener(e -> {
            String name = nameField.getText();
            deleteData(cons, name);
            frame.dispose();
        });

        frame.setVisible(true);
    }

    // Delete data functionality
    public void deleteData(Connection cons, String name) {
        try {
            String sql = "delete from students where name = ?";
            PreparedStatement pstmt = cons.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data is Deleted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    // View data functionality
    public void viewData() {
        try {
            Statement stm = cons.createStatement();
            ResultSet rs = stm.executeQuery("select * from students");
            JTextArea textArea = new JTextArea();
            JFrame frame = new JFrame("View Data");
            frame.setSize(500, 400);
            frame.add(new JScrollPane(textArea));
            if (!rs.next()) {
                textArea.setText("The Table is Empty");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(String.format("%-15s %-15s %-10s %-15s %-10s%n", "Username", "Password", "Reg No", "Branch", "CGPA"));
                sb.append("------------------------------------------------------------\n");
                do {
                    sb.append(String.format("%-15s %-15s %-10d %-15s %-10.2f%n",
                        rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getFloat(5)));
                } while (rs.next());
                textArea.setText(sb.toString());
            }
            frame.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public static void main(String[] args) {
        ProjectJavaGUI gui = new ProjectJavaGUI();
        gui.setVisible(true);
    }
}
