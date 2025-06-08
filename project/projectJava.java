//AcademicRecordKeeper
package project;
import java.sql.*;
import java.util.*;
// import java.io.FileReader;
// import com.opencsv.CSVReader;
// import com.opencsv.CSVWriter;


public class projectJava{
    public static Connection connectToDatabase(){
        Connection cons = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cons = DriverManager.getConnection("jdbc:mysql://localhost:3306/vit", "root","");
           System.out.println("Connection is Established");       
    }
    catch(Exception e){
        System.out.print(e.getMessage());
    }
    return cons;
}

// Registration
public static void Registration(Connection cons) {
    try{
        Scanner sc = new Scanner(System.in);
        Statement stm = cons.createStatement();
        System.out.print("Enter Name: ");
        String username = sc.nextLine();
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        System.out.print("Enter Reg NO.: ");
        int reg = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();
        System.out.print("Enter CGPA: ");
        float cgpa = sc.nextFloat();
        sc.nextLine();
        // String query = "INSERT INTO student (name, password, regno, branch, cgpa
        // ) VALUES ('" + username + "', '" + pass + "', '" + reg + "', '" +
        //  branch + "', '" + cgpa + "')";
        //  stm.executeUpdate(query);

        String sql = "insert into students value (?,?,?,?,?)";
        PreparedStatement pstmt = cons.prepareStatement(sql);
        pstmt.setString(1, username);
        pstmt.setString(2, pass);
        pstmt.setInt(3, reg);
        pstmt.setString(4, branch);
        pstmt.setFloat(5, cgpa);
        pstmt.execute();
        // stm.executeUpdate("insert into students value ('ram','ram123','World', 10)");
        System.out.println("Data is Inserted Successfully");
        stm.close();
        // cons.close();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

//Update Password using name
public static void updatePassword(Connection cons){
    try{
        Scanner sc = new Scanner(System.in);
        Statement stm = cons.createStatement();
        System.out.print("Enter Name: ");
        String username = sc.nextLine();
        System.out.print("Enter Old Password: ");
        String oldPass = sc.nextLine();
        // System.out.print("Enter New Password: ");

        String sql = "select password from students where name = ?";
        PreparedStatement pstmt = cons.prepareStatement(sql);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();

        if(rs.next()){
            String storedPass = rs.getString("password");
            if(storedPass.equals(oldPass)){
                System.out.println("Enter new Password: ");
                String newPass = sc.nextLine();
                String updateQuery = "update students set password = '" + newPass + "' where name = '"
                + username + "'";
                stm.executeUpdate(updateQuery);
                System.out.println("Password update successfuly.");
                stm.close();
            }
        }
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
}

//Delete Data Indivisually
public static void deleteData(Connection cons) {
    try{
        Statement smt = cons.createStatement();
        smt.executeUpdate("delete from students where name = 'ujjaval saini'");
        smt.executeUpdate("delete from students where name = '2'");
        System.out.println("Data is Deleted Successfully");
        smt.close();
        // cons.close();
}
catch(Exception e){
    System.out.println(e.getMessage());
    }
}

//View Data in Tabuler Form
public static void viewData(Connection cons){
try{
    Statement stm = cons.createStatement();
    ResultSet rs = stm.executeQuery("select * from students");
    if(rs.next() == false){
        System.out.println("The Table is Empty");
    }else{
        System.out.println("_______________________________________________________________________");
        System.out.printf("%-15s %-15s %-10s %-15s %-10s%n", "USERNAME", "PASSWORD", "REG. NO.", "BRANCH", "CGPA");
        System.out.println("_______________________________________________________________________");
        do{
            System.out.printf("%-15s %-15s %-10d %-15s %-10.2f%n", 
            rs.getString(1),   
            rs.getString(2),   
            rs.getInt(3),      
            rs.getString(4),   
            rs.getFloat(5));
            System.out.println("-----------------------------------------------------------------------");
        }while(rs.next() == true);
        // System.out.println("-----------------------------------------------------------------------");
    }
}
catch(Exception e){
    System.out.println(e.getMessage());
    }
}
    //Main Method
    public static void main(String[] args) throws InstantiationError,IllegalAccessError{
        Connection cons = connectToDatabase();
        Scanner sc = new Scanner(System.in);
        if (cons != null) {
            while (true) {
                System.out.println("1. Registration.");
                System.out.println("2. Update Password.");
                System.out.println("3. View Data.");
                System.out.println("4. Delete Data.");
                System.out.println("5. Import/Export Operations");
                System.out.println("6. Exit.");
                System.out.print("Enter Operation: ");
                int choice = sc.nextInt();
                if(choice == 1){
                    Registration(cons);
                }else if(choice == 2){
                    updatePassword(cons);
                }
                else if(choice == 3){
                    viewData(cons);
                }
                else if(choice == 4){
                    deleteData(cons);
                }
                else if(choice == 5){
                    System.out.println("1. Export to CSV");
                    System.out.println("2. Import from CSV");
                    System.out.println("3. Exit from this.!");
                    System.out.print("Enter choice: ");
                    int ch = sc.nextInt();
                    switch (ch) {
                        // case 1: ExportCSV.exportToCSV(cons); break;
                        // case 2: ImportCSV.importFromCSV(cons); break;
                        case 3: System.out.println("Exiting...\n----------------------------\nWelcome Back!!"); 
                        break;
                        default: System.out.println("Invalid choice");
                    }                   
                }
                else if(choice == 6){
                    System.out.println("Exiting...");
                    break; 
                }
                else{
                    System.out.println("Invalid choice");
                }
            }
            
        }
    }
}
