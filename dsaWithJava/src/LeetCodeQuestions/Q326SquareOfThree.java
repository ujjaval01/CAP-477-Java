package LeetCodeQuestions;

public interface Q326SquareOfThree {
    public static void main(String[] args){
        int n = 81;
        boolean b = check(n);
        System.out.println(b);

    }
    static boolean check(int n) {
        if (n <= 0) return false;
        int i = 1;
        while (i < n) {
            i = i * 3;
        }
        return i == n;
    }
}
