package Heap;

import java.util.PriorityQueue;

public class KLargestElements {
    public static PriorityQueue<Integer> process(int[] array, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < array.length; i++) {
            if (i < k) {
                pq.add(array[i]);
            } else {
                if (pq.peek() < array[i]) {
                    pq.remove();
                    pq.add(array[i]);
                }
            }
        }
        return pq;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 17, 18, 63};
        System.out.println(process(array, 2));
    }

}
