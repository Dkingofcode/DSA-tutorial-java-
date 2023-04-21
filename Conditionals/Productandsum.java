package Conditionals;

import java.util.Scanner;

public class Productandsum {

        public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int firstNum = input.nextInt();
        System.out.println("Enter the Second Number: ");
        int secondNum  = input.nextInt();
        System.out.println(Calculation(firstNum, secondNum));
        }
    
        
       public static double Calculation(int first, int second){
          double ans = (first * second) - (first + second);
          return ans;
       }
    }

