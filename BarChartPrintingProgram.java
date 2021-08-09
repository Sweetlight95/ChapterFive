package chapter5;

import java.util.Scanner;

public class BarChartPrintingProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
//        while(number1 >= 1 &&  number1 <= 30 == false){
//                }
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
//        while(number2 >= 1 &&  number2 <= 30 == false){
//        }
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();
//        while(number3 >= 1 &&  number3 <= 30 == false){
//        }
        System.out.println("Enter fourth number: ");
        int number4 = input.nextInt();
//        while(number4 >= 1 &&  number4 <= 30 == false){
//        }
        System.out.println("Enter fifth number: ");
        int number5 = input.nextInt();
//        while(number5 >= 1 &&  number5 <= 30 == false){
//        }

        for (int count = 1; count <= number1; count++) {
                System.out.print("*");
        }
        System.out.println();

        for (int count = 1; count <= number2; count++) {
            System.out.print("*");
        }
        System.out.println();

        for (int count = 1; count <= number3; count++) {
            System.out.print("*");
        }
        System.out.println();

        for (int count = 1; count <= number4; count++) {
            System.out.print("*");
        }
        System.out.println();
        for (int count = 1; count <= number5; count++) {
            System.out.print("*");
        }
    }
}
