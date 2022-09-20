package Enkapsulasi_Instansiasi;

public class Tester {
    public static void main (String [] args) {
        Persegi persegi = new Persegi();
        persegi.sisi = 10;
        System.out.println("Keliling Persegi = " + persegi.hitungKeliling());
        System.out.println("Luas Persegi = " + persegi.hitungLuas());

        PersegiPanjang persegipanjang = new PersegiPanjang();
        persegipanjang.panjang = 5;
        persegipanjang.lebar = 4;
        System.out.println("Keliling persegi panjang = " +persegipanjang.hitungKeliling());
        System.out.println ("Luas persegi panjang = "+persegipanjang.hitungLuas());

    }
}
