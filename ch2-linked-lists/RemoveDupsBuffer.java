import java.util.HashSet;

public class RemoveDupsBuffer {
    public static void main(String[] args) {

    }

    public static void deleteDups(LinkedListNode n) {
        HashSet<Integer> set = new HashSet<Integer>();
        LinkedListNode previous = null;
        while (n != null) {
            if (set.contains(n.data)) {
                previous.next = n.next;
            } else {
                set.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }
}