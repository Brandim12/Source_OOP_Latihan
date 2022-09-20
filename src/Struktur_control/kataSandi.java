package Struktur_control;


import java.util.Scanner;
public class kataSandi {
    public static void main(String[] args) {

        /*boolean running = true;*/
        String[] idPw = new String[2];
        idPw[0] = "dimas";
        idPw[1] = "akbar";

        String pasword, username;
        int i;
        Scanner inputUsername = new Scanner(System.in);
        Scanner inputPasword = new Scanner(System.in);

        for (i = 1; i <= 3; i++) {
            System.out.println(" ");
            System.out.println("Silahkan Login");
            System.out.println("Kesempatan anda ("+i+"/3)");

                System.out.print("Username : ");
                username = inputUsername.nextLine();

                System.out.print("Password : ");
                pasword = inputPasword.nextLine();

                        if (username.equals(idPw[0]) && pasword.equals(idPw[1])) {
                            System.out.println("|||||||||||||||||||");
                            System.out.println("Anda berhasil masuk");
                            break;

                        } else {
                            System.out.println(" ");
                            System.out.println("Login gagal");
                        }

            if (i == 3) {
                System.out.println("Akun anda terkunci");
            }
        }
    }
}