package P1;

public class fungsi03_pertanyaan2 {
    public static void main(String[] args) {
        int[][] stockBunga = {
            { 10, 5, 15, 7 },
            { 6, 11, 9, 12 },
            { 2, 10, 10, 5 },
            { 5, 7, 12, 9 }
    };

    kurangiStok(stockBunga, 4, 1); 
    kurangiStok(stockBunga, 4, 2); 
    kurangiStok(stockBunga, 4, 4); 


    tampilkanJumlahStok(stockBunga);
}

static void tampilkanJumlahStok(int[][] stockBunga) {
    System.out.println("==================================================");
    System.out.println("Jumlah Stok Setiap Jenis Bunga pada Setiap Cabang:");
    System.out.println("==================================================");
    System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",
            "Cabang Toko", "Aglonema", "Keladi", "Alocasia", "Mawar");

    for (int i = 0; i < stockBunga.length; i++) {
        System.out.printf("%-15s%-15d%-15d%-15d%-15d\n",
                "RoyalGarden " + (i + 1),
                stockBunga[i][0], 
                stockBunga[i][1], 
                stockBunga[i][2], 
                stockBunga[i][3]  
        );
    }
}

static void kurangiStok(int[][] stockBunga, int cabang, int jenisBunga) {
    if (cabang > 0 && cabang <= stockBunga.length && jenisBunga > 0 && jenisBunga <= stockBunga[cabang - 1].length) {
        stockBunga[cabang - 1][jenisBunga - 1] -= penguranganJumlah(jenisBunga); 
    } else {
        System.out.println("Cabang atau jenis bunga tidak valid.");
    }
}

static int penguranganJumlah(int jenisBunga) {
    switch (jenisBunga) {
        case 1: 
            return 1;
        case 2: 
            return 2;
        case 3: 
            return 0;
        case 4: 
            return 5;
        default:
            return 0;
    }
}
}
