public class RemoveDupsNoBuffer {
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

    public static void deleteDups(LinkedListNode head) {
        LinkedListNode current = head;
        while (current != null) {
            LinkedListNode runner = current;
            while (runner.next != null) {
                if (runner.next.data == current.data) {
                    runner.next = runner.next.next;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }
}
