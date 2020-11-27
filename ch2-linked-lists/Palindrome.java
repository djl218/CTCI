import java.util.Stack;

public class Palindrome {
	public boolean isPalindrome1(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		// odd number nodes, ignore the middle node
		if (fast != null) {
			slow = slow.next;
		}
		// reverse the second part
		LinkedListNode headSecondPart = reverseList(slow);
		while (headSecondPart != null) {
			if (head.data != headSecondPart.data) {
				return false;
			}
			head = head.next;
			headSecondPart = headSecondPart.next;
		}
		return true;
	}

	public LinkedListNode reverseList(LinkedListNode head) {
		LinkedListNode newHead = null;
		while (head != null) {
			LinkedListNode next = head.next;
			head.next = newHead;
			newHead = head;
			head = next;
		}
		return newHead;
	}

	public boolean isPalindrome2(LinkedListNode head) {
		LinkedListNode slow = head;
		LinkedListNode fast = head;
		Stack<Integer> stack = new Stack<>();
		while (fast != null && fast.next != null) {
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		// odd number nodes, ignore the middle node
		if (fast != null) {
			slow = slow.next;
		}
		while (slow != null) {
			int top = stack.pop().intValue();
			if (top != slow.data) {
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}
