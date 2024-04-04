package P7;

import java.util.Scanner;

public class BukuMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku03 data = new PencarianBuku03();

        Buku03 m = new Buku03(111, "Algoritma", 2019, "Wahyuni", 5);
        Buku03 m1 = new Buku03(123, "Big Data", 2020, "Susilo", 3);
        Buku03 m2 = new Buku03(125, "Desain UI", 2021, "Supriadi", 3);
        Buku03 m3 = new Buku03(126, "Web Programing", 2022, "Pustaka Adi", 2);
        Buku03 m4 = new Buku03(127, "Etika Mahasiswa", 2023, "Darmawan Adi", 2);

        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);


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
        data.TampilData(cari, posisi);

        Buku03 dataBuku = data.FindBuku(cari);
        if (dataBuku != null) {
            System.out.println("Data Buku yang ditemukan:");
            dataBuku.tampilDataBuku();
        } else {
            System.out.println("Data Buku tidak ditemukan.");
        }
    }
}
