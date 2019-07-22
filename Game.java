import com.google.gson.Gson;

public class Game {
    public static void main (String [] arg){
        Character A = new Character();
        A.Character_Stats(12, 17, 16, 13, 14, 18);
        System.out.println(A.getStr());
        //A.print();

        Character B = new Character();
        B.Character_Stats(22, 27, 26, 23, 24, 28);
        System.out.println(B.getStr());

        Character C = new Character();
        C.Character_Stats(32, 37, 36, 33, 34, 38);
        System.out.println(C.getStr());

        //Gson serializer = new Gson();
        //String serialization_results = serializer.toJson(A);

        //System.out.println(serializer.toJson(A));
        //System.out.println(serializer.fromJson(serialization_results, Character.class));

        Save_Load.save(A, "C:\\Users\\jmessina\\Desktop\\A.json");
        Save_Load.save(B, "C:\\Users\\jmessina\\Desktop\\B.json");
        Save_Load.save(C, "C:\\Users\\jmessina\\Desktop\\C.json");
        Save_Load.load("C:\\Users\\jmessina\\Desktop\\C.json");
        Save_Load.load("C:\\Users\\jmessina\\Desktop\\B.json");
        Save_Load.load("C:\\Users\\jmessina\\Desktop\\A.json");
    }
}
