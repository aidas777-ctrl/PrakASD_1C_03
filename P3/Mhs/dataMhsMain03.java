package P3.Mhs;

import java.util.Scanner;

public class dataMhsMain03 {
    public static void main(String[] args) {

        dataMhs03[] mhsArray = new dataMhs03[3];

        Scanner aida03 = new Scanner(System.in);

        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
            System.out.print("Masukkan Nama : ");
            String nama = aida03.nextLine();
            System.out.print("Masukkan Nim : ");
            String nim = aida03.nextLine();
            System.out.print("Masukkan Jenis Kelamin (L/P) : ");
            char jenisKelamin = aida03.nextLine().charAt(0);
            System.out.print("Masukkan IPK : ");
            double ipk = aida03.nextDouble();
            aida03.nextLine();

            mhsArray[i] = new dataMhs03(nama, nim, jenisKelamin, ipk);
        }

        for (int i = 0; i < mhsArray.length; i++) {
            System.out.println("\nData Mahasiswa ke-" + (i + 1));
            mhsArray[i].tampilInfo();
        }
    }
}
