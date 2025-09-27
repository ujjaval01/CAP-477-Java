package SortBubble;
/*
In every case T.C - O(n*n)
*/
public class simpleSorting {
    static void main() {
        int[] arr = {60,20,50,40,30,10};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int e:arr){
            System.out.print(e + " ");
        }

    }
}
/*
🔹 Initial Array
[4, 5, 8, 3, 1, 2]

Pass 1 (i = 0)
i	j	Compare	Swap?	Array State
0	0	4 > 5	No	[4, 5, 8, 3, 1, 2]
0	1	5 > 8	No	[4, 5, 8, 3, 1, 2]
0	2	8 > 3	Yes	[4, 5, 3, 8, 1, 2]
0	3	8 > 1	Yes	[4, 5, 3, 1, 8, 2]
0	4	8 > 2	Yes	[4, 5, 3, 1, 2, 8]

👉 Largest element 8 last me chala gaya.

Pass 2 (i = 1)
i	j	Compare	Swap?	Array State
1	0	4 > 5	No	[4, 5, 3, 1, 2, 8]
1	1	5 > 3	Yes	[4, 3, 5, 1, 2, 8]
1	2	5 > 1	Yes	[4, 3, 1, 5, 2, 8]
1	3	5 > 2	Yes	[4, 3, 1, 2, 5, 8]

👉 Second largest 5 apni jagah aa gaya.

Pass 3 (i = 2)
i	j	Compare	Swap?	Array State
2	0	4 > 3	Yes	[3, 4, 1, 2, 5, 8]
2	1	4 > 1	Yes	[3, 1, 4, 2, 5, 8]
2	2	4 > 2	Yes	[3, 1, 2, 4, 5, 8]

👉 4 apni sahi position pe aa gaya.

Pass 4 (i = 3)
i	j	Compare	Swap?	Array State
3	0	3 > 1	Yes	[1, 3, 2, 4, 5, 8]
3	1	3 > 2	Yes	[1, 2, 3, 4, 5, 8]

👉 Ab array almost sorted ho gaya.

Pass 5 (i = 4)
i	j	Compare	Swap?	Array State
4	0	1 > 2	No	[1, 2, 3, 4, 5, 8]

👉 flag = false → loop break.
*/
