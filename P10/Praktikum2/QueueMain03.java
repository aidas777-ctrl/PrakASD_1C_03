package P10.Praktikum2;

import java.util.Scanner;

public class QueueMain03 {
    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian terbelakang");
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
                    System.out.print("No rekening: ");
                    String norek = sc03.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc03.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc03.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc03.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc03.nextDouble();
                    Nasabah03 nb = new Nasabah03(norek, nama, alamat, umur, saldo);
                    sc03.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah03 data = antri.Dequeue();
                    if (!" ".equals(data.norek) && !" ".equals(data.nama) && !" ".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " " + data.alamat
                                + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}
