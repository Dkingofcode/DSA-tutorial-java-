package Conditionals;

import java.util.Scanner;

public class AreaofEquilateral {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length: ");
    int len = input.nextInt();
    System.out.println(Area(len));
  }    

  public static double Area(int length){
    double ans =  (0.4330) * Math.pow(length, 2);
    return ans;
  }
}
