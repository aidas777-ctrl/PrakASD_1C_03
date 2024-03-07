package P3.BangunDatar;

import P3.AOBPersegiPanjang.PersegiPanjang03;
import P3.ArrayBalok.Segitiga03;

public class BangunDatar03 {
    Segitiga03 [] Segitigas;
    PersegiPanjang03 [] PersegiPanjangs;


    void tambahSgt (Segitiga03[]segitiga){
        this.Segitigas = segitiga;
    }

    void tambahPp(PersegiPanjang03[]persegiPanjang){
        this.PersegiPanjangs = persegiPanjang;
    }

    void tampilBangunDatar(){
        for (int i = 0; i < PersegiPanjangs.length; i++) {
            System.out.println("Persegi Panjang " + (i+1));
            System.out.println("Lebar: " +  PersegiPanjangs[i].lebar);
            System.out.println("Panjang: " + PersegiPanjangs[i].panjang);
        }

        System.out.println("==========================================");
        for (int j = 0; j < Segitigas.length; j++) {
            System.out.println("Segitiga " + (j+1));
            System.out.println("Alas: " + Segitigas[j].alas);
            System.out.println("Tinggi: " + Segitigas[j].tinggi);
        }
    }
}