package JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteJSON2 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        JSONObject bookDetails = new JSONObject();
        bookDetails.put("id", "A01");
        bookDetails.put("Name", "De Men Phieu Luu Ky");
        bookDetails.put("Price", "30000");
        bookDetails.put("anthor", "codelean");

        JSONObject bookObject = new JSONObject();
        bookObject.put("book", bookDetails);

        JSONObject bookDetails2 = new JSONObject();
        bookDetails2.put("id", "A02");
        bookDetails2.put("Name", "Tat Den");
        bookDetails2.put("Price", "34560");
        bookDetails2.put("anthor", "Ngo Tat To");

        JSONObject bookObject2 = new JSONObject();
        bookObject2.put("book", bookDetails);

        JSONArray bookList = new JSONArray();
        bookList.add(bookObject);
        bookList.add(bookObject2);

      try(FileWriter file = new FileWriter("book.json")) {
          file.write(bookList.toJSONString());
          file.flush();
      }catch (IOException e) {
          e.printStackTrace();
      }





    }
}
