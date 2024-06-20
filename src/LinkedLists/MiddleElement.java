package LinkedLists;

import java.util.LinkedList;

public class MiddleElement {
    public MiddleElement(){
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printList(list); // Output: 1 2 3 4 5

        // Print the middle element
        printMiddleElement(list); // Output: 3
    }

    public static void printList(LinkedList<Integer> list) {
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    // Method to print the middle element of the LinkedList
    public static void printMiddleElement(LinkedList<Integer> list) {
        // Edge case: empty list
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        int slowIndex = 0;
        int fastIndex = 0;

        while (fastIndex < list.size() && fastIndex + 1 < list.size()) {
            slowIndex++;
            fastIndex += 2;
        }

        System.out.println("Middle element: " + list.get(slowIndex));
    }
}
