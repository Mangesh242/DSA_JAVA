package Heaps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class JoinedLL {

    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode mergeKLists(ArrayList<ListNode> a) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>();
        for (int i = 0; i < a.size(); i++) {
            pq.add(a.get(i));
        }
        ListNode ans = null, curr = null;
        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();
            if (ans == null) {
                ans = temp;
                curr = temp;
            } else {
                curr.next = temp;
                curr = temp;
            }
            if (temp.next != null) {
                pq.add(temp.next);
            }

        }
        return ans;

    }

    class ListNodeComparator implements Comparator<ListNode> {
        // Method
        // Sorting in ascending order of val
        public int compare(ListNode a, ListNode b) {
            return a.val - b.val;
        }
    }
}
