package P5.Mobil;

public class Mobil03 {
    String merk;
    String tipe;
    int tahun;
    int top_acceleration;
    int top_power;

    public Mobil03(String merk, String tipe, int tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }
    

    public static int cariMaxAcceleration(Mobil03[] mobil, int l, int r) {
        if (l == r) {
            return mobil[l].top_acceleration;
        }
        int mid = (l + r) / 2;
        int maxLeft = cariMaxAcceleration(mobil, l, mid);
        int maxRight = cariMaxAcceleration(mobil, mid + 1, r);
        return Math.max(maxLeft, maxRight);
    }

    public static int cariMinAcceleration(Mobil03[] mobil, int l, int r) {
        if (l == r) {
            return mobil[l].top_acceleration;
        }
        int mid = (l + r) / 2;
        int minLeft = cariMinAcceleration(mobil, l, mid);
        int minRight = cariMinAcceleration(mobil, mid + 1, r);
        return Math.min(minLeft, minRight);
    }

    public static double hitungRataPower(Mobil03[] mobil) {
        double totalPower = 0;
        for (Mobil03 m : mobil) {
            totalPower += m.top_power;
        }
        return totalPower / mobil.length;
    }
}
