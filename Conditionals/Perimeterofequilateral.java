package Conditionals;

import java.util.Scanner;

public class Perimeterofequilateral {
    // Perimeter = 3* side;
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of side: ");
    int side = input.nextInt();
    System.out.println(Perimeter(side));
    }

    
   public static double Perimeter(int sidelength){
      double ans = 3 * sidelength;
      return ans;
   }
}
