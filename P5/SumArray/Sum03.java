package P5.SumArray;

public class Sum03 {

    int jmlPerusahaan;
    int[] jmlBulan;
    double[][] keuntungan;

    Sum03(int jmlPerusahaan) {
        this.jmlPerusahaan = jmlPerusahaan;
        this.jmlBulan = new int[jmlPerusahaan];
        this.keuntungan = new double[jmlPerusahaan][];

    }

    public void Keuntungan(int perusahaan, int jmlBulan) {
        this.jmlBulan[perusahaan] = jmlBulan;
        this.keuntungan[perusahaan] = new double[jmlBulan];
    }

    double totalBF(int perusahaan) {
        double total = 0;
        for (int i = 0; i < jmlBulan[perusahaan]; i++) {
            total += keuntungan[perusahaan][i];
        }
        return total;
    }

    double totalDC(int perusahaan, int l, int r) {
        double total = 0;
        if (l == r) {
            total = keuntungan[perusahaan][l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(perusahaan, l, mid);
            double rsum = totalDC(perusahaan, mid + 1, r);
            return lsum + rsum;
        }
        return total;
    }
}
