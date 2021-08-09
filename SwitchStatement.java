package chapter5;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String... args) {
        String prompt = """
                1-> Create Account
                2-> Close Account
                3-> Borrow Nirsal Loan
                4-> Japa with Nirsal Loan
                Press any key
                """;
        System.out.println(prompt);
        Scanner scanner =new Scanner(System.in);
        int userResponse = scanner.nextInt();
        switch (userResponse) {
            case 3:
                System.out.println("5million approved 1k received");
                break;
            case 1:
                System.out.println("Account created");
                break;
            case 2:
                System.out.println("Account close");
                break;
            case 4:
                System.out.println("Japa Japa");
                break;
            default:
                System.out.println("Get sense my man");
                main();
        }
    }
}
