package TreeApp;

class Node {
    String data;
    Node left, right;

    Node(String data) {
        this.data = data;
    }

    public void add(String data) {
        if (data.compareTo(this.data) > 0) {
            if (this.right == null) {
                this.right = new Node(data);
            } else this.right.add(data);
        }

        if (data.compareTo(this.data) < 0) {
            if (this.left == null) {
                this.left = new Node(data);
            } else this.left.add(data);
        }
    }
}