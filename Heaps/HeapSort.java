package Heaps;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.*;

public class HeapSort {
    public static void main(String[] args) {
        
    
            Queue<Integer> pq = new PriorityQueue<>();
            int[] array = new int[]{25, 12, 6, 41, 18, 31, 53};
            Arrays.stream(array).forEach(element -> pq.add(element));

            while(pq.size() > 0){
                System.out.print(pq.poll() + " ");
            } 
    }
}
