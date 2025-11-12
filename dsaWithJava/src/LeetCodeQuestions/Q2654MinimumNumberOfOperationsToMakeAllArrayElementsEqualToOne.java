package LeetCodeQuestions;

public class Q2654MinimumNumberOfOperationsToMakeAllArrayElementsEqualToOne {
    static void main() {
        int[] arr = {1,1};
        System.out.println(minOperations(arr));
    }
    // with the help of chatbots
    public static int minOperations(int[] arr) {
        int n = arr.length;

        // 1) overall gcd
        if (gcdOfArr(arr) != 1) return -1;

        // 2) if any ones already present -> number of non-ones
        int ones = 0;
        for (int x : arr) if (x == 1) ones++;
        if (ones > 0) return n - ones;

        // 3) no ones present, but overall gcd == 1
        // find shortest subarray with gcd == 1
        int minLen = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int g = arr[i];
            if (g == 1) { minLen = 1; break; } // defensive (shouldn't happen here)
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, arr[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break;
                }
            }
        }

        // formula
        return (minLen - 1) + (n - 1);
    }

    public static int gcdOfArr(int[] arr) {
        int res = arr[0];
        for (int i = 1; i < arr.length; i++) {
            res = gcd(res, arr[i]);
            if (res == 1) break;
        }
        return res;
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }



// by myself
//    public static int minOperations(int[] arr) {
//      if(gcdOfArr(arr) != 1) return -1;
//      if (alreadyAllOnes(arr)) return 0;
//      int n = arr.length;
//      int minSubLen = Integer.MAX_VALUE;
//      for (int i = 0; i < n; i++) {
//          int g = arr[i];
//          if (g == 1) {
//              minSubLen = 1;
//              break;
//          }
//          for (int j = i + 1; j < n; j++) {
//              g = gcd(g, arr[j]);
//              if (g == 1) {
//                  minSubLen = Math.min(minSubLen, j - i + 1);
//                  break;
//              }
//          }
//      }
//        return (minSubLen - 1) + (n - 1);
//    }
//
//    private static boolean alreadyAllOnes(int[] arr) {
//        boolean b = true;
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i-1] != arr[i]) return false;
//        }
//        return b;
//    }
//
//    public static int gcdOfArr(int[] arr){
//        int result = arr[0];
//        for(int i = 1; i<arr.length; i++){
//            result = gcd(result, arr[i]);
//            if(result == 1){
//                break;
//            }
//        }
//        return result;
//    }
//    public static int gcd(int a, int b) {
//        if(a == 0) return b;
//        return gcd(b%a, a);
//    }
}
