package P1;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");

        String[] daftarMk = {
                "Pancasila",
                "Konsep Teknologi Informasi",
                "Critical Thinking dan Problem Solving",
                "Matematika Dasar",
                "Bahasa Inggris",
                "Dasar Pemrograman",
                "Praktikum Dasar Pemrograman",
                "Keselamatan dan Kesehatan Kerja"
        };
        int[] sks = { 2, 2, 2, 3, 2, 2, 3, 2 };
        double[] nilai = new double[daftarMk.length];
        for (int i = 0; i < daftarMk.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + daftarMk[i] + ": ");
            nilai[i] = input03.nextDouble();
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("======================");
        System.out.printf("%-40s %-15s %-15s %-15s%n",
                "Mata Kuliah",
                "Nilai Angka",
                "Nilai Huruf",
                "Bobot Nilai");

        double totalBobotNilai = 0;
        double totalSks = 0;

        for (int i = 0; i < daftarMk.length; i++) {
            String nilaiHuruf;
            double bobot;

            if (nilai[i] >= 80 && nilai[i] <= 100) {
                nilaiHuruf = "A";
                bobot = 4.00;
            } else if (nilai[i]>= 73 && nilai[i] < 80) {
                nilaiHuruf = "B+";
                bobot = 3.5;
            } else if (nilai[i] >= 65 && nilai[i] < 73) {
                nilaiHuruf = "B";
                bobot = 3.0;
            } else if (nilai[i] >= 60 && nilai[i] < 65) {
                nilaiHuruf = "C+";
                bobot = 2.5;
            } else if (nilai[i] >= 50 && nilai[i] < 60) {
                nilaiHuruf = "C";
                bobot = 2.0;
            } else if (nilai[i] >= 39 && nilai[i] < 50) {
                nilaiHuruf = "D";
                bobot = 1.0;
            } else {
                nilaiHuruf = "E";
                bobot = 0.0;
            }
            totalSks += sks[i];
            totalBobotNilai += bobot * sks[i];
            System.out.printf("%-40s %-15.2f %-15s %-15.2f%n",
                    daftarMk[i],
                    nilai[i],
                    nilaiHuruf,
                    bobot);
        }

        double nilaiAkhir = totalBobotNilai / totalSks;
        nilaiAkhir = Math.round(nilaiAkhir * 100.0) / 100.0;
        System.out.println("===============================================================");
        System.out.println("IP : " + nilaiAkhir);

    }
}
