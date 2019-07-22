import java.io.Serializable;

public class Character implements Serializable{
    //Members
    private int str;
    private int con;
    private int dex;
    private int inte;
    private int wis;
    private int cha;
    private int[] attri = {str, con, dex, inte, wis, cha};
    private int[] attrimod = {0, 1, 2, 3, 4, 5};
    private int[] save = {0, 1, 2, 3, 4, 5};

    public Character (int str, int con, int dex, int inte, int wis, int cha){
        this.str = str;
        this.con = con;
        this.dex = dex;
        this.inte = inte;
        this.wis = wis;
        this.cha = cha;
    }

    //Getters and setters
    public void setStr(int str){
        this.str = str;
    }
    void setCon(int con_value){
        this.con = con_value;
    }
    void setDex(int dex_value){
        this.dex = dex_value;
    }
    void setWis(int wis_value){
        this.wis = wis_value;
    }
    void setCha(int cha_value){
        this.cha = cha_value;
    }
    void setInte(int inte_value){
        this.inte = inte_value;
    }
    int getStr(){
        return attri[0];
    }


    public Character() {
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
    public void print(){
        System.out.print(str + dex);
    }
}
