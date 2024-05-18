package P12.TugasPraktikum.Tugas2;

public class DoubleLinkedListsFilm03 {
    Film03 head, tail;
    int size;

    public DoubleLinkedListsFilm03() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void addFirst(int id, String judul, double rating) {
        if (isEmpty()) {
            head = tail = new Film03(id, judul, rating, null, null);
        } else {
            Film03 newNode = new Film03(id, judul, rating, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Film03 newNode = new Film03(id, judul, rating, tail, null);
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Posisi indeks di luar batas.");
            return;
        }
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Film03 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            Film03 newNode = new Film03(id, judul, rating, tmp.prev, tmp);
            tmp.prev.next = newNode;
            tmp.prev = newNode;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            System.out.println("Film dengan ID " + head.id + " telah dihapus.");
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Daftar Film kosong.");
        } else {
            System.out.println("Film dengan ID " + tail.id + " telah dihapus.");
            tail = tail.prev;
            if (tail != null) {
                tail.next = null;
            } else {
                head = null;
            }
            size--;
        }
    }

    public void remove(int index) {
        if (isEmpty() || index < 0 || index >= size) {
            System.out.println("Daftar Film Kosong.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Film03 tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Film dengan ID " + tmp.id + " telah dihapus.");
            tmp.prev.next = tmp.next;
            tmp.next.prev = tmp.prev;
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            System.out.println("Daftar Film Layar Lebar");
            Film03 tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id);
                System.out.println("Judul Film: " + tmp.judul);
                System.out.println("Rating: " + tmp.rating);
                System.out.println();
                tmp = tmp.next;
            }
        }
    }

    public void search(int id) {
        if (isEmpty()) {
            System.out.println("Daftar film kosong.");
        } else {
            Film03 tmp = head;
            int index = 0;
            while (tmp != null) {
                if (tmp.id == id) {
                    System.out.println("Data ID Film: " + id + " berada di node ke-" + (index + 1));
                    System.out.println("IDENTITAS:");
                    System.out.println("ID Film: " + tmp.id);
                    System.out.println("Judul Film: " + tmp.judul);
                    System.out.println("IMDB Rating: " + tmp.rating);
                    return; 
                }
                tmp = tmp.next;
                index++;
            }
            System.out.println("Data ID Film " + id + " tidak ditemukan.");
        }
    }

    public void sortFilmDesc() {
        if (isEmpty() || size == 1) {
            System.out.println("Daftar film kosong atau hanya berisi satu film.");
            return;
        }
    
        boolean swapped;
        Film03 tmp;
        Film03 lastSorted = null;
    
        do {
            swapped = false;
            tmp = head;
    
            while (tmp.next != lastSorted) {
                if (tmp.rating < tmp.next.rating) {
                    // Tukar nilai rating
                    double tempRating = tmp.rating;
                    tmp.rating = tmp.next.rating;
                    tmp.next.rating = tempRating;
    
                    // Tukar nilai ID
                    int tempId = tmp.id;
                    tmp.id = tmp.next.id;
                    tmp.next.id = tempId;
    
                    // Tukar nilai judul
                    String tempJudul = tmp.judul;
                    tmp.judul = tmp.next.judul;
                    tmp.next.judul = tempJudul;
    
                    swapped = true;
                }
                tmp = tmp.next;
            }
            lastSorted = tmp;
        } while (swapped);
    }
}
