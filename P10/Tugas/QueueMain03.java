package P10.Tugas;

import java.util.Scanner;

public class QueueMain03 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian terbelakang");
        System.out.println("5. Tampilkan daftar pembeli");
        System.out.println("6. Cek  antrian pembeli");
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc03.nextInt();
        Queue03 antri = new Queue03(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc03.nextInt();
            sc03.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc03.nextLine();
                    System.out.print("No HP: ");
                    int noHP = sc03.nextInt();
                    sc03.nextLine();
                    Pembeli03 pb = new Pembeli03(nama, noHP);
                    antri.Enqueue(pb);
                    break;
                case 2:
                    Pembeli03 antrian = antri.Dequeue();
                    if (!" ".equals(antrian.nama) && + antrian.noHP != 0);
                    System.out.println("Antrian yang keluar: " + antrian.nama + " " + antrian.noHP );
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    antri.daftarPembeli();
                    break;
                case 6:
                    System.out.println("Masukkan nama: ");
                    String pilihnama = sc03.nextLine();
                    antri.peekPosition(pilihnama);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6);
    }
}
