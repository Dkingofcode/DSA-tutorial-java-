package Conditionals;

import java.util.Scanner;

public class VolumeofCylin {
    // Volume = pi * r^2 * h;
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius: ");
    int radius = input.nextInt();
    System.out.println("Enter the height: ");
    int height = input.nextInt();
    System.out.println(Volume(radius, height));
    }

    
   public static double Volume(int radius, int height){
      double ans = (3.14159) * Math.pow(radius, 2) * (height);
      return ans;
   }
}