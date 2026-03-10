package PemesananTiketWisata;

import java.util.Scanner;

public class MainTiket {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        TiketWisata tiket = new TiketWisata();
        
        String nama;
        String tujuan;
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
        else{
            tujuan = "Lombok";
            harga = 450000;
        }
        
        System.out.print("Jumlah Tiket : ");
        jumlah = input.nextInt();
        
        tiket.inputData(nama, tujuan, harga, jumlah);
        
        System.out.println();
        tiket.tampilData();
        
    }
}