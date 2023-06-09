package Patterns;

public class Main{
    public static void main(String[] args) {
      //pattern1(4);  
     // pattern2(5);
    //  pattern3(4);
    //  pattern4(5);
     // pattern5(5);
     // pattern6(5);
     // pattern7(5);
     // pattern8(10);
      pattern28(5);
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
    
    static void pattern6(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print("*     ");
           } 
           System.out.println();
        }
    }

    static void pattern7(int n){
        for(int row = 1; row <= n; row++){
           for(int col = n; col >= row; col--){
             System.out.print("*");
           } 
           System.out.println();
        }
    }


    static void pattern8(int n){
        for(int row = 1; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print("  *  ");
           } 
           System.out.println();
        }
    }

    static void pattern9(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern10(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern11(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern12(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern13(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern14(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern15(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern16(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern17(int n){
        for(int row = 0; row <= 2 * n; row++){
            
            int c = row > n ? 2 * n - row: row;

         for(int space = 0; space < n - c; space++){
            System.out.print(" ");
         }

           for(int col = c; col >= 1; col--){
             System.out.print(col + " ");
           } 
           for(int col = 2; col <= c; col++){
            System.out.print(col + " ");
           }
           System.out.println();
        }
    }



    static void pattern18(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern19(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern20(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern21(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern22(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern23(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern24(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern25(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }

    static void pattern26(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern27(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern28(int n){
        for(int row = 0; row < 2 * n; row++){
          int ColsinRow  = row > n ? 2 * n - row: row;

          int noOfSpace = n - ColsinRow;
          for (int s = 0; s < noOfSpace; s++){
            System.out.print(" ");
          }

           for(int col = 0; col <  ColsinRow; col++){
             System.out.print("* ");
           } 
           System.out.println();
        }
    }


    static void pattern29(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern30(int n){
        for(int row = 1; row <= n; row++){

            for(int space = 0; space < n - row; space++){
               System.out.print(" ");
            }

           for(int col = row; col >= 1; col--){
             System.out.print(col);
           } 
           for(int col = 2; col <= row; col++){
            System.out.print(col);
           }
           System.out.println();
        }
    }


    static void pattern31(int n){
        for(int row = 0; row <= 2 * n - 1; row++){
           for(int col = 0; col < 2 * n - 1; col++){
            
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern32(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern33(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern34(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }


    static void pattern35(int n){
        for(int row = 0; row <= n; row++){
           for(int col = 1; col <= row; col++){
             System.out.print(col);
           } 
           System.out.println();
        }
    }
    

}

