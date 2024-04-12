package P7;

public class PencarianBuku03 {
    Buku03 listBk[] = new Buku03[6];
    int idx;

    void tambah(Buku03 m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku03 m : listBk) {
            if (m != null) {
                m.tampilDataBuku();
            }
        }
    }

    public int FindSeqSearch(String cari) {
        int posisi = -1;
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                posisi = j;
                break;
            }
        }

        return posisi;
    }

    public void tampilPoisisi(String judulBuku, int pos) {
        if (pos != -1) {
            System.out.println("data            : " + judulBuku + " ditemukan pada indeks " + pos);

        } else {
            System.out.println("data " + judulBuku + " tidak ditemukan ");
        }
    }

    public void tampilData(String judulBuku, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku    \t: " + listBk[pos].kodeBuku);
            System.out.println("Judul        \t: " + judulBuku);
            System.out.println("Tahun Terbit \t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang    \t: " + listBk[pos].pengarang);
            System.out.println("Stock        \t: " + listBk[pos].stock);
        } else {
            System.out.println("data " + judulBuku + " tidak ditemukan ");
        }
    }

    public Buku03 FindBuku(String cari) {
        for (int j = 0; j < listBk.length; j++) {
            if (listBk[j].kodeBuku.equals(cari)) {
                return listBk[j];
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int compare = listBk[mid].kodeBuku.compareTo(cari);
            if (compare == 0) {
                return mid;
            } else if (compare > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void sortBooks() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listBk[j].judulBuku.compareTo(listBk[minIndex].judulBuku) < 0) {
                    minIndex = j;
                }
            }
            Buku03 temp = listBk[minIndex];
            listBk[minIndex] = listBk[i];
            listBk[i] = temp;
        }
    }

    public int FindSeqSearchJudul(String cari) {
        int posisi = -1;
        for (int j = 0; j < idx; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearchJudul(String cari, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int compareResult = listBk[mid].judulBuku.compareTo(cari);
        if (compareResult == 0) {
            return mid;
        } else if (compareResult > 0) {
            return FindBinarySearchJudul(cari, left, mid - 1);
        } else {
            return FindBinarySearchJudul(cari, mid + 1, right);
        }
    }

    public void peringatan(String cari) {
        int count = 0;
        for (int j = 0; j < idx; j++) {
            if (listBk[j].judulBuku.equalsIgnoreCase(cari)) {
                count++;
            }
        }
        if (count > 1) {
            int stokSama = 0;
            for (int j = 0; j < idx; j++) {
                if (listBk[j].judulBuku.equalsIgnoreCase(cari) && listBk[j].stock > 0) {
                    stokSama++;
                }
            }
            if (stokSama > 1) {
                System.out.println("Peringatan! terdapat lebih dari satu buku dengan judul \"" + cari);
            } else {
                System.out.println("Peringatan! terdapat lebih dari satu buku dengan judul \"" + cari + "\".");
            }
        }
    }
}
