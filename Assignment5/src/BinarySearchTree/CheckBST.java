package BinarySearchTree;

class Node3 {
    int data;
    Node left, right;

    Node3(int d) {
        data = d;
        left = right = null;
    }
}

public class CheckBST {

    boolean isBST(Node root, int min, int max) {
        if (root == null) return true;

        if (root.data <= min || root.data >= max)
            return false;

        return isBST(root.left, min, root.data) &&
                isBST(root.right, root.data, max);
    }

    public static void main(String[] args) {
        CheckBST tree = new CheckBST();

        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(20);
        root.left.left = new Node(2);
        root.left.right = new Node(8);

        boolean result = tree.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        if (result)
            System.out.println("Valid BST");
        else
            System.out.println("Not a BST");
    }
}
