package P5.SumArray;

import java.util.Scanner;

public class MainSum03 {
    public static void main(String[] args) {
        Scanner aida03 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah Perusahaan : ");
        int jmlPerusahaan = aida03.nextInt();

        Sum03 sm = new Sum03(jmlPerusahaan);

        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Masukkan Jumlah Bulan untuk perusahaan " + (i + 1));
            int jmlBulan = aida03.nextInt();
            sm.Keuntungan(i, jmlBulan);

            System.out.println("Masukkan Data Untung untuk Perusahaan " + (i + 1));
            for (int j = 0; j < jmlBulan; j++) {
                System.out.print("Masukkan keuntungan pada bulan ke-" + (j + 1) + " : ");
                double untung = aida03.nextDouble();
                sm.keuntungan[i][j] = untung;
            }
        }

        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + sm.jmlBulan[i]
                    + " bulan adalah : " + sm.totalBF(i));
        }

        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        for (int i = 0; i < jmlPerusahaan; i++) {
            System.out.println("Total keuntungan perusahaan " + (i + 1) + " selama " + sm.jmlBulan[i]
                    + " bulan adalah : " + sm.totalDC(i, 0, sm.jmlBulan[i] - 1));
        }

    }
}
