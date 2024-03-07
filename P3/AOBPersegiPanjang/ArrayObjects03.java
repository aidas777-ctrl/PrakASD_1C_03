package P3.AOBPersegiPanjang;

import java.util.Scanner;

public class ArrayObjects03 {

    public static void main(String[] args) {
        PersegiPanjang03[] ppArray = new PersegiPanjang03[3];

        Scanner aida03 = new Scanner(System.in);
        for (int i = 0; i < ppArray.length; i++) {

            ppArray[i] = new PersegiPanjang03();
            System.out.println("Persegi Panjang ke-" + i);

            System.out.print("Masukkan Panjang: ");
            ppArray[i].panjang = aida03.nextInt();

            System.out.print("Masukkan Lebar: ");
            ppArray[i].lebar = aida03.nextInt();
        }

        for (int i = 0; i < ppArray.length; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang: " + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);

        }


       PersegiPanjang03 [][] ppArray2 = new PersegiPanjang03[3][2];
       for (int i = 0; i < ppArray2.length; i++) {
        for (int j = 0; j < ppArray2[i].length; j++) {
            ppArray2[i][j] = new PersegiPanjang03();
            System.out.println("Persegi Panjang ke-" + i + ", " + j);

            System.out.print("Masukkan Panjang: ");
            ppArray2[i][j].panjang = aida03.nextInt();

            System.out.print("Masukkan Lebar: ");
            ppArray2[i][j].lebar = aida03.nextInt();
        }
    }

    for (int i = 0; i < ppArray2.length; i++) {
        for (int j = 0; j < ppArray2[i].length; j++) {
            System.out.println("Persegi Panjang ke-" + i + ", " + j);
            System.out.println("Panjang: " + ppArray2[i][j].panjang + ", lebar: " + ppArray2[i][j].lebar);
        }
    }
    }
}
