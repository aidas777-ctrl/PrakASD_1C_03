package Kuis1_03_1C_AidaRahma;

public class Transaksi_03 {
    private Book_03 buku;
    private int jumlah;
    String idTransaksi;

    public void Transaksi03(Book_03 buku, int jumlah, String id) {
        this.buku = buku;
        this.jumlah = jumlah;
        idTransaksi = id;
    }

    public Book_03 getBuku() {
        return buku;
    }

    public int getJumlah() {
        return jumlah;
    }

}
