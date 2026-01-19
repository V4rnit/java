class ListNode{
	public int val;
	public ListNode next;

	//Constructor
	ListNode(int val){
		this.val = val;
	}
}
class Solution{
	public ListNode detectCycle(ListNode head){
		if(head == null){
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		if(fast == null || fast.next == null){
			return null;
		}
		slow = head;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;

	}
}
public class LinkedListCycleTwo{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = root;

		Solution sol = new Solution();
		ListNode startCycle = sol.detectCycle(root);

		System.out.println(startCycle.val);
	}
}
