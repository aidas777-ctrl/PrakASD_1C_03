package P5.SumArray;

import java.util.Scanner;

public class MainSum03 {
    public static void main(String[] args) {
        Scanner aida03 = new Scanner(System.in);

        System.out.println("============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan Jumlah Bulan : ");
        int elm = aida03.nextInt();

        Sum03 sm = new Sum03(elm);
        System.out.println("============================================================");
        for (int i = 0; i < sm.elemen; i++) {
            System.out.print("Masukkan untung bulan ke - " + (i + 1) + " : ");
            sm.keuntungan[i] = aida03.nextDouble();
         }

        System.out.println("============================================================");
        System.out.println("Algoritma Brute Force");
        System.out.println("Total keuntungan perusahaan selama " + sm.elemen +
                           " bulan adalah = " + sm.totalBF(sm.keuntungan));
        System.out.println("============================================================");
        System.out.println("Algoritma Divide Conquer");
        System.out.printf("Total keuntungan perusahaan selama  %d bulan adalah %.2f\n " ,sm.elemen, sm.totalDC(sm.keuntungan,0, sm.elemen - 1));
    }
}
