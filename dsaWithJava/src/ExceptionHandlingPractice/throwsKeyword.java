package ExceptionHandlingPractice;

/*we are using throws with the method, as like below the code
USE for example m kisi company me developer hu aur maine apna ek method bnaya h
jiska use aur bhi log kr skte h,(nd m company chor k jaara hu) but mere methods me
kuch aise cheeje h jo exceptions de skti h infuture to m phele hi aur developers ko
alert karke jaunga ki ye method exception de skta h, to m method k samne throws ka use
karke exception likh dunga, taaki another dev mere meth koz carefully use kre
 */

public class throwsKeyword {
    static void main() {
        int[] arr = new int[5];

        try{
            getnum(arr);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static int getnum(int[] arr) throws NullPointerException {
        return arr[8];
    }
}