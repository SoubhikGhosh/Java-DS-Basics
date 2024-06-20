package LinkedLists;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDuplicates {

    public RemoveDuplicates() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(3);

        System.out.println("Original Linked List:");
        printList(list);

        removeDuplicates(list);

        System.out.println("Linked List after removing duplicates:");
        printList(list);
    }

    public static void removeDuplicates(LinkedList<Integer> list) {
        // Create a HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate over the list
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer current = list.get(i);
            if (set.contains(current)) {
                // If the element is already in the HashSet, remove it from the list
                list.remove(current);
                size--; // Adjust the size after removal
                i--; // Adjust the index to account for the removed element
            } else {
                // Add the element to the HashSet
                set.add(current);
            }
        }
    }

    // Method to print the linked list
    public static void printList(LinkedList<Integer> list) {
        for (Integer value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
