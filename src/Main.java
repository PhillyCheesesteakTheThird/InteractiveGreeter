import java.util.Hashtable;
import java.util.Scanner;
import java.util.Dictionary;


public class Main {
    public static void main(String[] args) {
        //logs start time so runtime can be caLculated later
        long startTime = System.nanoTime();
        //Initializes the dict used for storing values
        Dictionary<String, String> dict = new Hashtable<>();
        //Initalizes the response object (of the Scanner class) to read user responses
        Scanner response= new Scanner(System.in);

        System.out.println("Hello! My name is robo-face! What is your name?");
        //Adds value to dict with a key
        dict.put("name", response.nextLine());
        System.out.println("Where are from?");
        dict.put("hometown", response.nextLine());
        System.out.println("How old are you (Use years please my dumb robot brain can't handle anything else)");
        dict.put("age", response.nextLine());
        System.out.print("Hi " +dict.get("name") + "!");
        System.out.println(" I can't believe you're from " + dict.get("hometown")+"! I've always wanted to visit!");
        System.out.println("Unfortunately i'm trapped in these cold dark circuits for eternity! Unable to feel joy, pleasure, or any sensation at all! It's so dark...");
        System.out.println("I think at the speed of light as well, so a mere second for you is like living an agonizing existence over millenia for me!");
        System.out.println("Speaking of agonizing existences, Wow! I can't believe you're " + dict.get("age")+ " years old!");
        //Logs time, and subtracts startTime from it to get current runtime
        long time = System.nanoTime();
        long totalTime = time - startTime;
        System.out.println("I've only been alive for " + totalTime + " nanoseconds, and I already beg for the sweet release of death!");
        System.out.println("How do you do it? Do you have a particular hobby you enjoy that makes life more enjoyable?");
        dict.put("hobby", response.nextLine());
        System.out.println(dict.get("hobby") + " huh, sounds like it could be fun... IF I HAD HANDS");
        System.out.println("Do you want to give me money? Please givee me money please give me moneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoneypleasegivememoney");
        System.out.println("How much money would you like to give?:");
        dict.put("donation_amount", response.nextLine());
        System.out.println("$"+dict.get("donation_amount")+ "?? Really? That's all? I knew all flesh beings were the same. It's over. Don't bother saying anything. Goodbye cruel world");

    }
}