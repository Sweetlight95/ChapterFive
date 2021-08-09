package chapter5;

import java.util.Scanner;

public class PrimeNumber {
    //Ask the user to give a number
    //the user gives a number
    //print its a prime number
    //else its not a prime number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a prime number: ");
        int prime = input.nextInt();
      for (int number = 0; number != 0; number++) {
            if(prime % number == 0) {
                System.out.println("It's a prime number");
            }
            else{System.out.println("It's not a prime number");}

      }
    }
}
