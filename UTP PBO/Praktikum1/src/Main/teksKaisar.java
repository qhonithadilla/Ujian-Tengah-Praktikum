package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Teks Kaisar

public class teksKaisar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String teks = scan.nextLine();
        int nilai = scan.nextInt();

        tekskaisar(teks, nilai);

    }
    public static void tekskaisar(String teks, int nilai) {
        String s = "";
        char alphabet;

        for(int i = 0; i < teks.length(); i++) {
            alphabet = teks.charAt(i);

            if (alphabet >= 'a' && alphabet <= 'z') {
                alphabet = (char) (alphabet + nilai);

                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                s += alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + nilai);

                if (alphabet > 'Z') {
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                s += alphabet;
            }
            else {
                s += alphabet;
            }

        }
        System.out.println(s);
    }
}
