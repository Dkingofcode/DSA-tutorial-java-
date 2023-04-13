package Conditionals;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base = input.nextInt();
        System.out.println("Enter the height: ");
        int height = input.nextInt();
        System.out.println(Area(base, height));
    }

    public static int Area(int base, int height) {
        int ans = (int) (0.5 * base * height);
        return ans;
    }
}
