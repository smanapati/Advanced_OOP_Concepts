
// imports
import java.util.*;

public class Counter<E> {

    // stores the count of objects
    private HashMap<E, Integer> counts;

    public Counter(E[] things) {
        // initialize the map
        this.counts = new HashMap<>();
        /*
         * TODO
         * Loop through the elements of "things" and use the HashMap "counts"
         * to store the elements of things as keys, and the number of times they
         * appear in the array as values. Check the instructions.
         */
        for (int i = 0; i < things.length; i++) {
            // get the number of times `ith` thing appeared before
            int count = this.counts.getOrDefault(things[i], 0);
            // increase the count in the map
            this.counts.put(things[i], count + 1);
        }

    }

    public Integer getCount(E element) {
        /*
         * TODO
         * This just returns the specific count for an element. It is a wrapper
         * for a getting the value of the HashMap given the key "element"
         */
        return this.counts.getOrDefault(element, 0);
    }

    public int getSize() {
        return this.counts.size();
    }

    public E mostFrequent() {
        /*
         * TODO
         * Returns the most frequent key in the HashMap
         */
        // iterate through all keys
        E frequentItem = null;
        Integer frequency = 0;
        for (Map.Entry<E, Integer> entry : this.counts.entrySet()) {
            E key = entry.getKey();
            Integer value = entry.getValue();
            if (value > frequency) {
                frequency = value;
                frequentItem = key;
            }
        }
        return frequentItem;
    }
}