package Struktur_control;

public class MethodTanpaNilaiBalik {
    public static void main (String [] args) {

        //Menampilkan data orang 1
        tampilDataOrang("Dimas", "Padurenan");

        System.out.println();

        //Menampilkan data orang 2
        tampilDataOrang("Faisal", "Bantargebang");

        System.out.println();

        //Menampilkan data orang 3
        tampilDataOrang("Firman", "Cikarang");
    }

    //Method tanpa nilai balik untuk menamppilkan nama dan alamt
    public static void tampilDataOrang(String nama, String alamat) {
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
    }
}
