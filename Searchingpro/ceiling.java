package Searchingpro;

public class ceiling {
    public static void main (String[] args){
        // return the index
        // return -1 if it does not exist
        int[] arr = {2, 3,4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(arr, 10));
     }
 
        public static int binarySearch(int[] array, int target){
         // if the greatest number in the array is less than the target.     
          if(target > array[array.length - 1]){
            return -1;
          }


         int start = 0;
         int end = array.length - 1;
 
         while(start <= end){
            // find the middle element
          //  int mid = (start + end) / 2; // this may exceed the int range.
            int mid = start + (end - start) / 2; 
            
           if(target < array[mid]){
             end = mid - 1;
           } else if (target > array[mid]){
             start = mid + 1;
           } else {
             // ans found
               return mid;
           }
         }
           return start;
        }  
     }
 

