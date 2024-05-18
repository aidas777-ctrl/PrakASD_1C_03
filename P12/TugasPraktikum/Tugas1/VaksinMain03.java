package P12.TugasPraktikum.Tugas1;

import java.util.Scanner;

public class VaksinMain03 {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        QueueVaksin03 que = new QueueVaksin03();

        while (true) {
            System.out.println("*****************************");
            System.out.println("PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("*****************************");
            System.out.println("1. Tambah Data Penerima Vaksin");
            System.out.println("2. Hapus Data Pengantri Vaksin");
            System.out.println("3. Daftar Penerima Vaksin");
            System.out.println("4. Keluar");
            System.out.println("*****************************");
            int pilih = sc03.nextInt();
            sc03.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.print("Nomor Antrian: ");
                    int nomorAntrian = sc03.nextInt();
                    sc03.nextLine();
                    System.out.print("Nama Penerima: ");
                    String nama = sc03.nextLine();
                    que.addLast(nomorAntrian, nama);
                    break;
                case 2:
                    que.removeFirst();
                    break;
                case 3:
                    que.print();
                    break;
                case 4:
                    sc03.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        }
    }
}
