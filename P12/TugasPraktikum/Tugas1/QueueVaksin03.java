package P12.TugasPraktikum.Tugas1;

public class QueueVaksin03 {
    Node03 head, tail;
    int size;

    public QueueVaksin03() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(int noQue, String nama) {
        if (isEmpty()) {
            head = tail = new Node03(null, noQue, nama, null);
        } else {
            Node03 newNode = new Node03(tail, noQue, nama, null);
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Antrian Kosong!");
        } else {
            System.out.println(head.nama + " telah selesai divaksinasi.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Daftar Penerima Vaksin kosong");
        } else {
            System.out.println("*************************");
            System.out.println("Daftar Pengantri Vaksin");
            System.out.println("*************************");
            System.out.println("|No.               |Nama");
            Node03 current = head;
            while (current != null) {
                System.out.printf("|%d               |%s\n", current.noQue, current.nama);
                current = current.next;
            }
            System.out.println("Sisa Antrian: " + size);
        }
    }
}
