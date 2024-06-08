package P15.Graph;

public class DoubleLinkedLists03 {
    Node03 head;
    int size;

    public DoubleLinkedLists03() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node03(null, item, jarak, null);
        } else {
            Node03 newNode = new Node03(null, item, jarak, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else {
            Node03 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node03 newNode = new Node03(current, item, jarak, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index, int jarak) {
        if (isEmpty()) {
            addFirst(item, jarak);
        } else if (index < 0 || index > size) {
            System.out.println("index diluar batas");
        } else {
            Node03 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node03 newNode = new Node03(null, item, jarak, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node03 newNode = new Node03(current.prev, item, jarak, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            Node03 tmp = head;
            while (tmp != null) {
                System.out.print(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nberhasil diisi");
        } else {
            System.out.println("Linked Lists kosong");
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (size == 1) {
            head = null;
            size--;
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus!");
        } else if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node03 current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    public void remove(int index) {
        Node03 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    public int getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
        }
        return head.data;
    }

    public int getLast() {
        if (isEmpty()) {
            System.out.println("LinkedList kosong");
        }
        Node03 tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int get(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Nilai indeks di luar batas");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) {
        if (isEmpty() || index >= size) {
            System.out.println("Nilai indeks di luar batas");
        }
        Node03 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void updateJarak(int tujuan, int jarakBaru) {
        Node03 tmp = head;
        while (tmp != null) {
            if (tmp.data == tujuan) {
                tmp.jarak = jarakBaru;
                return;
            }
            tmp = tmp.next;
        }
    }
}