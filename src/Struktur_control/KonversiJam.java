package Struktur_control;

public class KonversiJam {
    int jam, menit, detik;

    public void nilaiJam() {
        jam = 8;
        System.out.println(jam+" jam");


        menit = jam * 60;
        System.out.println(menit+" menit");


        detik = menit * 60;
        System.out.println(detik+" detik");
    }

    public static void main(String [] args) {
        KonversiJam jumlahJam = new KonversiJam();


        jumlahJam.nilaiJam();


        }
    }


