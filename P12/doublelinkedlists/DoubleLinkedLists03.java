package P12.doublelinkedlists;

public class DoubleLinkedLists03 {
    Node03 head;
    int size;

    public DoubleLinkedLists03(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int item){
        if (isEmpty()) {
            head = new Node03(null, item, null);
        } else{
            Node03 newNode = new Node03(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addlast(int item){
        if (isEmpty()) {
            addFirst(item);
        } else{
            Node03 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node03 newNode = new Node03(current, item, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int item, int index)  {
        if (isEmpty()) {
            addFirst(item);
        } else if (index < 0 || index > size) {
           System.out.println("index diluar batas");
        } else{
            Node03 current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            } if (current.prev == null) {
                Node03 newNode = new Node03(null, item, current);
                current.prev = newNode;
                head = newNode;
            } else{
                Node03 newNode = new Node03(current.prev, item, current);
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    public int size(){
        return size;
    }

    public void clear(){
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
}
