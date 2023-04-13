import java.util.Scanner;


public class Greeting{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please input your name: ");
    
    String s = input.nextLine();
    System.out.println("Good Morning " + s);  
  }
}