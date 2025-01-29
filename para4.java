public class para4 {
    public static boolean isLeapYear(int year) {
        if (year <= 0) {
            throw new IllegalArgumentException("Year must be positive");
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        int year = 2024;
        boolean result = isLeapYear(year);
        System.out.println(year + (result ? " is a leap year" : " is not a leap year"));
    }
}
