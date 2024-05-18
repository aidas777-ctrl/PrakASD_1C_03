package P12.TugasPraktikum.Tugas2;

import java.util.Scanner;

public class FilmMain03 {
    public static void main(String[] args) {
        Scanner sc03 = new Scanner(System.in);
        DoubleLinkedListsFilm03 list = new DoubleLinkedListsFilm03();
        while (true) {
            System.out.println("===============================");
            System.out.println("DATA FILM LAYAR LEBAR");
            System.out.println("===============================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("===============================");
            System.out.print("Pilih menu: ");
            int pilih = sc03.nextInt();

            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Data Film Posisi Awal");
                    System.out.print("ID Film: ");
                    int idAwal = sc03.nextInt();
                    sc03.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAwal = sc03.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAwal = sc03.nextDouble();
                    list.addFirst(idAwal, judulAwal, ratingAwal);
                    break;
                case 2:
                    System.out.println("Masukkan Data Film Posisi Akhir");
                    System.out.print("ID Film: ");
                    int idAkhir = sc03.nextInt();
                    sc03.nextLine();
                    System.out.print("Judul Film: ");
                    String judulAkhir = sc03.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingAkhir = sc03.nextDouble();
                    list.addLast(idAkhir, judulAkhir, ratingAkhir);
                    break;
                case 3:
                    System.out.println("Masukkan Data Film Urutan ke-");
                    System.out.print("ID Film: ");
                    int idIndeks = sc03.nextInt();
                    sc03.nextLine();
                    System.out.print("Judul Film: ");
                    String judulIndeks = sc03.nextLine();
                    System.out.print("Rating Film: ");
                    double ratingIndeks = sc03.nextDouble();
                    System.out.print("Data film ini akan masuk di urutan ke-: ");
                    int index = sc03.nextInt();
                    list.add(index - 1, idIndeks, judulIndeks, ratingIndeks);
                    break;
                case 4:
                    list.removeFirst();
                    break;
                case 5:
                    list.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan indeks film yang akan dihapus: ");
                    int idx = sc03.nextInt();
                    list.remove(idx - 1);
                    break;
                case 7:
                    list.print();
                    break;
                case 8:
                    System.out.print("Cari Data Film\nMasukkan ID Film yang dicari: ");
                    int searchId = sc03.nextInt();
                    list.search(searchId);
                    break;
                case 9:
                    if (list.isEmpty() || list.size() == 1) {
                        System.out.println("Data Kosong.");
                    } else {
                        list.sortFilmDesc();
                        System.out.println("Data film berhasil diurutkan berdasarkan rating secara descending.");
                        list.print();
                    }
                    break;
                case 10:
                    sc03.close();
                    return;
                default:
                    System.out.println("\nPilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
}
