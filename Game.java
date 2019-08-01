import com.google.gson.Gson;

import javax.swing.*;

public class Game {
    public static void main (String [] arg){
        Character A = new Character();
        System.out.println(A);
        A = Save_Load.load("C:\\Users\\jmessina\\Desktop\\A.json");
        System.out.println(A);
        System.out.println(A.getDex());
        System.out.print(A.getStr());
        GUI.Stats_Display(A);


    }
}
