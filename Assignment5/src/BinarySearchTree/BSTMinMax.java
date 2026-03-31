package BinarySearchTree;

class Node2 {
    int data;
    Node left, right;

    Node2(int data) {
        this.data = data;
        left = right = null;
    }
}

class BSTMinMax {
    int findMin(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while (root.left != null)
            root = root.left;

        return root.data;
    }

    int findMax(Node root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return -1;
        }

        while (root.right != null)
            root = root.right;

        return root.data;
    }

    public static void main(String[] args) {
        BSTMinMax bst = new BSTMinMax();

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(70);

        System.out.println("Min = " + bst.findMin(root));
        System.out.println("Max = " + bst.findMax(root));
    }
}
