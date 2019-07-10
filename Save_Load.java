import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Save_Load {
    public static void save(Character A, String path) {
        //Write the class to a string for Json
        System.out.println(A);
        Gson serializer = new Gson();

        //Locate the class in question
        System.out.println(serializer);
        //Write the string to a file
        try {
            serializer.toJson(A, new FileWriter(path));
        }catch (IOException e){
            System.out.println("Sonofa Beach");
        }
    }
    public static void load(String path){
        Gson decoder = new Gson();
        try{
            Character B = decoder.fromJson(new FileReader (path), Character.class);
        }catch(IOException z){
            System.out.println("Load Failure");
        }
        }
}
