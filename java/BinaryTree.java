import java.util.ArrayList;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public class BinaryTree {
    Node root;
    ArrayList<Integer> list;

    public BinaryTree(Node root) {
        this.root = root;
        this.list = new ArrayList<>();
    }

    /**
     * This method perform a preorder traversal of a binary tree
     *
     * <p>Time complexity: O(n)
     * <p>Space complexity: O(logn) average recursion overhead
     *
     * @param root the root node of the tree
     */
    public void preorder(Node root) {
        if (root != null) {
            list.add(root.data);
            preorder(root.left);
            preorder(root.right);
        }
    }

    /**
     * This method performs an inorder traversal of a binary tree
     *
     * <p>See: preorder()
     *
     * @param root the root ndoe of the tree
     */
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            list.add(root.data);
            inorder(root.right);
        }
    }

    /**
     * This method performs a postorder traversal of a binary tree
     *
     * <p>See: preorder()
     *
     * @param root the root ndoe of the tree
     */
    public void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            list.add(root.data);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(
            new Node(
                1,
                new Node(
                    2,
                    new Node(4, null, null),
                    new Node(5, null, null)),
                new Node(
                    3,
                    new Node(6, null, null),
                    new Node(7, null, null))
            )
        );

        tree.list = new ArrayList<>();
        tree.preorder(tree.root);
        for (int num : tree.list) {
            System.out.print(num + " ");
        }
        System.out.println();

        tree.list = new ArrayList<>();
        tree.inorder(tree.root);
        for (int num : tree.list) {
            System.out.print(num + " ");
        }
        System.out.println();

        tree.list = new ArrayList<>();
        tree.postorder(tree.root);
        for (int num : tree.list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
