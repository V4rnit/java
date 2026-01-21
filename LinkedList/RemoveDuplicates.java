import java.util.*;
class ListNode{
	public int val;
	public ListNode next;
	ListNode(int val){
		this.val = val;
	}
	ListNode(int val, ListNode next){
		this.val = val;
		this.next = next;
	}
	ListNode(){

	}
}
class Solution{
	public ListNode deleteDuplicates(ListNode head){
		if(head == null){
			return head;
		}
		ListNode curr = head;
		while(curr != null && curr.next != null){
			if(curr.next.val == curr.val){
				curr.next = curr.next.next;
			}
			else{
				curr = curr.next;
			}
		}
		return head;
	}
}
public class RemoveDuplicates{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(1);
		root.next.next = new ListNode(1);
		root.next.next.next  = new ListNode(2);
		root.next.next.next.next = new ListNode(2);

		Solution sol = new Solution()	;
		ListNode newHead = sol.deleteDuplicates(root);
		ListNode temp = newHead;
		while(temp != null){
			System.out.print(temp.val + "->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
}
