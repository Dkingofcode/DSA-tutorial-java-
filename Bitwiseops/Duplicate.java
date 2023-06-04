package Bitwiseops;

// Given an array of numbers, every number appears twice, only one number occurs once
public class Duplicate {
   public static void main(String[] args) {
    int[] arr = {2, 3, 3, 4, 6, 2, 4};
    System.out.println(ans(arr));
   }    

   private static int ans(int[] arr){
    int Unique = 0;
     for(int n : arr) {
       Unique ^= n; 
     } 
    return Unique;
   }

}
