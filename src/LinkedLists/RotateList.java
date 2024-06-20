package LinkedLists;

import java.util.LinkedList;

public class RotateList {

    public RotateList (){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Print original list
        System.out.println("Original List:");
        printList(list);

        // Rotate the list by 2 positions
        int rotateBy = 2;
        rotateLinkedList(list, rotateBy);

        // Print rotated list
        System.out.println("\nRotated List by " + rotateBy + " positions:");
        printList(list);
    }

    public static void rotateLinkedList(LinkedList<Integer> list, int rotateBy) {
        if (list.isEmpty() || rotateBy == 0) {
            return; // No need to rotate if list is empty or rotateBy is 0
        }

        int size = list.size();
        // Calculate effective rotation index
        int effectiveRotate = rotateBy % size;

        // If effectiveRotate is negative, convert it to positive
        if (effectiveRotate < 0) {
            effectiveRotate += size;
        }

        // No need to rotate if effectiveRotate is 0 or equal to size
        if (effectiveRotate == 0 || effectiveRotate == size) {
            return;
        }

        // Perform rotation by adjusting pointers
        for (int i = 0; i < effectiveRotate; i++) {
            // Remove the first element and add it to the end
            int first = list.removeFirst();
            list.addLast(first);
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
