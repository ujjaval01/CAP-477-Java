public class loopInfinity {
    public static void main(String[] args) {
        // int i =1;
        // while(true){
        //     System.out.println(i);           //infinity
        //     i++;
        // }
        int a = 1;
        for(; ;){
            if(a == 1){
                a++;
                System.out.println(a);         //not a infinity 
                break;
            }
        }
    }
}
