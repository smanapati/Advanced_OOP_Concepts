
// imports
import java.util.*;

// The `Task` class
public class Task {
    public static void main(String[] args) {
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:" + hand);
        System.out.println("Cards add:" + addCards(hand));

        // enhanced for loop for deck
        for (Card card : d)
            System.out.println(card);
    }

    public static int addCards(ArrayList<Card> hand) {
        /*
         * TODO
         * This should compute the sum of values of the cards in an ArrayList of cards.
         */
        // find the sum of values of cards in array list
        int sum = 0;
        for (Card card : hand) {
            if (card.getValue().equals("Ace"))
                sum += 1;
            else if (card.getValue().equals("Jack"))
                sum += 11;
            else if (card.getValue().equals("Queen"))
                sum += 12;
            else if (card.getValue().equals("King"))
                sum += 13;
            else if (card.getValue() instanceof Integer)
                sum += (Integer) card.getValue();
        }
        return sum;
    }
}