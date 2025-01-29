import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.print("Enter the number to check: ");
        a = scanner.nextInt(); 
        if (a > 0) {
            System.out.println("The number you've entered is positive");
        } else if (a < 0) {
            System.out.println("The number you've entered is negative");
        } else {
            System.out.println("The number you've entered is zero");
        }
        scanner.close();
    }
}
