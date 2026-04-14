package DoubleLinkedList;

public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
        head = data;
        tail = data;
    } else {
        data.next = head;
        head.prev = data;
        head = data;
    }
    size++;
}

    void addLast(Node data) {
        if (isEmpty()) {
        head = data;
        tail = data;
    } else {
        tail.next = data;
        data.prev = tail;
        tail = data;
    }
    size++;
}

    void print() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    void printReverse() {
        Node current = tail; 

        while (current != null) { 

            System.out.println(current.data); 

            current = current.prev; 
        }
    }

    Node search(Object key) {
    Node current = head; 

    while (current != null) { 
        if (current.data.equals(key)) {        
            return current; 
        }
        current = current.next; 
    }
    return null; 
    }

    Node searchByIndex(int index) {

    if (index < 0 || index >= size) {
        return null; // Jika tidak valid, kembalikan null
    }
    Node current = head; 
    int i = 0; 

    while (current != null) { 
        if (i == index) { 
            return current; 
        }

        current = current.next; 
        i++;
    }
    return null; 
    }

    void removeByIndex(int index) {

    if (index < 0 || index >= size) {
        System.out.println("Index tidak ditemukan");
        return;
    }

    if (size == 1) {
        head = null;
        tail = null;
        size--;
        return;
    }

    if (index == 0) {
        head = head.next; 
        head.prev = null; 
        size--;
        return;
    }

    if (index == size - 1) {
        tail = tail.prev; 
        tail.next = null; 
        size--;
        return;
    }

    Node current = head;
    int i = 0;

    while (i < index) {
        current = current.next;
        i++;
    }

    current.prev.next = current.next; 
    current.next.prev = current.prev; 

    size--;
    }

    void removeByValue(Object key) {

    if (isEmpty()) {
        return;
    }

    Node current = head;

    while (current != null) {

        if (current.data.equals(key)) {
            if (size == 1) {
                head = null;
                tail = null;
            }
            else if (current == head) {
                head = head.next;
                head.prev = null;
            }
            else if (current == tail) {
                tail = tail.prev;
                tail.next = null;
            }
            else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }

            size--;
            return; 
        }
        current = current.next; 
    }
        System.out.println("Data tidak ditemukan");
    }

    void addByIndex(int index, Node data) {

    if (index < 0 || index > size) {
        System.out.println("Index tidak valid");
        return;
    }

    if (index == 0) {
        addFirst(data);
        return;
    }

    if (index == size) {
        addLast(data);
        return;
    }

    Node current = head;
    int i = 0;

    while (i < index) {
        current = current.next;
        i++;
    }


    data.prev = current.prev; 
    data.next = current; 

    current.prev.next = data; 
    current.prev = data; 

    size++;
    }

    void addAfter(Object key, Node data) {
    Node current = head; 

    while (current != null) { 

        if (current.data.equals(key)) { 

            data.next = current.next; 
            data.prev = current; 

            if (current.next != null) {
                current.next.prev = data;
            } else {
                tail = data;
            }

            current.next = data; 
            size++;
            return;
        }

        current = current.next; 
    }

    System.out.println("Data tidak ditemukan");
    }

    void addBefore(Object key, Node data) {
    Node current = head; 

    while (current != null) { 

        if (current.data.equals(key)) { 

            data.next = current; 
            data.prev = current.prev; 

            if (current.prev != null) {
                current.prev.next = data;
            } else {
                head = data;
            }

            current.prev = data; 
            size++;
            return;
        }

        current = current.next; 
    }

    System.out.println("Data tidak ditemukan");
    }

    public static void main(String[] args) {

    DoubleLinkedList list = new DoubleLinkedList();

    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");

    list.addLast(nodeA);
    System.out.println("head: " + list.head.data);
    System.out.println("tail: " + list.tail.data);

    list.addLast(nodeB);
    System.out.println("head: " + list.head.data);
    System.out.println("tail: " + list.tail.data);

    list.addLast(nodeC);
    System.out.println("head: " + list.head.data);
    System.out.println("tail: " + list.tail.data);

    list.print();

    System.out.println("Next of B: " + nodeB.next.data);
    System.out.println("Prev of B: " + nodeB.prev.data);

    System.out.println("Reverse:");
    list.printReverse();


    Node result = list.search("D");
        if (result != null) {
            System.out.println("Data ditemukan: " + result.data);
        } else {
            System.out.println("Data tidak ditemukan");
        }

    Node result2 = list.searchByIndex(2);
        if (result2 != null) {
            System.out.println("Data ditemukan: " + result2.data);
        } else {
            System.out.println("Index tidak ditemukan");
    }
    //list.removeByIndex(1);

    // list.removeByValue("B");

    // list.addByIndex(1, new Node("X"));

    // list.addAfter("B", new Node("X"));

    list.addBefore("B", new Node("X"));
    list.print();
    }

}