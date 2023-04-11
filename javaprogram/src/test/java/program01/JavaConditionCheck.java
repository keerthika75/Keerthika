package program01;

import javax.annotation.Signed;
import java.util.Optional;
import java.util.Scanner;

public class JavaConditionCheck {
    public static void main(String[] args) {
 //  Scanner scanner = new Scanner(System.in);
//        System.out.println("enter the roles");
//        String roles = value.next();
//        System.out.println(roles);
//        System.out.println("enter the days");
//        int days = value.nextInt();
//        System.out.println(days);
//        int manager = 500;
//        int clerk = 400;
//        int staff = 300;
//        if (roles.equalsIgnoreCase("manager")) {
//            int manager1 = days * manager;
//            System.out.println(manager1);
//        } else if (roles.equalsIgnoreCase("clerk")) {
//            int clerk2 = days * clerk;
//            System.out.println(clerk2);
//        }
//        else if (roles.equalsIgnoreCase("staff")){
//            int staff3 = days * staff;
//            System.out.println(staff3);
//        }
//
//        else{
//            System.out.println("invalid pass");

//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the opreators");
        String opreators = scanner.next();
        System.out.println(opreators);
        int value = scanner.nextInt();
        int value1 = scanner.nextInt();
        switch (opreators.toLowerCase()) {
            case "+":
                int additional = value + value1 ;
                System.out.println(additional);
                break;
            case "-":
                if (value1 < value) {
                    int subtraction = value - value1 ;
                    System.out.println(subtraction);
                }
                else {
                    System.out.println("it is false");
                }break;
            case "*":
                int multiple = value * value1;
                System.out.println(multiple);
                break;
            case "/":
                if (value1>0) {
                    int division = value / value1;
                    System.out.println(division);
                }
                else {
                    System.out.println("cannot divided 0 values");
                }
                    break;
                default:
                    throw new IllegalArgumentException();

        }
    }









    }








//        Scanner output = new Scanner(System.in);
//        System.out.println("Enter the value");
//        int firstValue = output.nextInt();
//        if (firstValue > 30) {
//            int conditionOne = firstValue * 5;
//            System.out.println(conditionOne);
//        }
//        else if (firstValue < 30) {
//            double conditionTwo = firstValue * 2.5;
//
//            System.out.println(conditionTwo);
//        }
//        else {
//            System.out.println("both conditions are all faild");
//        }



















































