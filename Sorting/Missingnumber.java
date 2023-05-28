package Sorting;

import java.util.Arrays;

 class Missingnumber{
    public static void main(String[] args){
        int[] arr = {0, 1, 2, 3, 5, 6,};
        //sort(arr);
        System.out.println(missingNumber(arr));
    }

   public static int missingNumber(int[] arr){
      int i = 0;
      while(i < arr.length){
        int correct = arr[i];
        if(arr[i] < arr.length && arr[i] != arr[correct]){
             swap(arr, i, correct);
        } else {
           i++;    
        }
      }
      return i; 
          
    }



    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
 }