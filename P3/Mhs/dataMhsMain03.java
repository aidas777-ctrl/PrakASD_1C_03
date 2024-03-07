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

        double totalIPK = 0;
           for (dataMhs03 mhs : mhsArray) {
                totalIPK += mhs.getIPK();
           }
           
        double rataRataIPK = totalIPK / mhsArray.length;

        System.out.println("=========================");
        System.out.println("Rata-rata IPK: " + rataRataIPK);
        System.out.println("=========================");

        dataMhs03 mhsTerbaik = mhsArray[0];
          for (int i = 1; i < mhsArray.length; i++) {

             if (mhsArray[i].getIPK() > mhsTerbaik.getIPK()) {
                mhsTerbaik = mhsArray[i];
             }
          }

        System.out.println("\nMahasiswa dengan IPK terbesar:");
        mhsTerbaik.tampilInfo();
    }
}
