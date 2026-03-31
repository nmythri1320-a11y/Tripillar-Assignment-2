package TreesAndBinaryTrees;

class PreorderTraversal {
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public static void main(String[] args) {
        PreorderTraversal tree = new PreorderTraversal();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        tree.preorder(root);
    }
}
