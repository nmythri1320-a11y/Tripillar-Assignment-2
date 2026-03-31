package BinarySearchTree;

class Node1 {
    int data;
    Node left, right;

    Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTSearch {
    boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        if (key < root.data)
            return search(root.left, key);
        else
            return search(root.right, key);
    }

    public static void main(String[] args) {
        BSTSearch bst = new BSTSearch();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println(bst.search(root, 30));
    }
}
