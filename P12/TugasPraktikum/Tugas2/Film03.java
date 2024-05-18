package P12.TugasPraktikum.Tugas2;

public class Film03 {
    int id;
    String judul;
    double rating;
    Film03 prev, next;

    Film03(int id, String judul, double rating, Film03 prev, Film03 next) {
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = prev;
        this.next = next;
    }
}
