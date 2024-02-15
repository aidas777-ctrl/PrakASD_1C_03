package P1;

public class fungsi03_pertanyaan1 {
    public static void main(String[] args) {
        int[][] stockBunga = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 }
        };

        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;
        tampilkanPendapatan(stockBunga, hargaAglonema, hargaKeladi, hargaAlocasia, hargaMawar);
    }

    static void tampilkanPendapatan(int[][] stockBunga, int hargaAglonema, int hargaKeladi, int hargaAlocasia,
            int hargaMawar) {
        System.out.println("==================================================");
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        System.out.println("==================================================");
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "Cabang Toko", "Aglonema", "Keladi", "Alocasia", "Mawar", "Pendapatan");

        for (int i = 0; i < stockBunga.length; i++) {
            int pendapatanCabang = hitungPendapatanCabang(stockBunga[i], hargaAglonema, hargaKeladi, hargaAlocasia,
                    hargaMawar);

            System.out.printf("%-15s%-15d%-15d%-15d%-15d%-15d\n",
                    "RoyalGarden " + (i + 1),
                    stockBunga[i][0],
                    stockBunga[i][1],
                    stockBunga[i][2],
                    stockBunga[i][3],
                    pendapatanCabang);
        }
    }

    static int hitungPendapatanCabang(int[] stockBungaCabang, int hargaAglonema, int hargaKeladi, int hargaAlocasia,
            int hargaMawar) {
        int pendapatanCabang = 0;
        pendapatanCabang += stockBungaCabang[0] * hargaAglonema;
        pendapatanCabang += stockBungaCabang[1] * hargaKeladi;
        pendapatanCabang += stockBungaCabang[2] * hargaAlocasia;
        pendapatanCabang += stockBungaCabang[3] * hargaMawar;
        return pendapatanCabang;
    }
}
