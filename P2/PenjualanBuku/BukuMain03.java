package P2.PenjualanBuku;

public class BukuMain03 {
    public static void main(String[] args) {
        Buku03 bk1 = new Buku03();
        bk1.judul     = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman   = 198;
        bk1.stok      = 13;
        bk1.harga     = 71000;
        System.out.println();
        bk1.terjual(5);
        bk1.tampilInformasi();
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println();


        Buku03 bk2 = new Buku03("Self Reward", "Maheera Ayesha", 160, 29, 60000 );
        bk2.terjual(10);
        bk2.tampilInformasi();
        // bk2.hitungHargaTotal(10);
        // bk2.hitungDiskon(10);
        // bk2.hitungHargaBayar(10);
        System.out.println();
       
       

        Buku03 bukuAida = new Buku03("Antara Aku dan Dia", "Aida Rahma", 200, 99, 20000 );
        bukuAida.terjual (4);
        bukuAida.tampilInformasi();
        bukuAida.hitungHargaTotal(4);
        bukuAida.hitungDiskon(4);
        bukuAida.hitungHargaBayar(4);
        System.out.println();

        
    }
}
