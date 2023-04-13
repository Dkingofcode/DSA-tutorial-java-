package Conditionals;

import java.util.Scanner;

public class AreaofRhombus {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the base: ");
    int diag1 = input.nextInt();
    System.out.println("Enter the height: ");
    int diag2 = input.nextInt();
    System.out.println(Area(diag1, diag2));
  }

  public static int Area(int firstdiagonal, int seconddiagonal){ 
        int ans = firstdiagonal * seconddiagonal;
        return ans;
   }
 }