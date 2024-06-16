public class DCP1220 {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

    }
}

// Node class
class Node {
    int n;
    Node left;
    Node right;

    public Node(int n) {
        this.n = n;
        left = null;
        right = null;
    }
}

// Binary Tree Class
class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int n) {
        if (root == null) {
            root = new Node(n);
        } 
        else {
            insertRec(n, root);
        }
    }

    private void insertRec(int n, Node node) {
        if (node.left == null) {
            node.left = new Node(n);
        } 
        else if (node.right == null) {
            node.right = new Node(n);
        } 
        else {
            if (countNodes(node.left) <= countNodes(node.right)) {
                insertRec(n, node.left);
            } 
            else {
                insertRec(n, node.right);
            }
        }
    }

    // Count the number of nodes in the subtree
    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }
}