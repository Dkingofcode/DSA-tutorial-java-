package Conditionals;

import java.util.Scanner;

public class Sumofinputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            num = input.nextInt();
            sum += num;
        } while (num != 0);
        System.out.println("The sum of the numbers is " + sum);
    }
}
