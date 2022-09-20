package Struktur_control;

public class LuasPersegi {


        int P = 20;
        int L = 50;
        int luas;

        public void luasPersegi() {
            luas = P*L;
        System.out.println("Luas persegi panjang yang diketahui P=20, L=50 adalah: "+ luas);
          }

        public static void main(String [] args) {
            LuasPersegi luasnya = new LuasPersegi();

                    luasnya.luasPersegi();
    }
}
