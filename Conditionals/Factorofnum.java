package Conditionals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Factorofnum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int radius = input.nextInt();
        List<Integer> factors = getFactors(radius);
        System.out.println("Factors of " + radius + ": " + factors);
    }

    public static List<Integer> getFactors(int radius){
        List<Integer> factors = new ArrayList<>();
        for(int i = 1; i <= radius; i++){
            if(radius % i == 0){
                factors.add(i);
            }
        }
        return factors;
    }
}
