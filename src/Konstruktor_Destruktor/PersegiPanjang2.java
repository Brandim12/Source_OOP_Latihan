package Konstruktor_Destruktor;

    public class PersegiPanjang2 {

        private double panjang, lebar;

        public PersegiPanjang2(double panjang, double lebar) {
            this.panjang = panjang;
            this.lebar = lebar;
        }
        public double getPanjang() {
            return panjang;
        }
        public void setPanjang(double panjang) {
            this.panjang = panjang;
        }
        public double getLebar() {
            return lebar;
        }
        public void setLebar(double lebar) {
            this.lebar = lebar;
        }
        public double hitungKeliling() {
            return (2*panjang) + (2 * lebar);
        }
        public double hitungLuas(){
            return panjang*lebar;
        }
    }