package Collections.arrayList;
/*
* if n = 5
          1
       1     1
    1     2     1
  1    3     3     1
1   4     6     4     1

*/


import java.util.ArrayList;
import java.util.List;

public class PascalTrangle {
    static void main() {
        int n = 5;
        List<List<Integer>> g = generate(n);
        for(List<Integer> list: g){
            for(int ele: list){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        
    }
    static List<List<Integer>> generate(int n){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
           ans.add(new ArrayList<Integer>());
           for(int j = 0; j<=i; j++){
               if(j == 0 || j == i) ans.get(i).add(1);
               else {
                   int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                   ans.get(i).add(val);
               }
           }
        }
        return ans;
    }
}
