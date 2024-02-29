package P2.PenjualanBuku;

public class Buku03 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku03() {
        
    }

    public Buku03(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi() {
        System.out.println("Judul         : " + judul);
        System.out.println("Pengarang     : " + pengarang);
        System.out.println("Jumlah Halaman: " + halaman);
        System.out.println("Sisa Stok     : " + stok);
        System.out.println("Harga/Buku    : Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0 && stok >= jml) {
            stok -= jml;
        } else {
            System.out.println("Stok Habis");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    void hitungHargaTotal(int terJual) {
        int hargaTotal = harga * terJual;
        System.out.println("Harga Total   : Rp " + hargaTotal);
    }

    void hitungDiskon(int terJual) {
        int hargaTotal = harga * terJual;
        double diskon = 0;
        double jumlahDis = 0;

        if (hargaTotal > 150000) {
            jumlahDis = 0.12 * hargaTotal;
        } else if (hargaTotal > 75000 && hargaTotal < 150000) {
            jumlahDis = 0.05 * hargaTotal;
        } else if (hargaTotal < 75000) {
            diskon = 0;
        }
        System.out.println("Diskon        : Rp " + jumlahDis);
    }

    void hitungHargaBayar(int terJual) {
        int hargaTotal = harga * terJual;
        double diskon = 0;
        double jumlahDis = 0;

        if (hargaTotal > 150000) {
            jumlahDis = 0.12 * hargaTotal;
        } else if (hargaTotal > 75000 && hargaTotal < 150000) {
            jumlahDis = 0.05 * hargaTotal;
        } else if (hargaTotal < 75000) {
            diskon = 0;
        }

        double hargaBayar  = hargaTotal - jumlahDis;
        System.out.println("Harga bayar   : Rp " + hargaBayar);
    }

}
