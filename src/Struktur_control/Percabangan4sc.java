package Struktur_control;

public class Percabangan4sc {
    public static void main (String [] args) {
        int bulan = 1;

        switch (bulan) {
            case 1 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Januari");
                break;
            case 2 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Februari");
                break;
            case 3 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Maret");
                break;
            case 4 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "April");
                break;
            case 5 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Mei");
                break;
            case 6 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Juni");
                break;
            case 7 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "July");
                break;
            case 8 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Agustus");
                break;
            case 9 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "September");
                break;
            case 10 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Oktober");
                break;
            case 11 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "November");
                break;
            case 12 :
                System.out.println("Bulan ke-"+ bulan + " adalah bulan " + "Desember");
                break;
            default:
                System.out.println("Bulan tidak dikenali");
        }
    }
}
