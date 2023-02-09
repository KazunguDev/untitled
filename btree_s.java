// Binary Tree in Java

// Node creation
class Node1 {
    int key;
    Node1 left, right;

    public Node1(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree_1 {
    Node1 root;

    BinaryTree_1(int key) {
        root = new Node1(key);
    }

    BinaryTree_1() {
        root = null;
    }

    // Traverse Inorder
    public void traverseInOrder(Node1 node1) {
        if (node1 != null) {
            traverseInOrder(node1.left);
            System.out.print(" " + node1.key);
            traverseInOrder(node1.right);
        }
    }

    // Traverse Postorder
    public void traversePostOrder(Node1 node1) {
        if (node1 != null) {
            traversePostOrder(node1.left);
            traversePostOrder(node1.right);
            System.out.print(" " + node1.key);
        }
    }

    // Traverse Preorder
    public void traversePreOrder(Node1 node1) {
        if (node1 != null) {
            System.out.print(" " + node1.key);
            traversePreOrder(node1.left);
            traversePreOrder(node1.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree_1 tree = new BinaryTree_1();

        tree.root = new Node1(1);
        tree.root.left = new Node1(2);
        tree.root.right = new Node1(3);
        tree.root.left.left = new Node1(4);

        System.out.print("Pre order Traversal: ");
        tree.traversePreOrder(tree.root);
        System.out.print("\nIn order Traversal: ");
        tree.traverseInOrder(tree.root);
        System.out.print("\nPost order Traversal: ");
        tree.traversePostOrder(tree.root);
    }
}
