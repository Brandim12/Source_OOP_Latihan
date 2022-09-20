package Enkapsulasi_Instansiasi;

public class Lingkaran {

    public double jariJari;
    public final double pi = 3.14;

    public double hitungKeliling() { //rumus keliling lingkaran
        return 2 * pi * jariJari;
    }

    public double hitungLuaslingkaran() {
        return pi * jariJari * jariJari;
    }

    public double hitungDiameterLingkaran() {
        return 2 * jariJari;
    }

}
