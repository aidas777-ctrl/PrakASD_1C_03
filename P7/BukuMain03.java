package P7;

import java.util.Scanner;

public class BukuMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku03 data = new PencarianBuku03();
        int jumBuku = 5;

        System.out.println("--------------------------------------------------------");
        System.out.println("Masukkan data Buku secara urut dari kodeBuku terkecil");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("--------------------------------------------------------");
            System.out.print("Kode Buku  \t : ");
            int kodeBuku = s.nextInt();
            System.out.print("Judul buku \t : ");
            String judulBuku = s1.nextLine();
            System.out.print("Tahun Terbit \t : ");
            int tahunTerbit = s.nextInt();
            System.out.print("Pengarang \t : ");
            String pengarang = s1.nextLine();
            System.out.print("Stock    \t : ");
            int stock = s.nextInt();

            Buku03 m = new Buku03(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambah(m);
        }

        System.out.println("----------------------------------------------------");
        System.out.println("Data keseluruhan Buku");
        data.tampil();

        System.out.println("_____________________________________________");
        System.out.println("_____________________________________________");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Kode Buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.tampilPoisisi(cari, posisi);
        data.TampilData(cari,posisi);
    }
}
