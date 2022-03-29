//Flames Program in JAVA without Multiple Methods

import java.util.Scanner;

public class Flames {

    public static void main(String[] args) {

        // Initialize the Scanner Class
        Scanner input = new Scanner(System.in);

        // Get Input of the FirstName
        System.out.println("Enter Your Name: ");
        String FirstName = input.nextLine();

        // Get Input of the SecondName
        System.out.println("Enter your Partner's Name: ");
        String SecondName = input.nextLine();

        // Store FirstName and SecondName in partners to Dispaly the Combined Names
        String partners = FirstName + " and " + SecondName;

        // Convert the FirstName and SecondName to UpperCase or LoweCase
        FirstName = FirstName.toLowerCase();
        SecondName = SecondName.toLowerCase();

        // Remove the Spaces in the Names
        // Eg: If the Name is Virat Kohli. Remove the Space between Virat and Kohli.
        // That is 'Virat Kohli' -> 'ViratKohli'.
        FirstName = FirstName.replaceAll("\\s", "");
        SecondName = SecondName.replaceAll("\\s", "");

        // Initialize an Array of All 26 Characters
        int[] CharFrequency = new int[26];

        // Iterate to Subset the Indices with the ASCII

        // FirstName Iteration
        for (int index = 0; index < FirstName.length(); index++) {
            CharFrequency[FirstName.charAt(index) - 97]++;
        }

        // SecondName Iteration
        for (int index = 0; index < SecondName.length(); index++) {
            CharFrequency[SecondName.charAt(index) - 97]--;
        }

        // Initilaize the Counter
        int count = 0;

        // Set the Counter it's scope to get the Indices and forward it to Cutter
        for (int index = 0; index < 26; index++) {
            count = count + Math.abs((int) CharFrequency[index]);
        }

        // Create a String with Character FLAMES to provide for Switch Case and Cutter
        String flames = "FLAMES";

        // Flames Finder and the Cutter
        while (flames.length() != 1) {
            int cutter = count % flames.length();
            if (cutter != 0) {
                flames = flames.substring(cutter) + flames.substring(0, cutter - 1);
            } else {
                flames = flames.substring(0, flames.length() - 1);
            }
        }

        // The Important part to give the Output to the User for their Expected FLAMES
        // Get the Unique Character from 'FLAMES' with the flames string after Iteration
        switch (flames.charAt(0)) {
            case 'F':
                System.out.println(
                        partners + " are 'Friends'. You're Dead Dude. You're Locked inside Friendizone with your Parter.");
                break;
            case 'L':
                System.out.println(partners + " are 'Lovers'. You're Lucky Dude <3.");
                break;
            case 'A':
                System.out.println(partners + " will have some 'Affection' on Eachother. Hmm....");
                break;
            case 'M':
                System.out.println(partners + " are going to 'Married' soon. Hell Man!! Happy Married Life <3.");
                break;
            case 'E':
                System.out.println(partners + " are 'Enemies'.. Hm find someone who suits your Vibe ;)");
                break;
            case 'S':
                System.out.println(partners
                        + " are 'Siblings'.. This is the Saddest Part dude. Get your Sister/Brother some Chocolates :)");
                break;
            default:
                System.out.println(
                        partners + " sorry dude.. your kindof Relation is something bigger, I can't predict it :( ");
        }

    }

}
