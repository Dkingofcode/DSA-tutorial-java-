package Recursion;

public class Fibo {
   public static void main(String[] args) {
     System.out.println(findFib(9));
   }    


   static int findFib(int n){
     if(n == 0){
        return 0;
     }
     if(n == 1){
        return 1;
     }else {
        return findFib(n-1) + findFib(n -2);
     }
   }
}
