package Conditionals;

import java.util.Scanner;

public class Volumeofcone {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the radius");
     int radius = input.nextInt();
     System.out.println("Enter the height");
     int height = input.nextInt();
     System.out.println(Area(radius, height));
   }    

   public static double Area(int r, int h){
    double ans = (0.33333) * (3.14159) * Math.pow(r, 2) * h;
    return ans;
   }
}


