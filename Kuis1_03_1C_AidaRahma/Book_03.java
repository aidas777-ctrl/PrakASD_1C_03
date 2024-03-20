package Kuis1_03_1C_AidaRahma;

public class Book_03 {
    String kodeBuku;
    String judulBuku;
    String pengarang;
    int tahunTerbit;
    int stock;

    public Book_03(String kode, String judul, String pengarang, int tahun, int stok) {
        kodeBuku = kode;
        judulBuku = judul;
        this.pengarang = pengarang;
        tahunTerbit = tahun;
        stock = stok;
    }

    public void displayData() {
        System.out.println("=========================");
        System.out.println("Kode Buku    : " + kodeBuku);
        System.out.println("Judul Buku   : " + judulBuku);
        System.out.println("Pengarang    : " + pengarang);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Stock        : " + stock);
    }

    public String getKodeBuku() {
        return kodeBuku;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

}
