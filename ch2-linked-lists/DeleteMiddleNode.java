public class DeleteMiddleNode {
    public static void main(String[] args) {
        LinkedListNode head = new LinkedListNode(2);
        head.next = new LinkedListNode(4);
        head.next.next = new LinkedListNode(6);
        head.next.next.next = new LinkedListNode(8);
        head.next.next.next.next = new LinkedListNode(10);

        System.out.print("\n" + "The original linked list was: " + head.data + ",");
        System.out.print(head.next.data + "," + head.next.next.data + "," + head.next.next.next.data);
        System.out.println("," + head.next.next.next.next.data);

        deleteMiddleNode(head.next.next);

        System.out.print("With the middle node deleted it becomes: ");
        System.out.print(head.data + "," + head.next.data + "," + head.next.next.data + ",");
        System.out.println(head.next.next.next.data + "\n");
    }

    public static boolean deleteMiddleNode(LinkedListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        LinkedListNode next = head.next;
        head.data = next.data;
        head.next = next.next;
        return true;
    }
}