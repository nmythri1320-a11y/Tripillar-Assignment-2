package BinarySearchTree;

class BSTDelete {
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data)
            root.left = delete(root.left, key);
        else if (key > root.data)
            root.right = delete(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;

            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }

    int findMin(Node root) {
        while (root.left != null)
            root = root.left;
        return root.data;
    }

    public static void main(String[] args) {
        BSTDelete bst = new BSTDelete();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        root = bst.delete(root, 30);

        System.out.println("Deleted successfully");
    }
}
