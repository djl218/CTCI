public class ReturnKthToLast {
    public static void main(String[] args) {

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
