package TreesAndBinaryTrees;

class PostorderTraversal {
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        PostorderTraversal tree = new PostorderTraversal();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        tree.postorder(root);
    }
}
