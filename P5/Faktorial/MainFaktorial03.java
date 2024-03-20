package P5.Faktorial;

import java.util.Scanner;

public class MainFaktorial03 {
    public static void main(String[] args) {
        Scanner aida03 = new Scanner(System.in);
        System.out.println("---------------------------------");
        System.out.println("Masukkan jumlah elemen: ");
        int iJml = aida03.nextInt();

        Faktorial03[] fk = new Faktorial03[iJml];
        for(int i = 0; i < iJml; i++){
            fk[i] = new Faktorial03();
            System.out.println("masukkan nilai data ke-" +(i+1)+":");
            fk[i].nilai = aida03.nextInt(); 
        }

        System.out.println("HASIL - BRUTE FORCE");
        for(int i = 0; i < iJml; i++){
            System.out.println("Hasil penghitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for(int i = 0; i < iJml; i++){
            System.out.println("Hasil penghitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktorialDC(fk[i].nilai));

    }
}
}
