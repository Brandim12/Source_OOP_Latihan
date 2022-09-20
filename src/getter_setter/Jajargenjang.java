package getter_setter;

public class Jajargenjang {

    private double tinggi, lebar, alas, panjang;

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getLebar() {
    return lebar;
    }
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double hitungKeliling() {
        return (2*panjang)+(2*lebar);
    }
    public double hitungLuas(){
        return (alas*tinggi);
    }
}
