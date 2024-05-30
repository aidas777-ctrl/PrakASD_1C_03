package P14;

public class BinaryTree03 {
    Node03 root;

    public BinaryTree03() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) { // tree is empty
            root = new Node03(data);
        } else {
            Node03 current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node03(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right == null) {
                        current.right = new Node03(data);
                        break;
                    } else {
                        current = current.right;
                    }
                } else {
                    System.out.println("Data sudah ada");
                    break;
                }
            }
        }
    }

    void rekursif(Node03 current, int data) {
        if (current == null) {
            root = new Node03(data);
            return;
        }
        if (data < current.data) {
            if (current.left == null) {
                current.left = new Node03(data);
            } else {
                rekursif(current.left, data);
            }
        } else if (data > current.data) {
            if (current.right == null) {
                current.right = new Node03(data);
            } else {
                rekursif(current.right, data);
            }
        }
    }

    boolean find(int data) {
        Node03 current = root;
        while (current != null) {
            if (current.data == data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public int cariMin() {
        Node03 current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int cariMaks() {
        Node03 current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }

    void traversePreOrder(Node03 node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node03 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node03 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node03 getSuccessor(Node03 del) {
        Node03 successor = del.right;
        Node03 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    public void cetakLeaf(Node03 node) {
        if (node != null) {
            if (node.left == null && node.right == null) {
                System.out.print(" " + node.data);
            }
            cetakLeaf(node.left);
            cetakLeaf(node.right);
        }
    }

    public int hitungLeaf(Node03 node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return hitungLeaf(node.left) + hitungLeaf(node.right);
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }

        Node03 parent = root;
        Node03 current = root;
        boolean isLeftChild = false;

        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                current = current.left;
                isLeftChild = true;
            } else {
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        }
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }

        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }

        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }

        else {
            Node03 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
}
