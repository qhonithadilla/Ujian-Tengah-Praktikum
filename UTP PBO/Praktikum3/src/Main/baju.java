package Main;

import java.util.Scanner;

public class baju {
    final int bajua, bajub, bajuc;
    int total;

    public baju(int hargaa, int hargab, int hargac){
        bajua = hargaa;
        bajub = hargab;
        bajuc = hargac;
    }
    public int getBajua(){
        return bajua;
    }
    public int getBajub() {
        return bajub;
    }
    public int getBajuc() {
        return bajuc;
    }
    public void display (String jenis, int jumlah){
        if (jenis.equalsIgnoreCase("a")){
            total = getBajua() * jumlah;
        }
        else if (jenis.equalsIgnoreCase("b")){
            total = getBajub() * jumlah;
        }
        else if (jenis.equalsIgnoreCase("c")){
            total = getBajuc() * jumlah;
        }
        System.out.println("Jenis yang anda beli : " + jenis);
        System.out.println("Harga per buah\t\t : " + getBajua() );
        System.out.println("Total harga\t\t\t : " + total);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        baju hargabju = new baju(100000, 125000, 175000);
        baju hrgdiskon = new baju(95000, 120000, 160000);

        System.out.println("Baju yang tersedia : ");
        System.out.print("""
                Baju A dengan harga 100000
                Baju B dengan harga 125000
                Baju C dengan harga 175000
                """);

        System.out.print("Baju yang akan anda beli bertipe : ");
        String pilih = scan.next();
        if (pilih.equalsIgnoreCase("a")){
            System.out.print("jumlah Baju yang akan anda beli adalah : ");
            int jum = scan.nextInt();
            if (jum <= 100){
                hargabju.display(pilih, jum);
            }
            else {
                hrgdiskon.display(pilih, jum);
            }
        }
        else if (pilih.equalsIgnoreCase("b")){
            System.out.print("jumlah Baju yang akan anda beli adalah : ");
            int jum = scan.nextInt();
            if (jum <= 100){
                hargabju.display(pilih, jum);
            }
            else {
                hrgdiskon.display(pilih, jum);
            }
        }
        else if (pilih.equalsIgnoreCase("c")){
            System.out.print("jumlah Baju yang akan anda beli adalah : ");
            int jum = scan.nextInt();
            if (jum <= 100){
                hargabju.display(pilih, jum);
            }
            else {
                hrgdiskon.display(pilih, jum);
            }
        }
    }
}