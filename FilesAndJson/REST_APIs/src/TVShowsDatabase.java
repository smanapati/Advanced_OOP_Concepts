import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;
import java.net.URL;
import java.util.stream.Collectors;

public class TVShowsDatabase {

    String baseUrl = "http://api.tvmaze.com/search/";

    // Create a method getURLSource that returns a String and gets a URL object as a parameter.
    // It should also throw an exception.
    // This method should read the open stream of the url and concatenate it in a String.
    // It should then return that String.
    public String getURLSource(URL url) throws Exception {
        // get the openStream
        InputStream in = url.openStream();
        // read the content
        return new BufferedReader(new InputStreamReader(in)).lines().collect(Collectors.joining("\n"));
    }


    public JsonObject getShowsByName(String name) throws Exception {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl + "shows?q=" + name);
        /* TODO: You have to use the url to retrieve the contents of the website.
        This will be a String, but in JSON format. Use the auxiliary function you created above. */
        String body = getURLSource(url);
        String result = "{\"result\": " + body + "}";
        // construct JsonObject from given string
        return Jsoner.deserialize(result, new JsonObject());
    }


    public JsonObject getPeopleInShows(String query) throws Exception {
        //Getting the things ready to connect to the web
        /* TODO: Fill in this data type (Object) */
        URL url = new URL(baseUrl + "people?q=" + query);

        /* TODO: Read the information coming from the web*/
        String body = getURLSource(url);
        String result = "{\"result\": " + body + "}";
        // construct JsonObject from given string
        return Jsoner.deserialize(result, new JsonObject());
    }


    public String formatShowAsString(JsonObject doc) {
        String results = "";
        /* TODO
            This should return a String with each show in four fields:
            Name:the name of the show
            Link:the link to the show
            rating average:The rating average of teh show, and
            summary, the summary of the show.*/
        JsonArray shows = (JsonArray) doc.get("result");
        for (Object o : shows) {
            JsonObject show = (JsonObject) o;
            results += "Name:" + ((JsonObject) show.get("show")).get("name") + "\n";
            results += "Link:" + ((JsonObject) show.get("show")).get("url") + "\n";
            results += "Premiered:" + show.get("premiered") + "\n";
            results += "Summary:" + show.get("summary") + "\n";
        }
        return results;
    }

    public void saveShows(String text, String outfile) {
        /* TODO
        Given a String with some text in it, write that text to a file.
        The name of the file is given in outfile */
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outfile))) {
            bw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
