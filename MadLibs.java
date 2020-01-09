import java.util.Scanner;

public class MadLibs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter adjective: ");
        String adjective = input.nextLine();
        
        System.out.print("Enter noun: ");
        String noun = input.nextLine();
        
        System.out.print("Enter verb: ");
        String verb = input.nextLine();
        
        System.out.println("Mr. Stottlemyer is the " + adjective + " teacher.");
        System.out.println("He teaches " + noun + ".");
        System.out.println("I " + verb + " to his classroom every day!");
    }
}