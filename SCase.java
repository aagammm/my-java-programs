import java.util.Scanner;

public class SCase {
    public static void main(String[] args) {
        char choice;
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Enter your choice");
        System.out.println("+ for Sum");
        System.out.println("- for Difference");
        System.out.println("* for Product");
        System.out.println("/ for Division");
        System.out.println("% for Modulus");

        choice = sc.next().charAt(0);
        switch (choice) {
            case '+':
                System.out.println("Sum of" + x + "and" + y + "is:" + (x + y));
                break;

            case '-':
                System.out.println("Difference of" + x + "and" + y + "is:" + (x - y));
                break;

            case '*':
                System.out.println("Product of" + x + "and" + y + "is:" + (x * y));
                break;

            case '/':
                System.out.println("Divison of" + x + "and" + y + "is:" + (double) ((double) x / (double) y));
                break;

            // case '%':
            // System.out.println("Modulus of" + x + "and" + y + "is:" + (x % y));
            // break;

        }

    }
}
