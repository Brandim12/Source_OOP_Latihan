package getter_setter;

public class Lingkaran {
    private double jariJari;
    private final double PI = 3.14;

    public double getJariJari(){
        return jariJari;
    }
    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    public double hitungKelilingLingkaran() {
        return 2 * PI * jariJari;
    }
    public double hitungLuasLingkaran() {
        return PI * jariJari * jariJari;
    }
}
