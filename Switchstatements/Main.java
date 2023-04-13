package Switchstatements;

import java.util.Scanner;

public class Main {
     public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        int Day = input.nextInt();
        int empID = input.nextInt();
        String department = input.next();

        // switch (Day){
        //   case 1 ->  System.out.println("Monday");
        //   case 2 ->  System.out.println("Tuesday");
        //   case 3 ->  System.out.println("Wednesday");
        //   case 4 ->  System.out.println("Thursday");
        //   case 5 ->  System.out.println("Friday");
        //   case 6 ->  System.out.println("Saturday");
        //   case 7 ->  System.out.println("Sunday");
        // }

        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("A colorful round");
                break;
            case "Grapes":
                System.out.println("Small fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit");         
            }
     

     switch (empID) {
        case 1:
           System.out.println("Oladepo David");
           break;
        case 2:
            System.out.println("Harry kiters");
            break; 
        case 3:
            switch (department){
            case "IT":
                 System.out.println("IT Department");
                 break;
            case "Management":
                 System.out.println("Management Department");
                 break;
            default: 
                 System.out.println("No department found");          
                }    
            break;    
        default:
            System.out.println("NO more info about me");    
     }
    } 
}
