package P12.doublelinkedlists;

public class DoubleLinkedListsMain03 {
    public static void main(String[] args) {
        DoubleLinkedLists03 dll = new DoubleLinkedLists03();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("=================================");
        dll.addFirst(3);
        dll.addlast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("==================================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size);
    }
}
