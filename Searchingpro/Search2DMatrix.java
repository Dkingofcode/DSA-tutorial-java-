package Searchingpro;

public class  Search2DMatrix{
public static void main(String[] args) {
int rows = 3; // number of rows in the matrix
int columns = 4; // number of columns in the matrix

// Create a new matrix with the specified number of rows and columns
//int[][] matrix = new int[rows][columns];
int target = 4;
// Initialize the matrix with values
int[][] matrix = {
    {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
 };

 int result = searchMatrix(matrix, target);
 System.out.println("Element found at index: " + result);
 }

 static int searchMatrix(int[][] matrix, int target){
    int rows = matrix.length;
    int columns = matrix[0].length;
    int start = 0;
    int end = rows * columns - 1;

     while(start <= end){
      int mid = (start + end) / 2;
      int midValue = matrix[mid / columns][mid % columns];

      if(midValue == target) {
        return mid;
      } else if(midValue < target){
        start = mid + 1;
      } else{
        end = mid + 1;
      }
     }
  
     return -1;
 
 }

}


/* static int[] search(int[][] matrix, int target){
    int r = 0;
    int c = matrix.length - 1;

    while(r < matrix.length && c >= 0) {
      if(matrix[r][c] == target){
        return new int[]{r, c};
      }
      if (matrix[r][c] < target){
        r++;
      } else {
        c--;
      }
    }
    return new int[]{-1, -1};
} 

*/