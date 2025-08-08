package arrays;

public class Simple {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int[] marks = new int[5];
        marks[0] = 50;
        marks[1] = 30;
        marks[2] = 10;
        marks[3] = 80;
        marks[4] = 60;

        for(int i = 0; i < marks.length-1; i++ ){
            System.out.print(marks[i] + " ");
        }

        
    }
} 
