package P3.ArrayBalok;

public class Balok03 {
    public int panjang;
    public int lebar;
    public int tinggi;

    public Balok03(){
       panjang = 0;
       lebar = 0;
       tinggi = 0;
    }

    public Balok03 (int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}
