package chapter5;

public class Kata {
   // private int factor = 1;

    public int calculateFactorialOf(int i) {
        //factor = factor (factor - 1);
        // factor = factor * 2 * i;
       // for (int number = 1; number < 3; number++) {
            //   System.out.println(factor);
            //}
            int number = i;
            int factorial = 1;
            while(number != 0){
                factorial = factorial * number;
                number--;
            }
            return factorial;
        }

        public int calculateSquareOf ( int i){
            return i * i;
        }
    }
//if (number >= 1 && number <=4){
// price = 1500
// totalPrice = price * number;
// }
//    public int calculatePrice(int i) {
//        int amount = 1500;
//        if(amount == i){
//   amount = amount * i;

//        }
//        return amount;
//    }
/*user input number of items
display says the total price
if user types between 1 and 4, price per copy is 1500
if user enter 5
 */