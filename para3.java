public class para3 {
    public static String checkNumber(double number) {
        if (number > 0) {
            return "Positive";
        } else if (number < 0) {
            return "Negative";
        } else {
            return "Zero";
        }
    }

    public static void main(String[] args) {
        double number = -3.5;
        String result = checkNumber(number);
        System.out.println("The number " + number + " is " + result);
    }
}