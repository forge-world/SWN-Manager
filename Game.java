import com.google.gson.Gson;

public class Game {
    public static void main (String [] arg){
        Character A = new Character(18, 17, 16, 13, 14, 8);
        System.out.println(A.getStr());
        A.print();

        Character B = new Character(28, 27, 26, 23, 24, 38);
        System.out.println(B.getStr());

        //Gson serializer = new Gson();
        //String serialization_results = serializer.toJson(A);

        //System.out.println(serializer.toJson(A));
        //System.out.println(serializer.fromJson(serialization_results, Character.class));

        Save_Load.save(A, "C:\\Users\\jmessina\\Desktop\\A.json");
        Save_Load.save(B, "C:\\Users\\jmessina\\Desktop\\B.json");
        Save_Load.load("C:\\Users\\jmessina\\Desktop\\B.json");
        Save_Load.load("C:\\Users\\jmessina\\Desktop\\A.json");
    }
}
