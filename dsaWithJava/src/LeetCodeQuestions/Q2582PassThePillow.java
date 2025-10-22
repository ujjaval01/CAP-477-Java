package LeetCodeQuestions;

public class Q2582PassThePillow {
    static void main() {
        int n = 8;
        int time = 9;
        int ans = find(n,time);
        System.out.println(ans);
    }
    static int find(int n, int time){
        int pos = 1;
        int dir = 1;
        for(int i = 0; i<time; i++){
            pos = pos + dir;
            if(pos == n || pos == 1){
                dir = -dir;
            }
        }
        return pos;
    }
}
