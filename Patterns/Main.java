package Patterns;

public class Main{
    public static void main(String[] args) {
      //pattern1(4);  
     // pattern2(5);
    //  pattern3(4);
      pattern4(5);
      pattern5(5);
    }

    static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            // for every row, run the col
            for (int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            // when one row is printed, we need to add a newline.
            System.out.println();
        }
    }


    static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            // for every row, run the col
           for(int col = 1; col <= n; col++){
               System.out.print("*");
           }
        System.out.println();
    }
}

    static void pattern3(int n){
        for(int row = 1; row <= n; row++){
           for(int col = n + 1 - row; col >= 1 ; col--){
             System.out.print("*");
           } 
           System.out.println();
        }
    }

    static void pattern4(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern5(int n){

        for(int row = 0; row < 2 * n; row++){
            int totalCols = row > n ? 2 * n - row: row;
           for(int col = 0; col < totalCols; col++){
             System.out.print("*");
           } 
           System.out.println();
        }
    }
    
}

