package Conditionals;

import java.util.Scanner;

public class Perimeterofrec {
    // Perimeter = 2(l + w);
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length: ");
    int length = input.nextInt();
    System.out.println("Enter the Width: ");
    int width = input.nextInt();
    System.out.println(Perimeter(length, width));
    }

    
   public static double Perimeter(int length, int width){
      double ans = 2 * (length + width);
      return ans;
   }
}