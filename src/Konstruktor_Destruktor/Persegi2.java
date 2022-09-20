package Konstruktor_Destruktor;

public class Persegi2 {

        private double sisi;

        //tambahkan kostruktor disini setelah deklarasi atribut
        public Persegi2(double sisi) {
            this.sisi = sisi;
            System.out.println("Objek persegi di instansiasi");
        }

        public double getSisi(){
            return sisi;
        }
        public void setSisi(double sisi) {
            this.sisi = sisi;
        }
        public double hitungKeliling() {
            return 4*sisi;
        }
        public double hitungLuas() {
            return sisi*sisi;
        }
}
