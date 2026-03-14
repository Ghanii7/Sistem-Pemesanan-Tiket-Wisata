package PemesananTiketWisata;

public class TiketWisata {
    
    String namaPemesan;
    String tujuanWisata;
    int hargaTiket;
    int jumlahTiket;
    int totalBayar;
    
    void inputData(String nama, String tujuan, int harga, int jumlah){
        namaPemesan = nama;
        tujuanWisata = tujuan;
        hargaTiket = harga;
        jumlahTiket = jumlah;
        totalBayar = hargaTiket * jumlahTiket;
    }
    
    void tampilData(){
        System.out.println("===== DATA PEMESANAN TIKET =====");
        System.out.println("Nama Pemesan   : " + namaPemesan);
        System.out.println("Tujuan Wisata  : " + tujuanWisata);
        System.out.println("Harga Tiket    : " + hargaTiket);
        System.out.println("Jumlah Tiket   : " + jumlahTiket);
        System.out.println("Total Bayar    : " + totalBayar);
    }
}