package chapter5;

public class DiamondPrintingProgram {
    public static void main(String[] args) {
        for(int count = 1; count <= 5; count ++) {
            for(int counter = 1; counter < count + 1; counter++)
            System.out.print('*');
            System.out.println();
        }
    }

}
