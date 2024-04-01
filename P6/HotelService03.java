package P6;

public class HotelService03 {
    Hotel03 rooms[] = new Hotel03[5];
    int idx;

    void tambah(Hotel03 H){
        if (idx < rooms.length) {
            rooms[idx] = H;
            idx++;
        }else {
            System.out.println("Data Hotel Sudah penuh!!!");
        }
    }
    void tampilAll(){
        for(Hotel03 H : rooms){
            H.tampilDataHotel();
        }
    }
    void bubbleSortHarga(){
        for (int i = 0; i < rooms.length -1; i++) {
            for (int j = 0; j < rooms.length -i -1; j++) {
                if (rooms[j].harga > rooms[j+1].harga) {
                    Hotel03 temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }
    void bubbleSortBintang(){
        for (int i = 0; i < rooms.length -1; i++) {
            for (int j = 0; j < rooms.length -i -1; j++) {
                if (rooms[j].bintang < rooms[j+1].bintang) {
                    Hotel03 temp = rooms[j];
                    rooms[j] = rooms[j+1];
                    rooms[j+1] = temp;
                }
            }
        }
    }
    void selectionSortHarga(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].harga < rooms[idxMax].harga) {
                    idxMax = j;
                }
            }
            
            Hotel03 tempHotel = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tempHotel;
        }
    }
    void selectionSortBintang(){
        for (int i = 0; i < rooms.length-1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[j].bintang > rooms[idxMax].bintang) {
                    idxMax = j;
                }
            }
            
            Hotel03 tempHotel = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = tempHotel;
        }
    }
}
