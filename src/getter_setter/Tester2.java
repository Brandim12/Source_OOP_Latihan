package getter_setter;

public class Tester2 {

    public static void main(String[]args) {
        Persegi2 persegi = new Persegi2();
        persegi.setSisi(10);
        System.out.println("Sisi Persegi  = "+ persegi.getSisi());
        System.out.println("Keliling Persegi = "+ persegi.hitungKeliling());
        System.out.println("Luas Persegi  = "+ persegi.hitungLuas());

        PersegiPanjang2 persegipanjang = new PersegiPanjang2();
        persegipanjang.setPanjang(5);
        persegipanjang.setLebar(4);
        System.out.println("Panjang persegi panjang  = "+ persegipanjang.getPanjang());
        System.out.println("Lebar persegi panjang = "+ persegipanjang.getLebar());

        System.out.println("Keliling persegi panjang = "+ persegipanjang.hitungKeliling());
        System.out.println("Luas persegi panjang = "+persegipanjang.hitungLuas());
    }
}
