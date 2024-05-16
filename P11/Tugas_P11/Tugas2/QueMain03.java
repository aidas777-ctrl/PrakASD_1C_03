package P11.Tugas_P11.Tugas2;

public class QueMain03 {
    public static void main(String[] args) {
        Queue03 queue = new Queue03();
        queue.Enqueue(new Mahasiswa03("001", "Citra"));
        queue.Dequeue();
        queue.print();
        queue.Enqueue(new Mahasiswa03("111", "Anton"));
        queue.print();

        queue.Enqueue(new Mahasiswa03("112", "Prita"));
        queue.print();

        queue.Enqueue(new Mahasiswa03("113", "Yusuf"));
        queue.print();

        queue.Enqueue(new Mahasiswa03("114", "Doni"));
        queue.print();

        queue.Enqueue(new Mahasiswa03("115", "Sari"));
        queue.print();
    }

}


