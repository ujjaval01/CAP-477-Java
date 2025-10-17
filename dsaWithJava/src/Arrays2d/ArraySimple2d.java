package Arrays2d;
public class ArraySimple2d{
    public static void main(String[] args) {
        int [][] num1 = {{101,102,103,104},
                         {201,202,203,204}};


        for(int i = 0; i < num1.length; i++){
            for(int j = 0; j <num1[i].length; j++){
                System.out.print(num1[i][j] + " ");
            }
            System.out.println();
        }
//        for (int[] ints : num1) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
    }
}
