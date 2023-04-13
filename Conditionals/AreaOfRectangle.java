package Conditionals;

import java.util.Scanner;

public class AreaOfRectangle {
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the length");
     int length = input.nextInt();
     System.out.println("Enter the breadth");
     int breadth = input.nextInt();
     System.out.println(Area(length, breadth));
   }    

   public static int Area(int l, int b){
    int ans = l * b;
    return ans;
   }
}







