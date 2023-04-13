import java.util.Scanner;


public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         System.out.print("please enter a word: ");
        String word = input.nextLine().toLowerCase();
 
         if(isPalindrome(word)){
            System.out.println(word + " is a Palindrome");
            System.out.println(word.charAt(3));
         }else{
            System.out.println(word + " is not a Palindrome");
            System.out.println(word.charAt(3)); 
        }

         input.close();
         }

      public static boolean isPalindrome(String str){
        int i = 0;
        int j = str.length() - 1;

        while(i < j){
           if(str.charAt(i) != str.charAt(j)){
               return false;
           } 
           i++;
           j--;
        }

        return true;
      }   
}


