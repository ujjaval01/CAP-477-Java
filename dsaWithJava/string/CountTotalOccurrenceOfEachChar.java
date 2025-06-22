public class CountTotalOccurrenceOfEachChar {
    public static void main(String[] args) {
        String str = "1Ujjavala1".toLowerCase();
        int freq[] = new int[256];
        for(int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for(int i = 0; i< 256; i++){
            if (freq[i] > 0) {
                System.out.println((char)i + "->" + freq[i]);
            }
        }
    }
}
