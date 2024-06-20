package LinkedLists;

import java.util.LinkedList;

public class LinkedListCollections {

    public LinkedListCollections() {
        System.out.println("______________LINKED LIST USING COLLECTIONS_____________");
        LinkedList<Integer> list = new LinkedList<>();

        // Insert at the end
        list.add(6);
        printList(list); // Output: 6

        // Insert at the front
        list.addFirst(7);
        printList(list); // Output: 7 6

        list.addFirst(1);
        printList(list); // Output: 1 7 6

        // Insert after a specific position
        list.add(2, 8); // Insert 8 at index 2
        printList(list); // Output: 1 7 8 6

        // Delete a node by value
        list.remove((Integer) 7);
        printList(list); // Output: 1 8 6

        // Search for a node
        System.out.println(list.contains(8)); // Output: true
        System.out.println(list.contains(10)); // Output: false
    }

    public static void printList(LinkedList<Integer> list) {
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }
}
