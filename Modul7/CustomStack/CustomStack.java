public class CustomStack {
    Node top;
    int size = 0;

    public void push(int x) {
        Node n = new Node(x);
        n.next = top;
        top = n;
        size++;
    }

    public int pop() {
        if (top == null)
            throw new RuntimeException("Stack is empty.");
        int val = top.data;
        top = top.next;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
    if (top == null)
        throw new RuntimeException("Stack is empty.");
    return top.data;
}

    public void insertAfterBottom(int x) {
    if (size < 1) {
        throw new RuntimeException("Stack not enough elements");
    }

    CustomStack temp = new CustomStack();

    while (this.size > 1) {
        temp.push(this.pop());
    }

    this.push(x);

    while (!temp.isEmpty()) {
        this.push(temp.pop());
    }
}

    public static void main(String[] args) {
        CustomStack custom = new CustomStack();
        custom.push(1);
        custom.push(2);
        custom.push(3);
        custom.push(4);

        // System.out.println("Elemen teratas (peek): " + custom.peek());
        custom.insertAfterBottom(5);

        System.out.print("Custom Stack: ");
        while (!custom.isEmpty()) {
            System.out.print("[" + custom.pop() + "]");
        }
        System.out.println("End."); 
        // System.out.println(custom.pop());
    }
}