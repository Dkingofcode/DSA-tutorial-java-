package Conditionals;

import java.util.Scanner;

public class CSAofcylinder {
    // curved surface area = 2 * pi * R * h
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the radius");
     int radius = input.nextInt();
     System.out.println("Enter the height");
     int height = input.nextInt();
     System.out.println(Area(radius, height));
   }    

   public static double Area(int r, int h){
    double ans = 2 * (3.14159) * r * h;
    return ans;
   }
}

