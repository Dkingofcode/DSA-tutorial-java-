  // TotalSurfacearea = 6a^2
package Conditionals;

import java.util.Scanner;

public class TotSurfarea {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length of one side: ");
    int lengthofside = input.nextInt();
    System.out.println(Volume(lengthofside));
    }

    
   public static double Volume(int lengthofside){
      double ans = 6 * Math.pow(lengthofside, 2);
      return ans;
   }
}

