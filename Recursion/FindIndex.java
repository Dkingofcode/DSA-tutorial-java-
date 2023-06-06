package Recursion;

import java.util.ArrayList;

public class FindIndex {
    public static void main(String[] args) {
     int[]  arr = {2, 3, 4,5, 6, 4, 7};
      System.out.print(findAllIndex2(arr, 5, 0));  
    }


    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
       
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }

        // this will contain answer for that function call only
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index);
           
        list.addAll(ansFromBelowCalls);
         
        return list;
    }
}
