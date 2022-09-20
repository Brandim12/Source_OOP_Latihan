package Konstruktor_Destruktor;

public class Tester2 {
        public static void main (String [] args) {

            Persegi2 persegi2 = new Persegi2(10);
            System.out.println("Sisi persegi adalah "+ persegi2.getSisi());
            System.out.println("Keliling persegi adalah "+ persegi2.hitungKeliling());
            System.out.println("Luas persegi adalah "+ persegi2.hitungLuas());

            PersegiPanjang2 persegipanjang2 = new PersegiPanjang2 (10, 20);

            System.out.println("Panjang persegi panjang adalah "+ persegipanjang2.getPanjang());
            System.out.println("Lebar persegi panjang adalah "+persegipanjang2.getLebar());
            System.out.println("Keliling persegi panjang adalah "+persegipanjang2.hitungKeliling());
            System.out.println("Luas persegi panjang adalah "+ persegipanjang2.hitungLuas());
        }

}
