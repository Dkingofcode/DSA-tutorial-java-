package Conditionals;

import java.util.Scanner;

public class Volumeofsphere {
    // Volume = 4/3 * pi * r^3;
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    int radius = input.nextInt();
    System.out.println("Enter the height: ");
    int height = input.nextInt();
    System.out.println(Volume(radius, height));
    }

    
   public static double Volume(int radius, int height){
      double ans = (1.33333) * (3.14159) * Math.pow(radius, 3);
      return ans;
   }
}