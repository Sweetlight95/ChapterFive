package chapter5;

import chapter4.TabularOutput;

import java.util.Scanner;

public class MenuFunctions {
    public static void main(String[] args) {
        String prompt = """
                  Select a key
                1 -> Phone book
                2 -> Messages
                3 -> Chat 
                4 -> Call register
                5 -> Tones
                6 -> Settings 
                7 -> Call divert
                8 -> Games
                9 -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> SIM services
                """;
        System.out.println(prompt);
        Scanner nokia3310 = new Scanner(System.in);
        int menu = nokia3310.nextInt();
        switch (menu) {
            case 1:
                System.out.println("Phone book");
                String book = """
                          Select a key
                        1 -> Search
                        2 -> Service Nos
                        3 -> Add name
                        4 -> Erase
                        5 -> Edit 
                        6 -> Assign tone
                        7 -> Send b'card
                        8 -> Options
                        9 -> Speed dials
                        10 -> Voice tags
                        """;
                System.out.println(book);
                int phoneBook = nokia3310.nextInt();
                switch (phoneBook) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options");
                        String option = """
                                  Select a key
                                1 -> Type of view
                                2 -> Memory status
                                """;
                        System.out.println(option);
                        int options = nokia3310.nextInt();
                        switch (options) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.println("Memory status");
                                break;
                        }
                        break;
                    case 9:
                        System.out.println("Speed dials");
                        break;
                    case 10:
                        System.out.println("Voice tags");
                        break;
                }
                break;
            case 2:
                System.out.println("Messages");
                String message = """
                          Select a key
                        1 -> Write messages
                        2 -> Inbox
                        3 -> Outbox
                        4 -> Picture messages
                        5 -> Templates
                        6 -> Smileys
                        7 -> Message settings
                        8 -> Info service
                        9 -> Voice mailbox number
                        10 -> Service command editor
                        """;
                System.out.println(message);
                int messages = nokia3310.nextInt();
                switch (messages) {
                    case 1:
                        System.out.println("Write messages");
                        break;
                    case 2:
                        System.out.println("Inbox");
                        break;
                    case 3:
                        System.out.println("Outbox");
                        break;
                    case 4:
                        System.out.println("Picture messages");
                        break;
                    case 5:
                        System.out.println("Templates");
                        break;
                    case 6:
                        System.out.println("Smileys");
                        break;
                    case 7:
                        System.out.println("Message settings");
                        String men = """
                                Select a key
                                1 -> Set
                                2 -> Common
                                """;
                        System.out.println(men);
                        int set = nokia3310.nextInt();
                        switch (set){
                            case 1:
                                System.out.println("Set");
                                String mmm = """
                                         Select a key
                                        1 -> Message centre number 
                                        2 -> Message sent as
                                        3 -> Message validity
                                        """;
                            System.out.println(mmm);
                            int mege = nokia3310.nextInt();
                            switch (mege){
                                case 1:
                                    System.out.println("Message centre number"); break;
                                case 2:
                                    System.out.println("Message sent as"); break;
                                case 3:
                                    System.out.println("Message validity"); break;
                            }break;
                            case 2:
                                System.out.println("Common");
                                String mmm2 = """
                                          Select a key
                                        1 -> Delivery reports
                                        2 -> Reply via same centre
                                        3 -> Character support
                                        """;
                                System.out.println(mmm2);
                                int common = nokia3310.nextInt();
                                switch (common){
                                    case 1:
                                        System.out.println("Delivery reports"); break;
                                    case 2:
                                        System.out.println("Reply via same centre"); break;
                                    case 3:
                                        System.out.println("Character support"); break;
                                }break;
                            case 8:
                                System.out.println("Info service"); break;
                            case 9:
                                System.out.println("Voice mailbox number"); break;
                            case 10:
                                System.out.println("Service command editor"); break;
                        }
                }break;
            case 3:
                System.out.println("Chat"); break;
            case 4:
                System.out.println("Call register");
                String register = """
                        Select a key
                        1 -> Missed calls
                        2 -> Received calls
                        3 -> Dialled numbers
                        4 -> Erase recent call lists
                        5 -> Show call durations
                        6 -> Show call costs
                        7 -> Call cost settings
                        8 -> Prepaid credit
                        """;
                System.out.println(register);
                int callRegister = nokia3310.nextInt();
                switch (callRegister) {
                    case 1:
                        System.out.println("Missed calls"); break;
                    case 2:
                        System.out.println("Received calls"); break;
                    case 3:
                        System.out.println("Dialled numbers"); break;
                    case 4:
                        System.out.println("Erase recent call lists"); break;
                    case 5:
                        System.out.println("Show call durations");
                        String dura = """ 
                                Select a key
                                1 -> Last call duration
                                2 -> All calls' duration
                                3 -> Received calls' duration 
                                4 -> Dialled calls' duration
                                5 -> Clear timers
                                """;
                        System.out.println(dura);
                        int duration = nokia3310.nextInt();
                        switch (duration) {
                            case 1:
                                System.out.println("Last call duration"); break;
                            case 2:
                                System.out.println("All calls' duration"); break;
                            case 3:
                                System.out.println("Received calls' duration"); break;
                            case 4:
                                System.out.println("Dialled calls' duration"); break;
                            case 5:
                                System.out.println("Clear timers");break;
                        }break;
                    case 6:
                        System.out.println("Show call costs");
                        String show = """
                                Select a key
                                1 -> Last call cost
                                2 -> All calls' cost
                                3 -> Clear counters
                                """;
                        System.out.println(show);
                        int showCallCost = nokia3310.nextInt();
                        switch (showCallCost) {
                            case 1:
                                System.out.println("Last call cost"); break;
                            case 2:
                                System.out.println("All calls' cost"); break;
                            case 3:
                                System.out.println("Clear counters");break;
                        }break;
                    case 7:
                        System.out.println("Call cost settings");
                        String callSet = """
                                Select a key 
                                1 -> Call cost limit
                                2 -> Show costs in 
                                """;
                        System.out.println(callSet);
                        int callCostSettings = nokia3310.nextInt();
                        switch (callCostSettings) {
                            case 1:
                                System.out.println("Call cost limit");break;
                            case 2:
                                System.out.println("Show costs in"); break;
                        }break;
                    case 8:
                        System.out.println("Prepaid credit"); break;
                }break;
            case 5:
                System.out.println("Tones");
                String tone  = """
                        Select a key
                        1 -> Ringing tone
                        2 -> Ringing volume 
                        3 -> Incoming call alert 
                        4 -> Composer
                        5 -> Message alert tone
                        6 -> Keypad tones
                        7 -> Warning and game tones
                        8 -> Viberating alert
                        9 -> Screen saver
                        """;
                System.out.println(tone);
                int tones = nokia3310.nextInt();
                switch (tones) {
                    case 1:
                        System.out.println("Ringing tone"); break;
                    case 2:
                        System.out.println("Ringing volume"); break;
                    case 3:
                        System.out.println("Incoming call alert"); break;
                    case 4:
                        System.out.println("Composer"); break;
                    case 5:
                        System.out.println("Message alert tone"); break;
                    case 6:
                        System.out.println("Keypad tones"); break;
                    case 7:
                        System.out.println("Warning and game tones");break;
                    case 8:
                        System.out.println("Vibrating alert"); break;
                    case 9:
                        System.out.println("Screen saver"); break;
                } break;
            case 6:
                System.out.println("Settings");
        }
    }
}

