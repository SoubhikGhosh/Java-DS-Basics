package LinkedLists;

import java.util.LinkedList;

public class ReverseList {

    public ReverseList(){
        System.out.println("______________REVERSING A LINKED LIST_____________");

        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        printList(list); // Output: 1 2 3 4 5

        // Reverse the list
        reverseList(list);

        printList(list); // Output: 5 4 3 2 1
    }

    public static void printList(LinkedList<Integer> list) {
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static void reverseList(LinkedList<Integer> list) {
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            list.set(i, list.get(i) ^ list.get(size - i - 1));
            list.set(size - i - 1, list.get(i) ^ list.get(size - i - 1));
            list.set(i, list.get(i) ^ list.get(size - i - 1));
        }
    }

}
