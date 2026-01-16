import java.util.*;
class ListNode{
	public int val; 
	public ListNode next;
	//Constructor
	ListNode(int val){
		this.val = val;
	}
	ListNode(){

	}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
}
class Solution{
	public ListNode reverseList(ListNode head){
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
}
public class ReverseList{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);

		Solution sol = new Solution();
		ListNode reversed = sol.reverseList(root);
		ListNode temp = reversed;
		while(temp != null){
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print("null");

		System.out.println();
	}
}
