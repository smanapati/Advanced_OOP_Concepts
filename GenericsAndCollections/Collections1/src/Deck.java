// imports
import java.util.*;

// The `Deck` class
public class Deck implements Iterable<Card> {
    private List<Card> deck;
    private String[] suits = { "Hearts", "Clubs", "Diamonds", "Spades" };

    public Deck() {
        /*
         * TODO
         * This constructor initializes the deck variable with
         * all the cards of a deck, except a joker.
         * The suits array may help you.
         */
        this.deck = new ArrayList<>();
        // for every suit create a cart
        for (String suit : suits) {
            this.deck.add(new Card<String, String>("Ace", suit));
            this.deck.add(new Card<Integer, String>(2, suit));
            this.deck.add(new Card<Integer, String>(3, suit));
            this.deck.add(new Card<Integer, String>(4, suit));
            this.deck.add(new Card<Integer, String>(5, suit));
            this.deck.add(new Card<Integer, String>(6, suit));
            this.deck.add(new Card<Integer, String>(7, suit));
            this.deck.add(new Card<Integer, String>(8, suit));
            this.deck.add(new Card<Integer, String>(9, suit));
            this.deck.add(new Card<Integer, String>(10, suit));
            this.deck.add(new Card<String, String>("Jack", suit));
            this.deck.add(new Card<String, String>("Queen", suit));
            this.deck.add(new Card<String, String>("King", suit));
        }

    }

    public Card dealCard() {
        /*
         * TODO
         * Code this. It is almost EXACTLY as the method to draw one object
         * from the bag in the previous task. The difference is that this method
         * REMOVES the card from the deck
         */
        // get a random index
        int index = new Random().nextInt(this.deck.size());
        // remove the element at specific index
        return this.deck.remove(index);
    }

    public int size() {
        /* TODO: Return the size of the deck (number of cards left in it) */
        return this.deck.size();
    }

    @Override
    public Iterator<Card> iterator() {
        /*
         * TODO
         * Return a new DeckIterator with this instance in the constructor.
         */
        return new DeckIterator(this);
    }
}