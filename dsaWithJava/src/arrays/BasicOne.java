package arrays;

public class BasicOne {
    public static void main(String[] args) {
        String[][] name = {{"Ujvl","Vnsi" ,"Aman", "Aadi"},
                           {"Ujvl","Vnsi" ,"Aman", "Aadi"}};
//        for (String[] strings : name) {
//            for (String string : strings) {
//                System.out.print(string + " ");
//            }
//            System.out.println();
//        }

        for(int i = 0; i< name.length; i++){
            for (int j = 0; j<name[i].length; j++){
                System.out.print(name[i][j] + " ");
            }
            System.out.println();
        }
    }
}
