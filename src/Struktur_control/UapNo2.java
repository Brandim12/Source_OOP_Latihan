package Struktur_control;
import java.util.*;
class UapNo2 {

        public static void main (String [] args){
            Scanner xyz = new Scanner (System.in);
            System.out.println("Digit terakhir NPM Anda : "); int npm = xyz.nextInt();
            System.out.println(npm+"\t"+uap(npm));
        }

        static int uap (int b){
            if (b==0) return 2;
            else return 2*uap(b-1)+1;
        }
}
