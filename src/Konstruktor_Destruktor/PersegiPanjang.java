package Konstruktor_Destruktor;

public class PersegiPanjang {

    private double panjang, lebar;

    //tambahkan konstruktor disini
    public PersegiPanjang() {
        this.panjang = 0;
        this.lebar = 0;
        System.out.println("Objek persegi panjang di isntansiasi");
    }

    public double getLebar() {
        return lebar;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
    }
    public double getPanjang() {
        return panjang;
    }
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    public double hitungKeliling() {
        return (2*panjang) + (2*lebar);
    }
    public double hitungLuas() {
        return panjang * lebar;
    }
}
