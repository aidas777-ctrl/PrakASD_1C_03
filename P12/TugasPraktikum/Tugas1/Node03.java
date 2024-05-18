package P12.TugasPraktikum.Tugas1;

public class Node03 {
    int noQue;
    String nama;
    Node03 prev, next;

    Node03 (Node03 prev, int noQue, String nama, Node03 next){
        this.prev = prev;
        this.noQue = noQue;
        this.nama = nama;
        this.next = next;
    }
}
