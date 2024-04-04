import java.util.Scanner;

public class PrimeOrNotExample {
    public static void main(String[] args) {
        // Q: Write a program to find give number is prime or not
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to check prime or not: ");
        int check = in.nextInt();

        // boolean expression to check number is prime then (T) otherwise num (F)
        boolean isPrime = true;

        // Check the number divisible by any other number other than 1 using for loop
        for (int i = 2; i <= Math.sqrt(check); i++) {
            if (check % i == 0) {
                isPrime = false;
                break;
            }
        }

        // Display the result using if-else condition
        if (check <= 1) {
            System.out.println(check + "is a not prime");
        } else if (isPrime) {
            System.out.println(check + "is a prime");
        } else {
            System.out.println(check + "is a not prime");
        }
        in.close();
    }
}
