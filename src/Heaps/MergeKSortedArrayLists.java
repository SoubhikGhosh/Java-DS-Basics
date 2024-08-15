package Heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedArrayLists {

    public MergeKSortedArrayLists() {
        List<Integer> one = new ArrayList<>(Arrays.asList(2, 2, 3));
        List<Integer> two = new ArrayList<>(Arrays.asList(1, 2, 35));
        List<Integer> thr = new ArrayList<>(Arrays.asList( 0, 2, 935));
        List<List<Integer>> req = new ArrayList<>(Arrays.asList(one, two, thr));

        System.out.println(mergeLists(req));

    }
    public static List<Integer> mergeLists(List<List<Integer>> lists) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Add the first element from each list to the min heap
        for (List<Integer> list : lists) {
            if (!list.isEmpty()) {
                minHeap.offer(list.get(0));
            }
        }

        // Merge lists using min heap
        while (!minHeap.isEmpty()) {
            System.out.println(minHeap);
            int minValue = minHeap.poll();
            result.add(minValue);
            // Find the list containing minValue and add the next element to the min heap
            for (List<Integer> list : lists) {
                if (!list.isEmpty() && list.get(0) == minValue) {
                    list.remove(0); // Remove the element we just added to the result
                    if (!list.isEmpty()) {
                        minHeap.offer(list.get(0));
                    }
                    break;
                }
            }
        }

        return result;
    }
}

