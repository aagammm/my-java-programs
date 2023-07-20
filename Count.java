import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter a number:");
        long num = sc.nextLong();
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("Number of digits in the given number is " + count);
    }

}
