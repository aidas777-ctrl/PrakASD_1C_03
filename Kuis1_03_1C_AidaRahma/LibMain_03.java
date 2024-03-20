package Kuis1_03_1C_AidaRahma;

import java.util.ArrayList;
import java.util.Scanner;

public class LibMain_03 {
    public static void main(String[] args) {
        Scanner aida03 = new Scanner(System.in);
        Book_03[] bukuArray = new Book_03[4];
        ArrayList<Transaksi_03> daftarTransaksi = new ArrayList<>();

        boolean exit = false;
        while (!exit) {
            System.out.print("\033[H\033[2J");
            System.out.println("===== JTI Library =====");
            System.out
                    .print("Menu : \n1. Input Data Buku\n2. Display Data\n3. Kurangi Stock \n4. Peminjaman\n5. Exit\n");

            System.out.print("Select menu : ");
            String pilihMenu = aida03.nextLine();

            switch (pilihMenu) {
                case "1":
                    for (int i = 0; i < bukuArray.length; i++) {
                        System.out.println("==================");
                        System.out.print("Kode Buku    : ");
                        String kodeBuku = aida03.nextLine();
                        System.out.print("Judul Buku   : ");
                        String judulBuku = aida03.nextLine();
                        System.out.print("Pengarang    : ");
                        String pengarang = aida03.nextLine();
                        System.out.print("Tahun Terbit : ");
                        int tahunTerbit = aida03.nextInt();
                        System.out.print("Stock        : ");
                        int stock = aida03.nextInt();
                        aida03.nextLine();

                        bukuArray[i] = new Book_03(kodeBuku, judulBuku, pengarang, tahunTerbit, stock);

                    }
                    System.out.println("Data Berhasil Ditambahkan!!");
                    System.out.print("Kembali ke menu (y)? ");
                    if (aida03.nextLine().equalsIgnoreCase("y")) {
                        break;
                    } else {
                        exit = true;
                    }
                    break;

                case "2":
                    for (Book_03 buku : bukuArray) {
                        if (buku != null) {
                            buku.displayData();
                        }
                    }
                    System.out.print("Kembali ke menu (y)? ");
                    if (aida03.nextLine().equalsIgnoreCase("y")) {
                        break;
                    } else {
                        exit = true;
                    }
                    break;

                case "3":
                    System.out.println("Kurangi Stok Karena Rusak");
                    System.out.print("Input kode Buku : ");
                    String kurangi = aida03.nextLine();

                    Book_03 stockUpdate = null;
                    for (Book_03 buku : bukuArray) {
                        if (buku != null && buku.getKodeBuku().equalsIgnoreCase(kurangi)) {
                            stockUpdate = buku;
                        }
                    }

                    if (stockUpdate != null) {
                        System.out.println("Jumlah Rusak: ");
                        int stokRusak = aida03.nextInt();
                        aida03.nextLine();

                        if (stokRusak <= stockUpdate.getStock()) {
                            stockUpdate.setStock(stockUpdate.getStock() - stokRusak);

                        }
                        stockUpdate.displayData();
                    }
                    System.out.print("Kembali ke menu (y)? ");
                    if (aida03.nextLine().equalsIgnoreCase("y")) {
                        break;
                    } else {
                        exit = true;
                    }
                    break;

                case "4":
                    System.out.println("Peminjaman");
                    System.out.print("Input Kode Buku : ");
                    String pinjam = aida03.nextLine();

                    Book_03 meminjam = null;
                    for (Book_03 buku : bukuArray) {
                        if (buku != null && buku.getKodeBuku().equalsIgnoreCase(pinjam)) {
                            meminjam = buku;
                        }
                    }
                    if (meminjam != null) {
                        System.out.println("jumlah Pinjam  :");
                        int jmlPinjam = aida03.nextInt();
                        aida03.nextLine();

                        if (jmlPinjam <= meminjam.getStock()) {
                            meminjam.setStock(meminjam.getStock() - jmlPinjam);

                        }
                        meminjam.displayData();
                    }
                    System.out.print("Kembali ke menu (y)? ");
                    if (aida03.nextLine().equalsIgnoreCase("y")) {
                        break;
                    } else {
                        exit = true;
                    }
                    break;

                case "5":
                    exit = true;
                    break;
                default:
                    break;
            }

        }
    }
}
