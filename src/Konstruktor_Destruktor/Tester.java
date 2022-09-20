package Konstruktor_Destruktor;

public class Tester {

    public static void main (String [] args) {

        Persegi persegi = new Persegi();
        persegi.setSisi(10);
        System.out.println("Sisi persegi adalah "+ persegi.getSisi());
        System.out.println("Keliling persegi adalah "+ persegi.hitungKeliling());
        System.out.println("Luas persegi adalah "+ persegi.hitungLuas());

        PersegiPanjang persegipanjang = new PersegiPanjang();
            persegipanjang.setPanjang(10);
            persegipanjang.setLebar(20);

        System.out.println("Panjang persegi panjang adalah "+ persegipanjang.getPanjang());
        System.out.println("Lebar persegi panjang adalah "+persegipanjang.getLebar());
        System.out.println("Keliling persegi panjang adalah "+persegipanjang.hitungKeliling());
        System.out.println("Luas persegi panjang adalah "+ persegipanjang.hitungLuas());
    }
}
