package chapter5;

public class PriceCopy {
    private int amount
            ;

    public int calculatePrice(int copies) {
        if(copies >= 1 && copies <= 4){
            amount = 1500 * copies;
        }
        if(copies >= 5 && copies <= 7){
            amount = 1400 * copies;
        }
        if(copies >= 10 && copies <= 29){
            amount = 1200 * copies;
        }
        if(copies >= 30 && copies <= 39){
            amount = 1100 * copies;
        }
        if(copies >= 50 && copies <= 99){
            amount = 1000 * copies;
        }
        if(copies >= 100 && copies <= 199){
            amount = 900 * copies;
        }
        if (copies >= 200) {
            amount = 800 * copies;
        }
        return amount;
    }
}