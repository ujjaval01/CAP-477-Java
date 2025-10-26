package LeetCodeQuestions;

public class Q2299StrongPassCheck {
    static void main() {
        String password = "IloveLe3tcode!";
        boolean res = strongPasswordChecker(password);
        System.out.println(res);


    }
    public static boolean strongPasswordChecker(String password) {
        if (password.length() < 8) return false;

        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        String special = "!@#$%^&*()-+";

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (i > 0 && password.charAt(i) == password.charAt(i - 1)) {
                return false; // adjacent identical chars
            }

            if (Character.isLowerCase(ch)) hasLower = true;
            else if (Character.isUpperCase(ch)) hasUpper = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (special.indexOf(ch) != -1) hasSpecial = true;
        }

        return hasLower && hasUpper && hasDigit && hasSpecial;
    }
}
