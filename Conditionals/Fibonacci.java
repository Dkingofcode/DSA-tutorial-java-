package Conditionals;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.println("Fibonacci series up to " + n + ":");
        System.out.print(a + " " + b);

        c = a + b;
        while (c <= n) {
            System.out.print(" " + c);
            a = b;
            b = c;
            c = a + b;
        }
    }
}