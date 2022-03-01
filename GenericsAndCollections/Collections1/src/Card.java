// The `Card` class
public class Card <V,S>{

    // The valud and suit for the card
    private V value;
    private S suit;

    // The constructor takes the value and suit
    public Card(V value, S suit){
        this.value = value;
        this.suit = suit;
    }

    // getters and setters
    public V getValue() {
        return value;
    }
    public void setValue(V value) {
        this.value = value;
    }
    public S getSuit() {
        return suit;
    }
    public void setSuit(S suit) {
        this.suit = suit;
    }

    // Override the toString( ) method
    @Override
    public String toString(){
        return value+" of "+suit;
    }
}