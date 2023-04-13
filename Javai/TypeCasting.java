package Javai;
import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
     //  float num = input.nextFloat();
     // int num = input.nextInt();
     //  System.out.println(num);
     
     //type casting
     int num = (int)(67.56f);
     System.out.println(num);

     // automatic type promotion in expression
      // int a = 257;
      // byte b = (byte)(a); // 257 % 256 = 1

      byte a = 40;
      byte b = 50;
      byte c = 100;
      int d = a + b / c;

      System.out.println(d);

      //byte b = 50;
      //b = b * 2;

      int number = 'A';
      System.out.println(number);


      // TYPE PROMOTION RULES
      // All the byte, short and character values are promoted to integer
      // If any of the operation is long, float, double the entire operation will be converted to it

      byte t = 43;
      char g = 'E';
      short s = 1024;
      int e = 50000;
      float f = 5.6234f;
      double l = 0.1234;
      //double result = ()
    }
}
