package P7;

import java.util.Scanner;

public class BukuMain03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianBuku03 data = new PencarianBuku03();

        Buku03 m = new Buku03("123", "Algoritma", 2019, "Wahyuni", 5);
        Buku03 m1 = new Buku03("127", "Big Data", 2020, "Susilo", 3);
        Buku03 m2 = new Buku03("125", "Desain UI", 2021, "Supriadi", 3);
        Buku03 m3 = new Buku03("111", "Web Programing", 2022, "Pustaka Adi", 2);
        Buku03 m4 = new Buku03("126", "Etika Mahasiswa", 2023, "Darmawan Adi", 2);
        Buku03 m5 = new Buku03("128", "Etika Mahasiswa", 2023, "Darmawan Adi", 2);

        data.tambah(m);
        data.tambah(m1);
        data.tambah(m2);
        data.tambah(m3);
        data.tambah(m4);
        data.tambah(m5);

        System.out.println("---------------------");
        System.out.println("Data keseluruhan Buku");
        System.out.println("---------------------");
        data.tampil();

        System.out.println("------------------------------------------------------");
        System.out.println("Data keseluruhan Buku Setelah diurutkan berdasar judul");
        System.out.println("------------------------------------------------------");
        data.sortBooks();
        data.tampil();


        // System.out.println("________________________________________");
        // System.out.println("________________________________________");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Kode Buku yang dicari: ");
        // System.out.print("Kode Buku : ");
        // String cari = s.nextLine();

        // System.out.println("================================");
        // System.out.println("menggunakan sequential Search");
        // System.out.println("================================");
        // int posisi = data.FindSeqSearch(cari);
        // data.tampilPoisisi(cari, posisi);
        // data.tampilData(cari, posisi);

        // // Buku03 dataBuku = data.FindBuku(cari);
        // // if (dataBuku != null) {
        // // System.out.println("Data Buku yang ditemukan:");
        // // dataBuku.tampilDataBuku();
        // // } else {
        // // System.out.println("Data Buku tidak ditemukan.");
        // // }

        // System.out.println("================================");
        // System.out.println("menggunakan binary search");
        // System.out.println("================================");
        // posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        // data.tampilPoisisi(cari, posisi);
        // data.tampilData(cari, posisi);
        
      
        System.out.println("---------------------------------");
        System.out.println("Masukkan Judul Buku yang dicari: ");
        System.out.println("---------------------------------");
        System.out.print("Judul Buku : ");
        String cari = s.nextLine(); 

        System.out.println("================================");
        System.out.println("menggunakan sequiential");
        System.out.println("================================");
        int posisiSeq = data.FindSeqSearchJudul(cari);
        data.tampilPoisisi(cari, posisiSeq);
        data.tampilData(cari, posisiSeq);

        System.out.println("================================");
        System.out.println("menggunakan binary");
        System.out.println("================================");
        int posisiBin = data.FindBinarySearchJudul(cari, 0 , data.idx -1); 
        data.tampilPoisisi(cari, posisiBin);
        data.tampilData(cari, posisiBin);
        data.peringatan(cari);
    }
}
