package P6;

public class MainBuku03 {
    public static void main(String[] args) {
        DaftarBuku03 listBuku = new DaftarBuku03();

        Buku03 m = new Buku03(20215, "Algoritma", 2019, "Wahyuni", 5);
        Buku03 m1 = new Buku03(20214, "Big Data", 2020, "Susilo", 3);
        Buku03 m2 = new Buku03(20212, "Desain UI", 2021, "Supriadi", 6);
        Buku03 m3 = new Buku03(20211, "Web Programing", 2022, "Pustaka Adi", 2);
        Buku03 m4 = new Buku03(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

        listBuku.tambah(m);
        listBuku.tambah(m1);
        listBuku.tambah(m2);
        listBuku.tambah(m3);
        listBuku.tambah(m4);

        System.out.println("");
        System.out.println("Data sebelum diurutkan");
        listBuku.tampil();

        System.out.println("");
        System.out.println("Data setelah diurutkan secara Asc berdasarkan stock");
        listBuku.bubbleSort();
        listBuku.tampil();

        System.out.println("");
        System.out.println("Data setelah diurutkan secara Desc berdasarkan stock Menggunakan selection short");
        listBuku. selectionSort();
        listBuku. tampil();
    }
}
