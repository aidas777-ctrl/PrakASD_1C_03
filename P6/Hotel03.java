package P6;

public class Hotel03 {
    String nama;
    String kota;
    int harga;
    byte bintang;

    public Hotel03(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public void tampilDataHotel() {
        System.out.println("=============================");
        System.out.println("Nama Hotel     : " + nama);
        System.out.println("Nama Kota      : " + kota);
        System.out.println("Harga          : " + harga);
        System.out.println("Rating Bintang : " + bintang);
    }
}
