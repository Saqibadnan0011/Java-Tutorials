import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        // Q: Find the fibonacci series using for loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the fibonacci number within limits: ");
        int limit = in.nextInt();

        int num1 = 0;
        int num2 = 1;

        System.out.println("Fibonacci number up to: " + limit);
        System.out.println(num1 + " " + num2 + " ");

        for (int i = 2; i <= limit; i++) {
            int nextNum = num1 + num2;
            if (nextNum <= limit) {
                System.out.println(nextNum + " ");
                num1 = num2;
                num2 = nextNum;
            } else {
                break;
            }
        }
        in.close();
    }
}
