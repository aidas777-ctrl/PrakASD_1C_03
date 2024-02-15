package P1;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        char[] PLAT = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] KOTA = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' }
        };

        Scanner input03 = new Scanner(System.in);
        System.out.println("==================");
        System.out.print("Masukkan Kode Plat: ");
        char inputKode = input03.next().charAt(0);

        int index = -1;
        for (int i = 0; i < PLAT.length; i++) {
            if (PLAT[i] == inputKode) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("======================================");
            System.out.print("Kota dengan Kode Plat " + inputKode + " adalah ");
            for (char character : KOTA[index]) {
                System.out.print(character);
            }
            System.out.println();
        } else {
            System.out.println("============================");
            System.out.println("Kode plat nomor tidak valid.");
        }
        input03.close();
    }
}
