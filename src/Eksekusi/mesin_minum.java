package Eksekusi;

import java.util.Scanner;
public class mesin_minum {
    public static void main(String[] args) {
        int minuman;
        Scanner input = new Scanner();

        System.out.print("Pilih minuman: ");
        minuman = input.nextInt();

        switch (minuman) {
            case 1:
                System.out.println("Susu");
                break;

            case 2:
                System.out.println("Kopi");
                break;

            case 3:
                System.out.println("Teh");
                break;

            case 4:
                System.out.println("Jus");
                break;

            case 5:
                System.out.println("Marimas");
                break;
        }
    }
}
