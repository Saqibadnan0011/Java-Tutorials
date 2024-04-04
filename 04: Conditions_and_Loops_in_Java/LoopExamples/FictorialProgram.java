import java.util.Scanner;

public class FictorialProgram {
    public static void main(String[] args) {
        // Q: Find Factorial number using while loop
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = in.nextInt();
        int i = 1;
        int fact = 1;
        while (i < num) {
            fact = fact*i;
            i++;
        }
        System.out.println("Your factorial num of " + num + " is " + fact);
    }
}
