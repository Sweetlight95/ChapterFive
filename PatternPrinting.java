package chapter5;

public class PatternPrinting {
    public static void main(String[] args) {
        int n = 5;
        for (int l = 1; l <= n; l++) {
            for (int m = 1; m <= n; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int i = 5;
        for (int l = 1; l <= i; l++) {
            for (int m = 1; m <= l; m++)
                System.out.print("*");
                System.out.println();
        }
        int s = 5;
        for (int l = 1; l <= s; l++) {
            for (int m = l; m <= s; m++)
                System.out.print("*");
                System.out.println();
        }
    }
}