import java.util.Scanner;


public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("please enter first input: ");
          int a = input.nextInt();
        System.out.println("Please input second number is:");
          int b = input.nextInt();
        
          if(a > b){
            System.out.println("Largest number is " + a);
          }else{
            System.out.println("Largest number is " + b);
          }
 }
}