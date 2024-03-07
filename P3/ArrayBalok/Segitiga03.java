package P3.ArrayBalok;

public class Segitiga03 {
    public int alas;
    public int tinggi;

    public Segitiga03(int a, int t){
        alas = a;
        tinggi = t;
    }

    public int HitungLuas(){
        return alas * tinggi/2;
    }

    public double HitungKeliling(){
        double sisiMiring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        return alas + tinggi + sisiMiring;
    }

}
