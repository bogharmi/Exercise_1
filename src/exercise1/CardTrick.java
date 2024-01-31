package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 * @author Mitansu Kamleshbhai Boghara 
 */

/**
 * --------- I am done! ------------
*/

import java.util.Random;
import java.util.Scanner;

public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        Random random = new Random();

        for (int x = 0; x < hand.length; x++) {
            Card card = new Card();
            card.setValue(random.nextInt(13) + 1); 
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            hand[x] = card;
        }

        // Prompt the user for a guess
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the card value anyone that you wantto guess between 1 to 14: ");
        int gValue = userInput.nextInt();
        System.out.print("Enter the card suit anyone that you want to guess between 1 to 4: ");
        int gSuit = userInput.nextInt();

   
        for (Card card : hand) {
            if(card.getValue() == gValue && card.getSuit().equals(Card.SUITS[gSuit - 1])){    
                printInfo(); 
                return;
            }  
        }
         System.out.println("Sorry, Try again :)");
    }

    private static void printInfo(){
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Mitansu Boghara, but you can call me Mito.");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Learning");
        System.out.println("-- Gaming");
        System.out.println("-- Reading Books");
        System.out.println("-- Riding my car");

        System.out.println();
    }
}

