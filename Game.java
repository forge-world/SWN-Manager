import com.google.gson.Gson;

public class Game {
    public static void main (String [] arg){
        Character A = new Character();
        Character B = new Character();
        //Gson serializer = new Gson();
        //String serialization_results = serializer.toJson(A);

        //System.out.println(serializer.toJson(A));
        //System.out.println(serializer.fromJson(serialization_results, Character.class));

        Save_Load.save(A, "C:\\Users\\Xander\\Desktop\\A.json");
        Save_Load.load("C:\\Users\\Xander\\Desktop\\B.json");
        System.out.println(B);
    }
}
