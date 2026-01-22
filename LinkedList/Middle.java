import java.util.*;
class ListNode{
	public int val;
	public ListNode next;
	//Constructor
	ListNode(){

	}
	ListNode(int val){
		this.val = val;
	}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
}
class Solution{
	public ListNode middleNode(ListNode head){
		if(head == null){
			return null;
		}
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
}
public class Middle{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		root.next.next.next.next = new ListNode(6);

		Solution sol = new Solution();
		ListNode midPoint = sol.middleNode(root);
		ListNode curr = midPoint;
		while(curr != null){
			System.out.print(curr.val + "->");
			curr = curr.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
