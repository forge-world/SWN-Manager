import com.google.gson.Gson;

import java.io.*;

public class Save_Load{
    public static void save(Character A, String path) {
        Gson gson = new Gson();
        String json = gson.toJson(A);
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(json);
            writer.close();

        }catch (IOException e){
            System.out.println("Sonofa Beach");
        }
    }
    public static void load(String path){
        try{
            String target = path;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(target));
            Gson decoder = new Gson();
            Character A = decoder.fromJson(bufferedReader, Character.class);
            System.out.println(A);
        }catch(IOException z){
            System.out.println("Load Failure");
        }
    }
}
