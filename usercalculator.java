import java.util.Scanner;

public class usercalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number (x): ");
        int x = scanner.nextInt();
        System.out.print("Enter the second number (y): ");
        int y = scanner.nextInt();
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y)); 
        System.out.println("x * y = " + (x * y)); 
        if (y != 0) {
            System.out.println("x / y = " + (x / y));
        } else {
            System.out.println("Division by zero is not allowed.");
        }
        scanner.close();
    }
}
