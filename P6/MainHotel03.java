package P6;

public class MainHotel03 {
    public static void main(String[] args) {
        HotelService03 room = new HotelService03();
        Hotel03 H = new Hotel03("Golden Hill", "Batu", 500000, (byte)4);
        Hotel03 H1 = new Hotel03("Atria", "Malang", 350000, (byte)2);
        Hotel03 H2 = new Hotel03("Grand Mercure", "Malang", 850000, (byte)5);
        Hotel03 H3 = new Hotel03("The Alana", "Malang", 400000, (byte)3);
        Hotel03 H4 = new Hotel03("Everydays", "Malang", 200000, (byte)1);

        room.tambah(H);
        room.tambah(H1);
        room.tambah(H2);
        room.tambah(H3);
        room.tambah(H4);

        System.out.println("================================================================");
        System.out.println("Data Hotel Sebelum Diurutkan");
        System.out.println("================================================================");
        room.tampilAll();

        System.out.println("================================================================");
        System.out.println("Data Hotel dari Harga Termurah ke Tertinggi |Bubble Sort|");
        System.out.println("================================================================");
        room.bubbleSortHarga();
        room.tampilAll();

        System.out.println("================================================================");
        System.out.println("Data Hotel dari Harga Termurah ke Tertinggi |Selection Sort|");
        System.out.println("================================================================");
        room.selectionSortHarga();
        room.tampilAll();

        System.out.println("================================================================");
        System.out.println("Data Hotel dari Rating Tertinggi ke Terendah |Bubble Sort|");
        System.out.println("================================================================");
        room.bubbleSortBintang();
        room.tampilAll();

        System.out.println("================================================================");
        System.out.println("Data Hotel dari Rating Tertinggi ke Terendah |Selection Sort|");
        System.out.println("================================================================");
        room.selectionSortBintang();
        room.tampilAll();
    }
}
