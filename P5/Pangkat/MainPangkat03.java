package P5.Pangkat;

import java.util.Scanner;

public class MainPangkat03 {
    public static void main(String[] args) {
        Scanner aida03 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen yang akan dihitung: ");
        int elemen = aida03.nextInt();

        Pangkat03[] png = new Pangkat03[elemen];

        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai yang akan dipangkatkan: ");
            int nilai = aida03.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = aida03.nextInt();
            png[i] = new Pangkat03(nilai, pangkat);
        }

        System.out.println("\nHASIL PANGKAT  BRUTE FORCE");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
            System.out.println();
        }

        System.out.println("\nHASIL PANGKAT  DIVIDE CONQUER");
        for (int i = 0; i < elemen; i++) {
            System.out.print("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                    + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
            System.out.println();
        }
    }
}
