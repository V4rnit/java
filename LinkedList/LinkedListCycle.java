import java.util.*;
class ListNode{
	public int val;
	public ListNode next;
	
	//constructor
	ListNode(int val){
		this.val = val;
	}
}
class Solution{
	public boolean hasCycle(ListNode head){
		ListNode fast = head;
		ListNode slow = head;
		
		while(fast != null && fast.next != null){
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow){
				return true;
			}
		}
		return false;
	}
}
public class LinkedListCycle{
	public static void main(String [] args){
		ListNode root = new ListNode(1);
		root.next = new ListNode(2);
		root.next.next = new ListNode(3);
		root.next.next.next = root;
		
		Solution s = new Solution();
		System.out.println(s.hasCycle(root));
	}
}
