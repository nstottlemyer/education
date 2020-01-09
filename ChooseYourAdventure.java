import java.util.Scanner;

public class ChooseYourAdventure {
   
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String room, doNow, internet, task;

    System.out.println("WELCOME TO MR. STOTTLEMYER'S ADVENTURE");
    System.out.println("  ");
    System.out.println("                                  *@@@&@@(@@&@                                 ");
    System.out.println("                        #@&%%#%##&%&&%&&@#@@@%#%                               ");
    System.out.println("                   .%&%&%@%@#%#(#(#/((#@%(##%&(&@(,                            ");
    System.out.println("                   %%%%@####&(@(/*******%@/&%(@&%###%                          ");
    System.out.println("                 (@@#&(%(/#/&(%(***,,,,,,(**(///(###@.                         ");
    System.out.println("                .*////*********,,,,,,,,,,,,,(*%(@%(%(#,                        ");
    System.out.println("                .(************,,,,,,,,,,,,,,,**(///#((#.                       ");
    System.out.println("                @***********,,,,,,,,,,,,,,,,,,,*&/@/&%&*                       ");
    System.out.println("               (************,*,,,*,.,,,,,,,,,,,**/*#@%///                      ");
    System.out.println("          .....************,,,,,,,,,,,,,,,,,,,,,,,(,/*,.                       ");
    System.out.println("  .............//*********,**,,,,,,,,,,,.....,,,.,/...,*,@                     ");
    System.out.println("..............,//*****,****,,,,,,,,,,,........,,,.%*,.@*.*                     ");
    System.out.println("..............&//*********,,,,,,,,,............,,,*@...,,,                     ");
    System.out.println("..............&*/*********,,,,,,,..............,,,,#*%,#,.                     ");
    System.out.println("..............%//********,,,,,,,,,,*,,....,,..,,,,,**,#@*,,#,                  ");
    System.out.println(".............,@//////******(#%@@&%%@(&@/*@,,,,.,..,.,**,,..,**                 ");
    System.out.println("..........,,,,&&@@@&&@**,/#(((((/***,,,,,*,,,.....,,**,,..,,,,                 ");
    System.out.println("......,,,,,,,,,,(@@#%%/,,.,*/(@@@@@&@@@&*,,,,..,,,,,%%,*%/*,**                 ");
    System.out.println(".,,,,,,,,,,,,,,@@#@@*,...,**(##@%(/,,,...,..,,,,,*(%,@*%*,,                    ");
    System.out.println(",,,,,,,,,,,,,,,,,/((##/,......*//**,,,......,,,,,,,%(@,&,,,,                   ");
    System.out.println(",,,,,,,,,,,,,,,,,//((%*,........,,,,,,,,.....,,,*,**%,,,,                      ");
    System.out.println(",,,,,,,,,,,,,,,,,/////*,,,.......,,,,,,,...,,,,,,*%##@#&(*                     ");
    System.out.println(",,,,,,,,,,,,,,,,*////**,/,,,,,,,,,,,,....,,,,,,,**(@&%#.                       ");
    System.out.println(",,,,,,,,,,,,,,,,,@///*,.....,,,,**,,,,,,,,,,*,((%&@#@.                         ");
    System.out.println(",,,,,,,,,,,,,,,**@((((***@@@/*******,,,@,#*,,*/@(#%@@..                        ");
    System.out.println(",,,,,,,,,,,*,****@%(#&@@@#&@@%#@(#***,&*,/,*@@@@@%@@#...                       ");
    System.out.println(",,,,,,,,*********&%@@@@@@@@@@@@@@@&@@//**@*%%(&&&%&@@@**,....                  ");
    System.out.println(",,,**************&@@@@@@@@@@@&@@%&&&%%@@#(%@%#%&%@@@****@.....                 ");
    System.out.println(",***************//@@@@@@@@%%%%%&&@&%%@@&@&@@@&%@@@&@/******@@@@......          ");
    System.out.println("***********/////((%@@@@@%#(#(/(@***/%@@@@@@@@@%@@@@#/***,,@@@@@@@@@....        ");
    System.out.println("*****/////((#@@@@@@@@@@@@##(((//#*/(@@@@@@@@@@@@@@#@****,@@@@@@@@@@@@@&.... .  ");
    System.out.println("*///@@@@@@@@@@@@@@@@@@@@@@&&@@@###@@@@@@@@@@@@@@@##****,@@@@@@@@@@@@@@@@@@.....");
    System.out.println("/(@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@&@@@@@@@&&//**,@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@&@@@@@@@%&@@@%@@@@@@//**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@&@(//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
    System.out.println("  ");

    System.out.println("You walk into Mr. Stottlemyer's classroom. Would you like to 'sit' at your workstation or 'talk' to a friend?");
    System.out.print("> ");
    room = input.next();

    if (room.equalsIgnoreCase("sit")) {
        System.out.println("You log into your workstation. Will you 'answer' the Do Now or 'browse' the internet?");
        } else if (room.equalsIgnoreCase("talk")) {
            System.out.println("  ");
            System.out.println("You were redirected by Mr. Stottlemyer to sit at your workstation. TRY AGAIN");
            return;
        }
        
        System.out.print("> ");
        doNow = input.next();

        if (doNow.equalsIgnoreCase("answer")) {
            System.out.println("You answer the Do Now. Do you continue to CodeHS and pick up where you left off, 'Yes' or 'No'?");
            } else if (doNow.equalsIgnoreCase("browse")) {
                System.out.println("You see a pop-up window advertising free Apple Air Pods. Do you 'click' on the link to claim your free Air Pods or 'continue' browsing?");
                System.out.print("> ");
                internet = input.next();

            if (internet.equalsIgnoreCase("click")) {
                System.out.println("  ");
                System.out.println("You infect your computer with malware. TRY AGAIN.");
                return;
                } else if (internet.equalsIgnoreCase("continue")) {
                    System.out.println("  ");
                    System.out.println("You are redirected by Mr. Stottlemyer to complete the Do Now. TRY AGAIN.");
                    return;
            }
        }
    
        System.out.print("> ");
        task = input.next();

        if (task.equalsIgnoreCase("Yes")) {
            System.out.println("  ");
            System.out.println("You're on task. CONGRATULATIONS!");
            } else if (task.equalsIgnoreCase("No")) {
                System.out.println("  ");
                System.out.println("You are redirected by Mr. Stottlemyer to pick up where you left off in CodeHS. TRY AGAIN.");
                return;
        }
    
    }

}