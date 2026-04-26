public class CustomQueue {

    private Node head, tail;
    private int size = 0;

    public void enqueue(int x) {
        Node n = new Node(x);
        if (tail != null) tail.next = n;
        tail = n;
        if (head == null) head = tail;
        size++;
    }

    public int dequeue() {
        if (head == null)
            throw new RuntimeException("Queue is empty.");
        int val = head.data;
        head = head.next;
        if (head == null) tail = null;
        size--;
        return val;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
    Node current = head;
    System.out.print("Queue: ");
    while (current != null) {
        System.out.print(current.data + " ");
        current = current.next;
    }
    System.out.println();
}

    public int peek() {
    if (head == null)
        throw new RuntimeException("Queue is empty.");
    return head.data;
}

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);

        System.out.print("Before peek -> ");
        queue.print();

        // queue.dequeue();
        System.out.println("Front elements (peek): " + queue.peek());  

        // queue.enqueue(35); 
        // queue.enqueue(45);
        System.out.print("After peek -> ");
        queue.print(); 

        System.out.print("Custom Queue: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}