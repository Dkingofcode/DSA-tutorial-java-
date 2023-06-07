package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
     int[] arr = {5,6,7,8,3,2,1};
     sort(arr, 0, arr.length - 1);
     System.out.println(Arrays.toString(arr));        
    }

    static void sort(int[] nums, int low, int high){
      if(low >= high){ 
         return;
      }



      int mid = low + (high - low) / 2;
      int start = low;
      int end = high; 
      int pivot = nums[mid];

      while(start <= end){
        while(nums[start] < pivot){
            start++;
        }
        while(nums[end] > pivot){
            end--;
        }

        if(start <= end){
           int temp = nums[start];
           nums[start] = nums[end];
           nums[end] = temp;
            start++;
            end--;
        }
      }

      // now my pivot is at correct index, please sort two halves now
      sort(nums, low, end);
      sort(nums, start, high);
    }
}
