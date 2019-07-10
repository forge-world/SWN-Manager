public class Character {
    private int str = 4;
    private int con = 11;
    private int dex = 18;
    private int inte = 3;
    private int wis = 13;
    private int cha = 14;
    private int[] attri = {str, con, dex, inte, wis, cha};
    private int[] attrimod = {0, 1, 2, 3, 4, 5};
    private int[] save = {0, 1, 2, 3, 4, 5};

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
    public String toString(){
        System.out.println(attri[2]);
        return "I did it!";
    }
}
