public class DisplayVowels {
    public static void main(String[] args) {
        String str = "Hello World";
        for (char c : str.toCharArray()) {
            if ("AEIOUaeiou".indexOf(c) != -1) {
                System.out.print(c + " ");
            }
        }
    }
}
