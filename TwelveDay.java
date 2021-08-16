package chapter5;

import java.util.Scanner;

public class TwelveDay {
        public static void main(String[] args) {
            Scanner song = new Scanner(System.in);
            System.out.println("Enter a number of your choice");
            int number = song.nextInt();
            String songLyrics = "";
            String daysOfChristmas = "";
            String lyrics = "";
            int count = 1;
            number = 12;
            while (count <= number) {
                switch (count) {
                    case 1 -> daysOfChristmas = "First";
                    case 2 -> daysOfChristmas = "Second";
                    case 3 -> daysOfChristmas = "Third";
                    case 4 -> daysOfChristmas = "Fourth";
                    case 5 -> daysOfChristmas = "Fifth";
                    case 6 -> daysOfChristmas = "Sixth";
                    case 7 -> daysOfChristmas = "Seventh";
                    case 8 -> daysOfChristmas = "Eighth";
                    case 9 -> daysOfChristmas = "Ninth";
                    case 10 -> daysOfChristmas = "Tenth";
                    case 11 -> daysOfChristmas = "Eleventh";
                    case 12 -> daysOfChristmas = "Twelfth";
                }
                switch (count) {
                    case 1: lyrics = "And a partridge in a pear tree.\n"; break;
                    case 2: lyrics = "\nTwo turtle doves, \nAnd " + lyrics; break;
                    case 3: lyrics = "\nThree French hens," + lyrics; break;
                    case 4: lyrics = "\nFour calling birds," + lyrics; break;
                    case 5: lyrics = "\nFive golden rings," + lyrics; break;
                    case 6: lyrics = "\nSix geese a-laying," + lyrics; break;
                    case 7: lyrics = "\nSeven swans a-swimming," + lyrics; break;
                    case 8: lyrics = "\nEight maids a-milking," + lyrics; break;
                    case 9: lyrics = "\nNine ladies dancing," + lyrics; break;
                    case 10: lyrics = "\nTen lords a-leaping," + lyrics; break;
                    case 11: lyrics = "\nEleven pipers piping," + lyrics; break;
                    case 12: lyrics = "\nTwelve drummers drumming," + lyrics; break;

                }
                songLyrics = "\nOn the " + daysOfChristmas + " day of Christmas\n My true love gave to me: " + lyrics;
                count++;
            }
            System.out.println(songLyrics);
            System.exit(count);
        }
}











