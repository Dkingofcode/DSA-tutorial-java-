import java.util.Scanner;


public class SI {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Please write the Principal amount: ");
        System.out.println("Time: ");
        System.out.println("Rate: ");
        double num = input.nextDouble(); 
        double time = input.nextDouble();
        double rate = input.nextDouble();

        double result = (num * time * rate) / 100;
        System.out.println("Simple Interest = " + result);
    }
}