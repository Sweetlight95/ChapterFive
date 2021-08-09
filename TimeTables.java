package chapter5;

import java.sql.SQLOutput;

public class TimeTables {
    public static void main(String[] args) {
        for(int count = 1; count<= 12; count++){
            for(int counter = 1; counter <= 12; counter++)
                System.out.print(count * counter + "\t");
                System.out.println();
        }
    }
}
