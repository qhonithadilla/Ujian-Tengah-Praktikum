package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Saldo Nasababah

public class Saldo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double saldo = scan.nextInt();
        double setoran = scan.nextInt();

        System.out.println(saldoFinal(saldo, setoran));
    }

    public static double saldoFinal (double j, double k) {
        double kurang = (j + k) - 7000;
        double bonus = kurang * 0.05 / 100;

        return kurang + bonus;
    }
}
