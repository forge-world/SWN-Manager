import javax.swing.*;
import java.awt.*;

public class GUI extends Frame{


    public static void Stats_Display(Character A){
        JFrame coreAtrib = new JFrame("Character Stats");
        JPanel Atrib = new JPanel();
        coreAtrib.add(Atrib);
        coreAtrib.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        coreAtrib.setSize(300,300);
        coreAtrib.setVisible(true);

        JTextField strTextField = new JTextField("Strength: " + A.getStr(),10);
        Atrib.add(strTextField);
        JTextField dexTextField = new JTextField("Dexterity: " + A.getDex(),10);
        Atrib.add(dexTextField);
        JTextField conTextField = new JTextField("Constitution: " + A.getCon(),10);
        Atrib.add(conTextField);
        JTextField wisTextField = new JTextField("Wisdom: " + A.getWis(),10);
        Atrib.add(wisTextField);
        JTextField inteTextField = new JTextField("Intelligence: " + A.getInte(),10);
        Atrib.add(inteTextField);
        JTextField chaTextField = new JTextField("Charisma: " + A.getCha(),10);
        Atrib.add(chaTextField);
        JTextField HardTextField = new JTextField("Hardiness Save: " + A.getsave().get(0),15);
        Atrib.add(HardTextField);
        JTextField EvaTextField = new JTextField("Evasion Save: " + A.getsave().get(1),15);
        Atrib.add(EvaTextField);
        JTextField SpirTextField = new JTextField("Spirit Save: " + A.getsave().get(2),15);
        Atrib.add(SpirTextField);




    }


}
