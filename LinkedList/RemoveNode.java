import java.util.*;

class ListNode{
	public int val;
	public ListNode next;
	
	//Constructors
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
	public ListNode removeNthFromEnd(ListNode head, int n){
		ListNode dummy = new ListNode(0, head);
		ListNode left = dummy;
		ListNode right = head;
		while(n > 0){
			right = right.next;
			n--;
		}

		while(right != null){
			right = right.next;
			left = left.next;
		}

		left.next = left.next.next;
		return dummy.next;
	}
}
public class RemoveNode{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = new ListNode(4);
		
		Solution sol = new Solution();
		ListNode ans = sol.removeNthFromEnd(root, 2);
		ListNode temp = ans;
		
		while(temp != null){
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
