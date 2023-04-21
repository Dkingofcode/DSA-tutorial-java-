package Conditionals;

import java.util.Scanner;

public class PerimeterofRhom {
    // Perimeter = 4 * l;
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of one side: ");
    int length = input.nextInt();
    System.out.println(Perimeter(length));
    }

    
   public static double Perimeter(int length){
      double ans = 4 * (length);
      return ans;
   }
}
