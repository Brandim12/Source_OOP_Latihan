package Pewariasan;

public class Eksekusi {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNama("Adam Mukharil Bachtiar");
        dosen.setUmur(24);
        dosen.setNip("202043501319");
        dosen.setMatakuliah("Pemrograman Dasar");
        System.out.println("Nip Dosen      : " + dosen.getNip());
        dosen.mengajarApa();
        dosen.siapaKamu();

        Mahasiwa mahasiswa = new Mahasiwa();
        mahasiswa.setNama("Dimas Akbar");
        mahasiswa.setUmur(20);
        mahasiswa.setNim("2020220923");
        mahasiswa.setKelas("X3Y");
        System.out.println("NIM Mahasiswa "+ mahasiswa.getNim());
        mahasiswa.kelasApa();
        mahasiswa.siapaKamu();
    }
}
