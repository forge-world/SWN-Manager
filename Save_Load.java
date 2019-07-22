import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

public class Save_Load {
    public static void save(Character A, String path) {
        try {
            FileWriter writer = new FileWriter(path);
            Gson serializer = new Gson();
            serializer.toJson(A, new FileWriter(path));
            writer.flush();
            writer.close();
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
