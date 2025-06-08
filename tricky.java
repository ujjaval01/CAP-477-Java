import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class tricky {
    private static final String[] below20 = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private static final String[] millions = {"", "Million", "Billion", "Trillion"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        long num = sc.nextLong();

        // long num = 438237764;
        System.out.println(numberToWords(num));
    }

    private static String numberToWords(long num) {
        if (num == 0) {
            return below20[0];
        }

        Map<Integer, String> map = new HashMap<>();
        int index = 0;
        while (num > 0) {
            long div = num / 1000;
            long rem = num % 1000;
            if (rem > 0) {
                map.put(index++, convertLessThanOneThousand(rem) + millions[index]);
            }
            num = div;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = index - 1; i >= 0; i--) {
            sb.append(map.get(i));
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    private static String convertLessThanOneThousand(long num) {
        if (num < 20) {
            return below20[(int) num];
        }

        String word = tens[(int) (num / 10)];
        if (num % 10 > 0) {
            word += "-" + below20[(int) (num % 10)];
        }

        return word;
    }
}


