public class SingleLinkedList {
    
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
            tail = data;
        }
        size++;
    }
    public static void main(String[] args) {
        
        SingleLinkedList list = new SingleLinkedList();

        System.out.println("Head: " + list.head);
        System.out.println("Tail: " + list.tail);

        list.addFirst(new Node("A"));
        System.out.println("Head: " + list.head);
        System.out.println("Tail: " + list.tail);

        list.addFirst(new Node("B"));
        System.out.println("Head: " + list.head);
        System.out.println("Tail: " + list.tail);

        list.addLast(new Node("C"));
        System.out.println("Head: " + list.head);
        System.out.println("Tail: " + list.tail);

        Node result = list.search("A"); //Mencari node dengan nilai tertentu
        if (result != null) {
            System.out.println("Data ditemukan: " + result.data);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        Node result2 = list.search("D"); //Mencari node dengan nilai tertentu
        if (result2 != null) {
            System.out.println("Data ditemukan: " + result2.data);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        Node result3 = list.searchByIndex(1);
        if (result3 != null) {
            System.out.println("Data pada index ditemukan: " + result3.data);
        } else {
            System.out.println("Index tidak ditemukan");
        }

        Node result4 = list.searchByIndex(4);
        if (result4 != null) {
            System.out.println("Data pada index ditemukan: " + result4.data);
        } else {
            System.out.println("Index tidak ditemukan");
        }

        /* list.removeByIndex(1);
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data);*/

        // list.removeByIndex(3);

        /* list.removeByValue("B");
        System.out.println("Head: " + list.head.data);
        System.out.println("Tail: " + list.tail.data); */
        
        list.addByIndex(1, new Node("D"));

        list.addAfter("A", new Node("X"));

        list.addBefore("A", new Node("Z"));

        list.printList();
        
    }

    void printList() {
    Node current = head; 
    // Mulai dari node pertama (head)

    while (current != null) { 
        // Selama masih ada node

        System.out.print(current.data + " -> "); 
        // Tampilkan data node

        current = current.next; 
        // Pindah ke node berikutnya
    }

    System.out.println("null"); 
    // Penanda akhir list
}

    Node search(Object key) {
        Node current = head; // Membuat variabel bantu 'current' yang menunjuk ke head

        while (current != null) { // Perulangan untuk menelusuri setiap node selama belum null
        
            if (current.data.equals(key)) { // Cek apakah node sam
                return current; // Jika sama, node tersebut di return (data ditemukan)
            }

            current = current.next; // Jika beda, pindah ke node berikutnya
        }

        return null; //Jika seluruh node sudah dicek dan tidak ditemukan,kembalikan null
    }

    Node searchByIndex(int index) {
        if (index < 0 || index >= size) {
            return null;
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
            System.out.println("Data tidak ditemukan");
        }

        if (index == 0) {
            head = head.next;

            if (head == null) {
                tail = null;
            }

            size--;
            return;
        }

        Node current = head;
        int i = 0;

        while (i < index - 1) {
            current = current.next;
            i++;
        }

        Node deleted = current.next;
        current.next = deleted.next;

        if (deleted == tail) {
            tail = current;
        }

        size--;
    }

    void removeByValue(Object key) {
        if (isEmpty()) {
            return;
        }

        if (head.data.equals(key)) {
            head = head.next;
        

        if(head == null) {
            tail = null;
        }

        size--;
        return;
    }
        Node current = head;

    while (current.next != null && !current.next.data.equals(key)) {
        current = current.next;
    }

    if (current.next != null) {
        Node deleted = current.next;
        current.next = deleted.next;

        if (deleted == tail) {
            tail = current;
        }

        size --;
        }
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

        while (i < index - 1) {
            current = current.next;
            i++;
        }

        data.next = current.next;
        current.next = data;

        size++; 
    }

    void addAfter(Object key, Node data) {
    Node current = head; 

    while (current != null) { 

        if (current.data.equals(key)) { 

            data.next = current.next; 

            current.next = data; 

            if (current == tail) {
                tail = data;
            }

            size++; 
            return; 

        }

        current = current.next; 

    }

    System.out.println("Data tidak ditemukan"); 
    }

    void addBefore(Object key, Node data) {
   
        if (isEmpty()) {
            System.out.println("List kosong");
            return;
        }

        if (head.data.equals(key)) {
            addFirst(data); 
     
            return;
        }

        Node current = head;

        while (current.next != null && !current.next.data.equals(key)) {
            current = current.next;
        }

        if (current.next != null) {
            data.next = current.next; 

            current.next = data; 

            size++;
        } else {
            System.out.println("Data tidak ditemukan");
        }
    }
}
    
 


