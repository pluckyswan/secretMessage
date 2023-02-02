/*
 * Made by Bella Quintero for Katherine Molina
 * An attempt to made an incredibly easy-peasy, super underwhelming, single-step puzzle.
 * Please do not look at Mission file as it contains spoilers
 * Have fun!
 */
import java.util.Scanner;
public class hub {
    public static void main(String[] args) {
        Mission yourMission = new Mission();
        Scanner reader = new Scanner(System.in);
        String name = "";
        boolean crackedIt = false;
        String answer = "";
        int failedAttempts = -1;
        System.out.print("Please enter your name, Agent: ");
        name = reader.nextLine();
        System.out.print("Welcome Agent " + name + ". ");
        System.out.print(
                "You have a new assignment available. Please read the briefing below: \n" + yourMission.getBriefing() + " ");
        System.out.println("Secret message: " + yourMission.getCodeWord());
        System.out.println("Loading menu...");
        while (!crackedIt) {
            System.out.println(
                    "\t\t\tMenu\n0. View briefing:\n1. View objective:\n2. View message:\n3. Solve code:\n4. Ask for hint:\n5. Display unlocked hints:");
            answer = reader.nextLine();
            if (answer.equalsIgnoreCase("0")) {
                System.out.println(yourMission.getBriefing());
            } else if (answer.equalsIgnoreCase("1")) {
                System.out.println(yourMission.getMissionStatement());
            } else if (answer.equalsIgnoreCase("2")) {
                System.out.println(yourMission.getCodeWord());
            } else if (answer.equalsIgnoreCase("3")) {
                crackedIt = yourMission.checkAnswer(reader.nextLine());
                failedAttempts++;
            } else if (answer.equalsIgnoreCase("4")) {
                yourMission.displayHint(failedAttempts);
            }
            else if (answer.equalsIgnoreCase("5")) {
                yourMission.displayMyHints(failedAttempts);
            }
        }
        System.out.println("You've cracked it! Please accept your reward, Agent " + name);
        yourMission.getReward();
        reader.close();
    }
}