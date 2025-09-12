package G4G_practice;

public class question1 {
    public static void main(String[] args) {
        String s = "banana";
        String[] arr = {"apple", "bane", "orange", "banaba", "mangoes"};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() != s.length()) {
                continue; // skip different length words
            }

            int diffCount = 0;
            for (int j = 0; j < s.length(); j++) {
                if (arr[i].charAt(j) != s.charAt(j)) {
                    diffCount++;
                }
            }

            if (diffCount == 1) {
                System.out.println(arr[i] + " -> founded");
            }
        }
    }
}
