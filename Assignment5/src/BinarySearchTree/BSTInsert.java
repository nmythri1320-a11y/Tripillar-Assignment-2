package BinarySearchTree;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTInsert {
    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Inorder traversal to check BST
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BSTInsert bst = new BSTInsert();

        Node root = null;
        root = bst.insert(root, 50);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);

        bst.inorder(root);  // Output: 30 50 70
    }
}
