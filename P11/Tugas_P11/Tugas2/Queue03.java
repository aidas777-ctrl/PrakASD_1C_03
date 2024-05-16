package P11.Tugas_P11.Tugas2;

class Queue03 {
    Node03 head, tail;

    public Queue03() {
        this.head = null;
        this.tail = null;
    }

    void print() {
        if (!isEmpty()) {
            Node03 tmp = head;
            System.out.println("Daftar Antrian Mahasiswa:");
            int counter = 1;
            while (tmp != null) {
                System.out.println(counter + ". " + tmp.data.nama + " (NIM : " + tmp.data.NIM + ")");
                tmp = tmp.next;
                counter++;
            }
        } else {
            System.out.println("Linked List kosong");
        }
    }

    public void Enqueue(Mahasiswa03 mahasiswa) {
        Node03 newNode = new Node03(mahasiswa);

        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public Mahasiswa03 Dequeue() {
        if (isEmpty()) {
            return null;
        }

        Mahasiswa03 removedData = head.data;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        return removedData;
    }

    public Mahasiswa03 peek() {
        if (isEmpty()) {
            return null;
        }

        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        Node03 temp = head;
        while (temp != null) {
            System.out.println("NIM = " + temp.data.NIM + " | Nama = " + temp.data.nama);
            temp = temp.next;
        }
    }
}
