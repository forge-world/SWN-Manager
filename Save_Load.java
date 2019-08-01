import com.google.gson.Gson;

import java.io.*;

public abstract class Save_Load{

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
    public static Character load(String path){
        Character loader = new Character();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            loader = gson.fromJson( bufferedReader,Character.class);
            System.out.println(loader.getDex());
            System.out.println(loader);
        }catch(IOException z){
            System.out.println("Load Failure");
        }
        return loader;
    }


}
