package P6;

public class DaftarBuku03 {
    Buku03 listBk[] = new Buku03[5];
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
            m.tampilDataBuku();
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listBk.length - 1; i++) {
            for (int j = 0; j < listBk.length - i - 1; j++) {
                if (listBk[j].stock > listBk[j + 1].stock) {
                    Buku03 tempBk = listBk[j];
                    listBk[j] = listBk[j + 1];
                    listBk[j + 1] = tempBk;
                }
            }
        }
    }
}
