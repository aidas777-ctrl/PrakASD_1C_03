package P11.SingleLinkedList03;

public class SLLMain03 {
    public static void main(String[] args) {
        SingleLinkedList03 singLL = new SingleLinkedList03();
        singLL.print();
        singLL.addFirst(890);
        singLL.print();
        singLL.addLast(760);
        singLL.print();
        singLL.addFirst(700);
        singLL.print();
        singLL.insertAfter(700, 999);
        singLL.print();
        singLL.insertAt(3, 833);
        singLL.print();
    }
}
