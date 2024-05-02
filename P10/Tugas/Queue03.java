package P10.Tugas;

public class Queue03 {
    Pembeli03[] antrian;
    int front;
    int rear;
    int size;
    int max;

    public Queue03(int n) {
        max = n;
        antrian = new Pembeli03[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void Enqueue(Pembeli03 antri) {
        if (IsFull()) {
            System.out.println("Queue sudah penuh");
            System.exit(0);
        } else {
            if (IsEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli03 Dequeue() {
        Pembeli03 antri = null;
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
            System.exit(0);
        } else {
            antri = antrian[front];
            size--;
            if (IsEmpty()) {
                front = rear = -1;
            } else {
                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void peek() {
        if (!IsEmpty()) {
            System.out.println("Antrian terdepan: " + antrian[front].nama + " " + antrian[front].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }

    public void peekRear() {
        if (!IsEmpty()) {
            System.out.println("Antrian terbelakang: " + antrian[rear].nama + " " + antrian[rear].noHP);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public int peekPosition(String nama) {
        if (!IsEmpty()) {
            int position = -1;
            int i = front;
            int count = 1;
            while (i != rear) {
                if (antrian[i].nama.equals(nama)) {
                    position = count;
                    break;
                }
                i = (i + 1) % max;
                count++;
            }
            if (antrian[i].nama.equals(nama)) {
                position = count;
            }
            if (position != -1) {
                System.out.println("Posisi antrian pembeli " + nama + " adalah ke-" + position);
            } else {
                System.out.println("Pembeli " + nama + " tidak ditemukan dalam antrian");
            }
            return position;
        } else {
            System.out.println("Queue masih kosong");
            return -1;
        }
    }

    public void daftarPembeli() {
        if (IsEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama + " " + antrian[i].noHP);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama + " " + antrian[i].noHP);
            System.out.println("Jumlah elemen = " + size);
        }
    }
}
