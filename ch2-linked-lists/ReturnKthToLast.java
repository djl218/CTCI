public class ReturnKthToLast {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(2);
        head.next = new LinkedListNode(4);
        head.next.next = new LinkedListNode(6);
        head.next.next.next = new LinkedListNode(8);
        head.next.next.next.next = new LinkedListNode(10);
        head.next.next.next.next.next = new LinkedListNode(12);

        int k = 3;
        LinkedListNode result = findKToLast(head, k);
        System.out.println("\n" + "The data stored in the Kth to last node is: " + result.data + "\n");
    }

    public static LinkedListNode findKToLast(LinkedListNode head, int k) {
        LinkedListNode current = head;
        LinkedListNode impossible = head;
        int counter = 0;
        while (current != null) {
            current = current.next;
            counter++;
        }

        if (counter < k) {
            return impossible;
        }

        current = head;
        int counter2 = 0;
        while (current != null) {
            current = current.next;
            counter2++;
            if (counter2 == counter - k) {
                return current;
            }
        }

        return impossible;
    }
}
