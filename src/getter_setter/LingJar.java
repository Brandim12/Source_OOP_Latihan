package getter_setter;

import java.text.DecimalFormat;

public class LingJar {

    public static void main (String [] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        Lingkaran lingkaran = new Lingkaran();

        lingkaran.setJariJari(10);
        System.out.println("Jari-jari lingkaran adalah "+lingkaran.getJariJari());
        System.out.println("Keliling lingkaran adalah "+df.format(lingkaran.hitungKelilingLingkaran()));
        System.out.println("Luas lingkaran adalah "+df.format(lingkaran.hitungLuasLingkaran()));

        Jajargenjang jajargenjang = new Jajargenjang();

        jajargenjang.setAlas(10);
        jajargenjang.setLebar(5);
        jajargenjang.setTinggi(10);
        jajargenjang.setPanjang(10);

        System.out.println("Alas jajargenjang adalah "+jajargenjang.getAlas());
        System.out.println("Lebar jajargenjang adalah "+jajargenjang.getLebar());
        System.out.println("tinggi jajargenjang adalah "+jajargenjang.getTinggi());
        System.out.println("panjang jajargenjang adalah "+jajargenjang.getPanjang());

        System.out.println("Keliling jajargenjang adalah "+jajargenjang.hitungKeliling());
        System.out.println("Luas jajargenjang adalah "+jajargenjang.hitungLuas());

    }
}
