import java.util.Scanner;


public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("please enter start input: ");
        int start = input.nextInt();
        System.out.println("Please enter end input: ");
        int end = input.nextInt();

        System.out.println("Armstrong numbers between " + start + " and" + end + " are: ");
        for(int i = start; i <= end; i++){
            int numDigits = (int) (Math.log10(i) + 1);
            int sum = 0; 
            int temp = i;
            while (temp != 0){
              int digit = temp % 10;
              sum += Math.pow(digit, numDigits);
              temp /= 10;  
            }
            if(sum == i){
               System.out.println(i); 
            }
        }
        input.close();
     }
  }