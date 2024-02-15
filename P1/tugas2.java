package P1;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("-------------------");
            System.out.println("Menu:");
            System.out.println("-------------------");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("0. Keluar");
            System.out.println("-------------------");
            System.out.print("Pilih menu (angka): ");
            pilihan = input03.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 0:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }

        } while (pilihan != 0);

        input03.close();
    }

    static void hitungKecepatan() {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan jarak (meter): ");
        double jarak = input03.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double waktu = input03.nextDouble();

        double kecepatan = jarak / waktu;
        System.out.println("===============================");
        System.out.println("Kecepatan = " + kecepatan + " m/s");
    }

    static void hitungJarak() {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input03.nextDouble();
        System.out.print("Masukkan waktu (detik): ");
        double waktu = input03.nextDouble();

        double jarak = kecepatan * waktu;
        System.out.println("===============================");
        System.out.println("Jarak = " + jarak + " meter");
    }

    static void hitungWaktu() {
        Scanner input03 = new Scanner(System.in);

        System.out.print("Masukkan jarak (meter): ");
        double jarak = input03.nextDouble();
        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input03.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("===============================");
        System.out.println("Waktu = " + waktu + " detik");
    }
    }
