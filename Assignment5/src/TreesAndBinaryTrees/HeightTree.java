package TreesAndBinaryTrees;

class HeightTree {
    int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void main(String[] args) {
        HeightTree tree = new HeightTree();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        System.out.println("Height = " + tree.height(root));
    }
}
