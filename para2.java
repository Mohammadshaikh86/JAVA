public class para2 {
    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num2 != 0 ? num1 / num2 : Double.NaN;
            default: throw new IllegalArgumentException("Invalid operator");
        }
    }

    public static void main(String[] args) {
        double num1 = 5.0, num2 = 2.0;
        char operator = '+';

        double result = calculate(num1, num2, operator);
        System.out.printf("%.2f %c %.2f = %.2f%n", num1, operator, num2, result);
    }
}