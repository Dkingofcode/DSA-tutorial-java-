package Conditionals;

import java.util.Scanner; 

public class Perimeterofcircle {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    int radius = input.nextInt();
    System.out.println(Perimeter(radius));
    // Perimeter = 2piR;
  }

   public static double Perimeter(int rad){
      double ans = 2 * (3.142) * rad;
      return ans;
   }
}