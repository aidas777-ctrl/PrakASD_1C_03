package P3.ArrayBalok;

public class Segitiga03 {
    public int alas;
    public int tinggi;

    public Segitiga03(int a, int t) {
        alas = a;
        tinggi = t;
    }

    public int HitungLuas() {
        return alas * tinggi / 2;
    }

    public double HitungKeliling() {
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }

    public static void main(String[] args) {
        Segitiga03[] sgArray = new Segitiga03[4];

        sgArray[0] = new Segitiga03(10, 4);
        sgArray[1] = new Segitiga03(20, 10);
        sgArray[2] = new Segitiga03(15, 6);
        sgArray[3] = new Segitiga03(25, 10);

        
    }

}
