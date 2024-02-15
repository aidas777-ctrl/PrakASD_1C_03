package P1;

import java.util.Scanner;

public class pemilihan_nilai {

    public static void main(String[] args) {
        Scanner input03 = new Scanner(System.in);
        float tugas, kuis, uts, uas;

        System.out.print("Nilai Tugas  : ");
        tugas = input03.nextFloat();
        System.out.print("Nilai Kuis   : ");
        kuis = input03.nextFloat();
        System.out.print("Nilai UTS    : ");
        uts = input03.nextFloat();
        System.out.print("Nilai UAS    : ");
        uas = input03.nextFloat();

        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("======================");
            System.out.println("Nilai tidak valid");
            System.out.println("======================");

        } else {
            float total = (tugas * 0.2F) + (kuis * 0.2F) + (uts * 0.3F) + (uas * 0.3F);

            String message = total < 65 ? "MAAF ANDA TIDAK LULUS" : "SELAMAT ANDA LULUS";
            System.out.println("======================");
            System.out.println("Nilai Akhir   : " + total);

            if (total >= 0 && total <= 100) {
                if (total > 80 && total <= 100) {
                    System.out.println("Nilai Huruf   : A");
                } else if (total > 73 && total <= 80) {
                    System.out.println("Nilai Huruf   : B+");

                } else if (total > 65 && total <= 73) {
                    System.out.println("Nilai Huruf   : B");

                } else if (total > 60 && total <= 65) {
                    System.out.println("Nilai Huruf   : C+");

                } else if (total > 50 && total <= 60) {
                    System.out.println("Nilai Huruf   : C");

                } else if (total > 39 && total <= 50) {
                    System.out.println("Nilai Huruf   : D");
                } else {
                    System.out.println("Nilai Huruf   : E");
                }
            } else {
                System.out.println("Nilai tidak valid");

            }
            System.out.println("======================");
            System.out.println(message);
        }
    }
}
