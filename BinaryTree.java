public class BinaryTree {
    Node root;

    public void insert(int data) {
        Node tempNode = new Node(data);
        if (root == null) {
            root = tempNode;
        } else {
            Node current = root;
            Node parent;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.leftChild;
                    if (current == null) {
                        parent.leftChild = tempNode;
                        return;
                    }
                } else {
                    current = current.rightChild;
                    if (current == null) {
                        parent.rightChild = tempNode;
                        return;
                    }
                }
            }
        }
    }

    public Node search(int data) {
        Node current = root;
        while (current != null && current.data != data) {
            if (data < current.data) {
                current = current.leftChild;
            } else {
                current = current.rightChild;
            }
        }
        return current; // Returns null if not found
    }

    public void preOrderTraversal(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.leftChild);
            preOrderTraversal(node.rightChild);
        }
    }

    public void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.leftChild);
            System.out.print(node.data + " ");
            inOrderTraversal(node.rightChild);
        }
    }

    public void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.leftChild);
            postOrderTraversal(node.rightChild);
            System.out.print(node.data + " ");
        }
    }
}
