package Enkapsulasi_Instansiasi;

import java.text.DecimalFormat;

public class LingJar {

    public static void main(String[]args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jariJari = 5;

        System.out.println("Keliling lingkaran : "+df.format(lingkaran.hitungKeliling()));
        System.out.println("Luas lingkaran : "+ df.format(lingkaran.hitungLuaslingkaran()));


        Jajargenjang jajargenjang = new Jajargenjang();
        jajargenjang.panjang = 10;
        jajargenjang.lebar = 5;
        jajargenjang.tinggi = 2;
        jajargenjang.alas = 8;

        System.out.println("Keliling Jajargenjang : "+jajargenjang.kelilingJajargenjang());
        System.out.println("Luas jajarenjang : "+jajargenjang.luasJajargenjang());

    }
}
