/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
 * 
 * Modifier: Simranpreet Kaur
 * Student Number: 991793427
 * Date Modified: 2025-09-18
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        // create a magic hand of 7 cards with random values
        Card[] magicHand = new Card[7];
        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(rand.nextInt(13) + 1); // values 1–13
            c.setSuit(Card.SUITS[rand.nextInt(4)]); // 0–3
            magicHand[i] = c;
        }
      
        Card luckyCard = new Card();
        luckyCard.setValue(2);  // Your chosen value
        luckyCard.setSuit("Clubs"); // Your chosen suit

        // Search magicHand for the lucky card
        boolean found = false;
        for (Card c : magicHand) {
            if (c.getValue() == luckyCard.getValue() && c.getSuit().equalsIgnoreCase(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }

        // print result
        if (found) {
            System.out.println("You WIN! Your lucky card is in the magic hand!");
        } else {
            System.out.println("Sorry, your lucky card is not in the magic hand.");
        }

    }
}