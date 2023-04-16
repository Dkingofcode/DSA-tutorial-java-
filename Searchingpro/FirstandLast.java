package Searchingpro;

import java.util.Arrays;

public class FirstandLast {
    public static void main(String[] args) {
       int nums[] = {5,7,7,8,8,10}; 
       int target = 8;
       int[] result = searchRange(nums, target);
       System.out.println(Arrays.toString(result));
    }   
    
    public static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        // check for first occurence if target first
        ans[0] =  Search(nums, target, true);
        if(ans[0] != -1){
            ans[1] = Search(nums, target, false);
        }
         
        return ans;
    }

       static int Search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;
        while(start <= end){
            //find the middle element
         int mid = start + (end - start) / 2;
         
         if(target < nums[mid]){
            end = mid - 1;
         } else if(target > nums[mid]){
              start = mid + 1;
         }else{
           // potential ans found
             ans = mid;
           if(findStartIndex == true){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
          }
        }
        return ans;
    }
}

