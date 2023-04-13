
import java.util.Scanner;


public class currconverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter amount: ");
        double indiacurr = input.nextDouble();
        double usd = indiacurr * 0.012 ;
        System.out.println("Your money in dollars is" + usd);
        
 }
}
