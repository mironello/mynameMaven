package goit16java;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Collections;
import java.util.Map;

public class NameOutput {
    public NameOutput() {
    }

    public String output() {
        User user = new User("Olexandr", "Myronenko");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(user);
        return json;
    }
}
