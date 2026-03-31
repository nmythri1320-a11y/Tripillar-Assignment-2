package TreesAndBinaryTrees;

class Node
{
    int data;
    Node left, right;

    Node(int value)
    {
        data = value;
        left = right = null;
    }
}

class InorderTraversal
{
    void inorder(Node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args)
    {
        InorderTraversal tree = new InorderTraversal();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        tree.inorder(root);
    }
}
