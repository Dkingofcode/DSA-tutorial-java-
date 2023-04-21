package Conditionals;
      
import java.util.Scanner;

public class maxfrominput  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int num;
        do {
            System.out.print("Enter a number (enter 0 to stop): ");
            num = input.nextInt();
            if(num > max){
                max = num;
            }
        } while (num != 0);
        System.out.println("The max of the numbers is " + max);
    }
}
