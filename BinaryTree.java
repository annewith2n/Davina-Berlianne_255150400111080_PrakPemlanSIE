package TreeApp;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    Node root;

    public void add(String data) {
        if (root == null) {
            root = new Node(data);
            return;
        }
        root.add(data);
    }

    public void preTraverse(Node node) {
        if (node == null) return;
        System.out.printf("[%s]", node.data);
        preTraverse(node.left);
        preTraverse(node.right);
    }

    public void inTraverse(Node node) {
        if (node == null) return;
        inTraverse(node.left);
        System.out.printf("[%s]", node.data);
        inTraverse(node.right);
    }

    public void postTraverse(Node node) {
        if (node == null) return;
        postTraverse(node.left);
        postTraverse(node.right);
        System.out.printf("[%s]", node.data);
    }

    public int countNodes(Node node) {
        if (node == null) return 0;
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public int countLeaves(Node node){
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public int height(Node node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }

    public void levelTraverse(Node node) {
        if (node == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.printf("[%s]", current.data);

            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // int[] nilai = {3, 82, 20, 96, 11, 71, 70, 46, 69, 26};

        String[] nilai = {"Dina", "Budi", "Andi", "Caca", "Eka"};

        for (int i = 0; i < nilai.length; i++) {
            System.out.printf("Nilai %s dimasukkan.\n", nilai[i]);
            tree.add(nilai[i]);
        }
        System.out.println();

        /* for(int i = 0; i < 10; i++){
            int nilai = (int) (Math.random() * 100);
            System.out.printf("Nilai %d dimasukkan.\n", nilai);
            tree.add(nilai); */
        

        System.out.print("\nInOrder: ");
        tree.inTraverse(tree.root);

        System.out.print("\nPreOrder: ");
        tree.preTraverse(tree.root);

        System.out.print("\nPostOrder: ");
        tree.postTraverse(tree.root);

        System.out.println();

        System.out.print("\nJumlah Node: " + tree.countNodes(tree.root));

        System.out.print("\nJumlah daun: " + tree.countLeaves(tree.root));

        System.out.println("\nTinggi tree: " + tree.height(tree.root));

        System.out.print("\nLevelOrder: ");
        tree.levelTraverse(tree.root);
    }
}