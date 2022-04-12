package Main;

import java.util.Scanner;

//Nama : Qhonitha Adilla Taufani
//kelas : PTI-B

//Menghitung Luas

public class Solution {
    int Persegi;
    int Segitiga;
    double Lingkaran;
    static int pilih;

    public Solution(int s){
        this.Persegi = s * s;
    }
    public Solution(double a, double t){
        this.Segitiga = (int) (a * t) / 2;
    }
    public Solution(double r){
        if (r % 7 == 0){
            double phi = 22/7;
            double lingkaran = phi * r * r;
            this.Lingkaran= (int) lingkaran;
        }
        else if (r % 7 != 0){
            double phi = 3.14;
            double lingkaran = phi * r * r;
            this.Lingkaran= (int) lingkaran;
        }
    }
    void pilih(){
        if (pilih == 1){
            System.out.println(Persegi);
        }
        else if (pilih == 2){
            System.out.println(Segitiga);
        }
        else if (pilih == 3){
            System.out.println(Lingkaran);
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        pilih = scan.nextInt();

        if (pilih == 1){
            int sisi= scan.nextInt();
            Solution persegi = new Solution(sisi);
            persegi.pilih();
        }
        else if (pilih == 2){
            double alas = scan.nextInt();
            double tinggi = scan.nextInt();
            Solution segitiga = new Solution(alas,tinggi);
            segitiga.pilih();
        }
        else if (pilih == 3){
            double jarijari = scan.nextInt();
            Solution lingkaran = new Solution(jarijari);
            lingkaran.pilih();
        }
        else{
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }
}