import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.math.BigDecimal;


public class Database {
    /* TODO Declare a member variable that can
        be EASILY set from the constructor. */
    private final JsonObject data;

    public Database(JsonObject data){
        /* TODO  set the member variable declared above.*/
        this.data = data;
    }

    public JsonObject getRestaurant(String name){
        /* TODO Complete this method as specified. */
        // get all the restaurants
        JsonArray restaurants = (JsonArray) this.data.get("restaurants");
        // find the restaurant with given name
        for (Object restaurant : restaurants) {
            JsonObject obj = (JsonObject) restaurant;
            String objName = (String) obj.get("name");
            if (objName.equals(name))
                return obj;
        }
        return null;
    }

    public double getAvgReviews(String name){
        /* TODO Complete this method as specified.
             The previous method may be of help. */
        JsonObject obj = getRestaurant(name);
        if (obj == null)    return 0.0;
        double sum = 0;
        int count = 0;
        JsonArray reviews = (JsonArray) obj.get("reviews");
        for (Object o : reviews) {
            JsonObject review = (JsonObject) o;
            sum += ((BigDecimal)review.get("rating")).intValue();
            count++;
        }
        return sum/count;
    }
}
