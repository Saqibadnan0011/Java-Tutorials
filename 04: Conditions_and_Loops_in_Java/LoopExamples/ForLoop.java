import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        // Q: Write a program to print 1 to 10 number using ForLoop
        int j;
        for (j = 0; j <= 10; j++) {
            System.out.println(j);
        }

        // Q: find Factorial number using for loop
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = in.nextInt();
        int i;
        int fact = 5;
        for (i = 1; i < num; i++) {
            fact = fact*i;
        }
        System.out.println("Your factorial num " + num + " is " + fact);

        // Q: Write a program to find sum of all num divide by 3 & 5 within specific range

        Scanner inn = new Scanner(System.in);

        System.out.print("Enter a starting num of range: ");
        int start = inn.nextInt();
        System.out.print("Enter a ending num of range: ");
        int end = inn.nextInt();
        int sum = 0;
        for (int k = start; k <= end; k++) {
            if (k % 3 == 0 && k % 5 == 0) {
                sum += k;
            }
        }
        System.out.println("Enter number in range[" + start + " "+ end +"]" + sum);
        inn.close();
    }
}
