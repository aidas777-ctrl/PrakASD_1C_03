package P11.Tugas_P11.Tugas1;

public class SLLMain {
    public static void main(String[] args) {
        SingleLinkedList03 singLL = new SingleLinkedList03();
        singLL.addFirst(new Mahasiswa03("111", "Anton"));
        singLL.print();
        singLL.addLast(new Mahasiswa03("112", "Prita"));
        singLL.print();
        singLL.addLast(new Mahasiswa03("113", "Yusuf"));
        singLL.print();
        singLL.insertAfter("113", new Mahasiswa03("114", "Doni"));
        singLL.print();
        singLL.insertAt(4, new Mahasiswa03("115", "Sari"));
        singLL.print();
    }
}


    

