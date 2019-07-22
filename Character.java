import java.io.Serializable;

public class Character implements Serializable{
    //Members
    private int str;
    private int con;
    private int dex;
    private int inte;
    private int wis;
    private int cha;

    //Member definer as a list
    public void Character_Stats (int str, int con, int dex, int inte, int wis, int cha){
        this.setStr(str);
        this.setCon(con);
        this.setDex(dex);
        this.setInte(inte);
        this.setWis(wis);
        this.setCha(cha);
    }

    //Getters and setters
    public void setStr(int str_value){
        str = str_value;
    }
    public void setCon(int con_value){
        this.con = con_value;
    }
    public void setDex(int dex_value){
        this.dex = dex_value;
    }
    public void setWis(int wis_value) {
        this.wis = wis_value;

    }
    public void setCha(int cha_value){
        this.cha = cha_value;
    }
    public void setInte(int inte_value){
        this.inte = inte_value;
    }
    public int getStr(){
        return str;
    }
    public int getCon(){
        return this.con;
    }
    public int getDex(){
        return this.dex;
    }
    public int getCha(){
        return this.cha;
    }
    public int getWis(){
        return this.wis;
    }
    public int getInte(){
        return this.inte;
    }
    public void sheet_calculations() {
        int[] attri = {str, con, dex, inte, wis, cha};
        int[] attrimod = {0, 1, 2, 3, 4, 5};
        int[] save = {0, 1, 2, 3, 4, 5};
        int attrilength = attri.length;
        int modlength = attrimod.length;
        String[] savetype = {"Physical", "Physical", "Evasion", "Evasion", "Mental", "Mental"};

        /* Loop used to calculate and store attribute modfiers. Will also print out scores*/
        for (int x = 0; x < attrilength; x++) {
            if (attri[x] <= 3) {
                attrimod[x] = -2;
            }
            if (attri[x] >= 4 && attri[x] <= 7) {
                attrimod[x] = -1;
            }
            if (attri[x] >= 8 && attri[x] <= 13) {
                attrimod[x] = 0;
            }
            if (attri[x] >= 14 && attri[x] <= 17) {
                attrimod[x] = 1;
            }
            if (attri[x] >= 18) {
                attrimod[x] = 2;
            }//System.out.println ("Score: " + attri[x] + " Modifier    " + attrimod[x]);

        }

        /* Loop used to calculate and store attribute saving throws. Will also print out scores */
        for (int x = 0; x < modlength; x += 2) {
            if (attrimod[x] > attrimod[x + 1]) {
                save[x] = 15 - attrimod[x];
            }
            if (attrimod[x] < attrimod[x + 1]) {
                save[x] = 15 - attrimod[x + 1];
            } else save[x] = 15 - attrimod[x];
            //System.out.println(savetype[x] + " save    " + save[x]);}
        }
    }
}
