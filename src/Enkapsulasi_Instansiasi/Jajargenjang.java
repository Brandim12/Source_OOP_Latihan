package Enkapsulasi_Instansiasi;

public class Jajargenjang {

    public double panjang, lebar, alas, tinggi;

    public double kelilingJajargenjang() {
        return (2*panjang)+(2*lebar);
    }

    public double luasJajargenjang() {
        return alas * tinggi;
    }
}
