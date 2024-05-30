package P14;

public class BinaryTreeArrayMain03 {
    public static void main(String[] args) {
        BinaryTreeArray03 bta = new BinaryTreeArray03();
        int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
        int idxLast = 6;

        for (int i = 0; i <= idxLast; i++) {
            bta.add(data[i]);
        }

        bta.populateData(data, idxLast);
        System.out.print("\nInOrder Traversal : ");
        bta.traverseInOrder(0);

        System.out.print("\nPreOrder Traversal : ");
        bta.traversePreOrder(0);

        System.out.print("\nPostOrder Traversal : ");
        bta.traversePostOrder(0);
    }

}
