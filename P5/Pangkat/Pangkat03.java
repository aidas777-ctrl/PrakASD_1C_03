package P5.Pangkat;

public class Pangkat03 {
    public int nilai, pangkat;

    public Pangkat03(int nilai, int pangkat){
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    int pangkatBF(int a, int n) {
        int hasil = 1;
        for (int i = 0; i < n; i++) {
            hasil *= a;
        }
        return hasil;
    }

    int pangkatDC(int a, int n) {
        if (n == 1) {
            return a;
        } else {
            int hasil = pangkatDC(a, n / 2);
            if (n % 2 == 1) {
                return (pangkatDC(a, n / 2) * hasil * a);
            } else {
                return (pangkatDC(a, n / 2) * hasil);
            }
        }
    }
}
