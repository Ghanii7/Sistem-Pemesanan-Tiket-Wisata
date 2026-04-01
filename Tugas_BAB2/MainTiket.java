package Bab2;

import java.util.Scanner;

public class MainTiket {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama;
        String tujuan = "";
        int harga = 0;
        int jumlah;

        System.out.println("===== SISTEM PEMESANAN TIKET WISATA =====");

        System.out.print("Nama Pemesan : ");
        nama = input.nextLine();

        System.out.println("\nDaftar Tujuan Wisata");
        System.out.println("1. Bali (Rp500000)");
        System.out.println("2. Yogyakarta (Rp300000)");
        System.out.println("3. Lombok (Rp450000)");

        System.out.print("Pilih Tujuan (1-3) : ");
        int pilih = input.nextInt();

        if(pilih == 1){
            tujuan = "Bali";
            harga = 500000;
        }
        else if(pilih == 2){
            tujuan = "Yogyakarta";
            harga = 300000;
        }
        else if(pilih == 3){
            tujuan = "Lombok";
            harga = 450000;
        }

        System.out.print("Jumlah Tiket : ");
        jumlah = input.nextInt();

        // Membuat object menggunakan constructor
        TiketWisata tiket = new TiketWisata(nama, tujuan, harga, jumlah);

        System.out.println();
        tiket.tampilData();
    }
}