import java.util.*;

class ListNode{
	public int val;
	public ListNode next;

	//Constructor
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}
class Solution{
	public ListNode copyList(ListNode head){
		if(head == null){
			return head;
		}
		ListNode newHead = new ListNode(head.val);
		ListNode curr = newHead;
		ListNode track = head.next;
		
		while(track != null){
			curr.next = new ListNode(track.val);
			track = track.next;
			curr = curr.next;
		}
		return newHead;
	}
	public void printList(ListNode head){
		if(head == null){
			return;
		}
		ListNode t = head;
		while(t != null){
			System.out.println(t.val);
			t = t.next;
		}
	}
}
public class CopyList{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		
		Solution sol = new Solution();
		ListNode copied = sol.copyList(root);

		sol.printList(copied);
	}
}
