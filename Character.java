import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;

public class Character extends Save_Load implements Serializable{
    //Members
    private int Str;
    private int Con;
    private int Dex;
    private int Inte;
    private int Wis;
    private int Cha;
    private ArrayList<Integer> attri = new ArrayList<>();
    private ArrayList<Integer> attrimod = new ArrayList<>();
    private ArrayList<Integer> save = new ArrayList<>();

    public Character(int str, int con, int dex, int inte, int wis, int cha){
        this.setStr(str);
        this.setCon(con);
        this.setDex(dex);
        this.setInte(inte);
        this.setWis(wis);
        this.setCha(cha);
    }

    public Character(){

    }

    //Getters and setters
    public void setStr(int str_value){
        this.Str = str_value;
    }
    public void setCon(int con_value){
        this.Con = con_value;
    }
    public void setDex(int dex_value){
        this.Dex = dex_value;
    }
    public void setWis(int wis_value) {
        this.Wis = wis_value;

    }
    public void setCha(int cha_value){
        this.Cha = cha_value;
    }
    public void setInte(int inte_value){
        this.Inte = inte_value;
    }
    public void setCharacter(Character x){
        Character A = x;
    }

    public int getStr(){
        return Str;
    }
    public int getCon(){
        return Con;
    }
    public int getDex(){
        return Dex;
    }
    public int getCha(){
        return Cha;
    }
    public int getWis(){
        return Wis;
    }
    public int getInte(){
        return Inte;
    }
    /*public Character getCharacter(){
        return A;
    }*/


    public ArrayList<Integer> getsave() {
        return save;
    }

    public ArrayList<Integer> getAttri() {
        return attri;
    }

    public ArrayList<Integer> getAttrimod() {
        return attrimod;
    }

    public void sheet_calculations() {
    attri.add(Str);
    attri.add(Con);
    attri.add(Dex);
    attri.add(Inte);
    attri.add(Wis);
    attri.add(Cha);

    System.out.println(attri.get(0));

    /* Loop used to calculate and store attribute modfiers. Will also print out scores*/
    for (int x = 0; x < attri.size(); x++) {
        if (attri.get(x) <= 3) {
            attrimod.add(-2);
        }
        if (attri.get(x) >= 4 && attri.get(x) <= 7) {
            attrimod.add(-1);
        }
        if (attri.get(x) >= 8 && attri.get(x) <= 13) {
            attrimod.add(0);
        }
        if (attri.get(x) >= 14 && attri.get(x) <= 17) {
            attrimod.add(1);
        }
        if (attri.get(x) >= 18) {
            attrimod.add(2);
        }
        System.out.println(" Modifier    " + attrimod.get(x));

    }

    /* Loop used to calculate and store attribute saving throws. Will also print out scores */
    for (int x = 0; x < attrimod.size(); x += 2) {
        if (attri.get(x) > attri.get(x+1)) {
            int y = 15 - attrimod.get(x);
            System.out.println(y);
            save.add(y);
            System.out.println(save.get(0));
        } else {
            int y = 15 - attrimod.get(x+1);
            save.add(y);
            System.out.println(save.get(0));


        }
    }
}


}

