import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Choose the operator (+, -, *, /): ");
        char calc = input.next().charAt(0);
        if (calc == '*') {
            System.out.println(a * b);
        } else if (calc == '/') {
            System.out.println(a / b);
        } else if (calc == '-') {
            System.out.println(a - b);
        } else if (calc == '+') {
            System.out.println(a + b);
        } else {
            System.out.println("Invalid operator!");
        }
    }
}

