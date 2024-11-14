public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        int[] array = {27, 14, 35, 10, 19, 31, 42};

        for (int value : array) {
            tree.insert(value);
        }

        Node temp = tree.search(31);
        if (temp != null) {
            System.out.println("Element found: " + temp.data);
        } else {
            System.out.println("Element not found: 31");
        }

        temp = tree.search(15);
        if (temp != null) {
            System.out.println("Element found: " + temp.data);
        } else {
            System.out.println("Element not found: 15");
        }

        System.out.println("\nPre-order traversal:");
        tree.preOrderTraversal(tree.root);

        System.out.println("\nIn-order traversal:");
        tree.inOrderTraversal(tree.root);

        System.out.println("\nPost-order traversal:");
        tree.postOrderTraversal(tree.root);
    }
}
