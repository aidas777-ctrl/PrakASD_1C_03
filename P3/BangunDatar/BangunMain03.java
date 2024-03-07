package P3.BangunDatar;

import P3.AOBPersegiPanjang.PersegiPanjang03;
import P3.ArrayBalok.Segitiga03;

public class BangunMain03 {
public static void main(String[] args) {
    
    Segitiga03 sg1 = new Segitiga03(5, 10);
    Segitiga03 sg2 = new Segitiga03(10, 15);
    Segitiga03 sg3 = new Segitiga03(15, 20);
    PersegiPanjang03 pp1 = new PersegiPanjang03(5, 10);
    PersegiPanjang03 pp2 = new PersegiPanjang03(2, 8);
    PersegiPanjang03 pp3 = new PersegiPanjang03(10, 15);

    Segitiga03[] s = new Segitiga03[3];
    PersegiPanjang03[] p = new PersegiPanjang03[3];

    s[0] = sg1;
    s[1] = sg2;
    s[2] = sg3;
    p[0] = pp1;
    p[1] = pp2;
    p[2] = pp3;

    BangunDatar03 bd = new BangunDatar03();
    bd.tambahSgt(s);
    bd.tambahPp(p);
    bd.tampilBangunDatar();
 }
}
