/*
Write code to partition a linked list around a value x, such that all nodes less
than x come before all nodes greater than or equal to x.  (IMPORTANT: The partition
elements can appear anywhere in the "right partition"; it does not need to appear between 
the left and right partitions.)

Example
Original linked list:  10 3 5 1 2 
Nodes of the Linked List with a partition at 5: 2 1 3 10 5
*/

public class Partition {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(10);
        head.next = new LinkedListNode(3);
        head.next.next = new LinkedListNode(5);
        head.next.next.next = new LinkedListNode(1);
        head.next.next.next.next = new LinkedListNode(2);

        LinkedListNode result = partition(head, 5);
        System.out.print("\n" + "Nodes of the Linked List with a partition at 5: ");
        while (result != null) {
            System.out.print(result.data + " ");
            result = result.next;
        }
        System.out.println("\n");
    }

    public static LinkedListNode partition(LinkedListNode node, int x) {
        LinkedListNode head = node;
        LinkedListNode tail = node;

        while (node != null) {
            LinkedListNode next = node.next;
            if (node.data < x) {
                node.next = head;
                head = node;
            } else {
                tail.next = node;
                tail = node;
            }
            node = next;
        }
        tail.next = null;

        return head;
    }
}
