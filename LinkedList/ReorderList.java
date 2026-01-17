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
}
class Solution{
	public ListNode reverse(ListNode head){
		ListNode curr = head;
		ListNode prev = null;
		
		while(curr != null){
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	public void reorderList(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		//Finding the middle part of the linked list
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		//Reversing the second half of the linked list
		ListNode second  = reverse(slow.next);
		slow.next = null;
		ListNode first = head;
		while(second != null){
			ListNode t1 = first.next;
			ListNode t2 = second.next;

			first.next = second;
			second.next = t1;

			first = t1;
			second = t2;
		}
	}	

}
public class ReorderList{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);

		Solution sol = new Solution();
		sol.reorderList(root);
		
		ListNode t = root;
		while(t != null){
			System.out.print(t.val + "->");
			t = t.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
