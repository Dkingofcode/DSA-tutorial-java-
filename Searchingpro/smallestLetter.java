package Searchingpro;

public class smallestLetter {
    public static void main (String[] args){
        // return the index
        // return -1 if it does not exist
        char[] letters = {'a', 'e', 'd', 'g'};
        System.out.println(nextGreatestletter(letters,  'z'));
     }
 
        public static char nextGreatestletter(char[] letters, char target){
         // if the greatest number in the array is less than the target.     
        //   if(target > letters[letters.length - 1]){
        //     return -1;
        //   }

         int start = 0;
         int end = letters.length - 1;
 
         while(start <= end){
            // find the middle element
          //  int mid = (start + end) / 2; // this may exceed the int range.
            int mid = start + (end - start) / 2; 
            
           if(target < letters[mid]){
             end = mid - 1;
           } else{
             start = mid + 1;
         }
        }
        return letters[start % letters.length];  
      } 
     }
