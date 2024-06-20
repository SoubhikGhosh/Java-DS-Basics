package LinkedLists;

public class LinkedListOperations {

    public LinkedListOperations(){
        System.out.println("_____________LINKED LIST______________");
        // Insert at the end
        this.append(6);
        this.printList(); // Output: 6

        // Insert at the front
        this.push(7);
        this.printList(); // Output: 7 6

        this.push(1);
        this.printList(); // Output: 1 7 6

        // Insert after a node
        this.insertAfter(this.head.next, 8);
        this.printList(); // Output: 1 7 8 6

        // Delete a node by key
        this.deleteNode(7);
        this.printList(); // Output: 1 8 6

        // Search for a node
        System.out.println(this.search(8)); // Output: true
        System.out.println(this.search(10)); // Output: false
    }
    public Node head; // head of the list

    // Linked list Node
    public static class Node {
        int data;
        public Node next;

        // Constructor to create a new node
        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node at the end
    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    // Method to insert a new node at the front
    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Method to insert a new node after a given node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // Method to delete a node by key
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) return; // Key not present in list

        prev.next = temp.next;
    }

    // Method to search a node by key
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    // Method to print the LinkedList
    public void printList() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }
}
