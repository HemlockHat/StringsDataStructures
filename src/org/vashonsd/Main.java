package org.vashonsd;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please feed me a word!");
        String word = input.nextLine();

        System.out.println("I also need a letter!");
        char whichLetter = input.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            char thisChar = word.charAt(i);
            if (thisChar == whichLetter) {
                // we have found the character!
                count++;
            }
        }
        System.out.println("you gave me " + count + " correct letters, thank you!");
    }
}
// Ask the user for a word and a character, then print how many times that character appears in the word.