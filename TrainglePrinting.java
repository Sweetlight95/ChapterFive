package chapter5;

public class TrainglePrinting {
    public static void main(String[] args) {
//        int count;
//        for (count = 1; count <= 10; count++) {
//            for (int count2 = 1; count2 < count + 1; count2++)
//                System.out.print('*');
//                System.out.println();
//        }
//        System.out.println(' ');
//        int star;
//        for(star = 1; star <= 10; star++){
//           for (int star2 = 10;  star <= star2; star2--)
//            System.out.print('*');
//            System.out.println();
//        }

        for(int i=1; i<=10; i++){
            for(int j=1; j<=i; j++){
                System.out.println("*");
            }
            System.out.println("");
        }


    }
}