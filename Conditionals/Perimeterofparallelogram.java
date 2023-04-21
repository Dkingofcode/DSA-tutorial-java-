package Conditionals;

import java.util.Scanner;

public class Perimeterofparallelogram {
    // Perimeter = 2(a + b);
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of longer side: ");
    int length = input.nextInt();
    System.out.println("Enter the length of shorter side: ");
    int width = input.nextInt();
    System.out.println(Perimeter(length, width));
    }

    
   public static double Perimeter(int length, int width){
      double ans = 2 * (length + width);
      return ans;
   }
}
