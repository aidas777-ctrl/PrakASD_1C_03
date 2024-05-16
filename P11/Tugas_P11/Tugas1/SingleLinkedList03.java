package P11.Tugas_P11.Tugas1;

public class SingleLinkedList03 {
    Node03 head, tail;

    boolean isEmpty() {
        return head == null;
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

   
    void addFirst(Mahasiswa03 input) {
        Node03 ndInput = new Node03(input, null);
        if (!isEmpty()) {
            ndInput.next = head;
            head = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

    
    void addLast(Mahasiswa03 input) {
        Node03 ndInput = new Node03(input, null);
        if (!isEmpty()) {
            tail.next = ndInput;
            tail = ndInput;
        } else {
            head = ndInput;
            tail = ndInput;
        }
    }

   
    void insertAfter(String nim, Mahasiswa03 input) {
        Node03 ndInput = new Node03(input, null);
        Node03 temp = head;
        while (temp != null) {
            if (temp.data.NIM.equals(nim)) { 
                ndInput.next = temp.next;
                temp.next = ndInput;
                if (ndInput.next == null) {
                    tail = ndInput;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("NIM " + nim + " tidak ditemukan dalam linked list");
    }

    
    void insertAt(int index, Mahasiswa03 input) {
        if (index < 0) {
            System.out.println("Indeks tidak valid");
            return;
        } else if (index == 0) {
            addFirst(input);
            return;
        } else {
            Node03 temp = head;
            for (int i = 0; i < index - 1; i++) {
                if (temp == null) {
                    System.out.println("Indeks tidak valid");
                    return;
                }
                temp = temp.next;
            }
            temp.next = new Node03(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
}