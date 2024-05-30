package P14;

public class BinaryTreeMain03 {
    public static void main(String[] args) {
        BinaryTree03 bt = new BinaryTree03();
        // bt.add(6);
        // bt.add(4);
        // bt.add(8);
        // bt.add(3);
        // bt.add(5);
        // bt.add(7);
        // bt.add(9);
        // bt.add(10);
        // bt.add(15);

        bt.rekursif(bt.root, 6);
        bt.rekursif(bt.root, 4);
        bt.rekursif(bt.root, 8);
        bt.rekursif(bt.root, 3);
        bt.rekursif(bt.root, 5);
        bt.rekursif(bt.root, 7);
        bt.rekursif(bt.root, 9);
        bt.rekursif(bt.root, 10);
        bt.rekursif(bt.root, 15);
       

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.print("inOrder Traversal : ");
        bt.traverseInOrder(bt.root);
        System.out.println("");

        System.out.print("PostOrder Traversal : ");
        bt.traversePostOrder(bt.root);
        System.out.println("");

        System.out.println("Find Node : " + bt.find(5));

        System.out.println("Delete Node 8 ");
        bt.delete(8);
        System.out.println("");

        System.out.print("PreOrder Traversal : ");
        bt.traversePreOrder(bt.root);
        System.out.println("");

        System.out.println("");
        System.out.println("Nilai Terkecil pada Binary Tree adalah : " + bt.cariMin());
        System.out.println("Nilai Terbesar pada Binary Tree adalah : " + bt.cariMaks());

        System.out.println(" ");
        System.out.print("Leaf Node : ");
        bt.cetakLeaf(bt.root);

        System.out.println(" ");
        int hitungLeaf = bt.hitungLeaf(bt.root);
        System.out.println("Jumlah Leaf Nodes : " + hitungLeaf);
    }
}
