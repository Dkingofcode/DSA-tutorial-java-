package Conditionals;

import java.util.Scanner;

public class Areaofparallelogram {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base: ");
    int base = input.nextInt();
    System.out.println("Enter the height: ");
    int height = input.nextInt();
    System.out.println(Area(base, height));         
  }

    public static int Area(int b, int h){
      int ans = b * h;
      return ans;  
    } 
}
