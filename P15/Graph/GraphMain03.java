package P15.Graph;

import java.util.Scanner;

public class GraphMain03 {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        Graph03 gedung = new Graph03(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);

        boolean menu = true;
        while (menu) {
            System.out.println("Menu : ");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge");
            System.out.println("8. Exit");
            System.out.print("Pilih menu: ");
            int pilih = sc03.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuan = sc03.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = sc03.nextInt();
                    gedung.addEdge(asal, tujuan, jarak);
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc03.nextInt();
                    gedung.removeEdge(asal, tujuan);
                    break;
                case 3:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    gedung.degree(asal);
                    break;
                case 4:
                    gedung.printGraph();
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc03.nextInt();
                    if (gedung.cekTetangga(asal, tujuan)) {
                        System.out.println(
                                "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " bertetangga");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan)
                                + " tidak bertetangga");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    asal = sc03.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    tujuan = sc03.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    jarak = sc03.nextInt();
                    gedung.updateJarak(asal, tujuan, jarak);
                    break;
                case 7:
                    System.out.println("Jumlah edge dalam graf: " + gedung.hitungEdge());
                    break;
                case 8:
                    menu = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        }
        sc03.close();
    }
}