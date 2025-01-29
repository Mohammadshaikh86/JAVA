public class CharacterFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        int[] freq = new int[256]; 
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') { 
                freq[c]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char) i + ": " + freq[i]);
            }
        }
    }
}
