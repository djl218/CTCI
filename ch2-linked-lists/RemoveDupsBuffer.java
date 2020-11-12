import java.util.HashSet;

public class RemoveDupsBuffer {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(2);
        head.next = new LinkedListNode(4);
        head.next.next = new LinkedListNode(6);
        head.next.next.next = new LinkedListNode(8);
        head.next.next.next.next = new LinkedListNode(8);
        head.next.next.next.next.next = new LinkedListNode(10);

        deleteDups(head);
        System.out.print("\n" + "Nodes of the Linked List with duplicates removed are: ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("\n");
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