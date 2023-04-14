package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadJSON2 {
    public static void main(String[] args) {

        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("Book.json")) {
            Object obj = jsonParser.parse(reader);

            JSONArray bookList = (JSONArray) obj;
            System.out.println(bookList);

            bookList.forEach(book -> parseBookObject((JSONObject) book));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private static void parseBookObject(JSONObject book) {
        JSONObject bookObject = (JSONObject) book.get("book");

        String id = (String) bookObject.get("id");
        System.out.println(id);

        String Name = (String) bookObject.get("Name");
        System.out.println(Name);

        String Price = (String) bookObject.get("Price");
        System.out.println(Price);

        String anthor = (String) bookObject.get("anthor");
        System.out.println(anthor);


    }
}
