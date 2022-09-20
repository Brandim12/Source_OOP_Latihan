package Konstruktor_Destruktor;

public class Persegi {

    private double sisi;

    //tambahkan kostruktor disi
    public Persegi() {
        this.sisi = 0;
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