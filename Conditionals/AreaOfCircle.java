package Conditionals;

import java.util.Scanner;

public class AreaOfCircle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println(" Please input radius ");
    int area = 0;
    // Area :  pi*radius^2 ; 
    int radius = input.nextInt();
     System.out.println(Area(radius));
  }  
  
  public static double Area(int rad){
   double ans  = (3.142) * Math.pow(rad, 2);
    return ans; 
 }
}
