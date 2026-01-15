import java.util.*;
class ListNode{
	public int val; 
	public ListNode next; 

	//constructor
	ListNode(){

	}
	ListNode(int val){
		this.val = val;
		this.next = null;
	}
}
class Solution{
	public ListNode mergeTwoLists(ListNode list1, ListNode list2){
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;
		while(list1 != null && list2 != null){
			if(list1.val <  list2.val){
				curr.next = list1;
				list1 = list1.next;
			}
			else if(list2.val < list1.val){
				curr.next = list2;
				list2 = list2.next;
			}
			else{
				curr.next = list1;
				list1 = list1.next;
			}
			curr = curr.next;
		}
		if(list1 != null){
			curr.next = list1;
		}
		else{
			curr.next = list2;
		}
		return dummy.next;
	}
}
public class MergeSortedLists{
	public static void main(String [] args){
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(3);
		l1.next = new ListNode(7);

		ListNode l2 = new ListNode(6);
		l2.next = new ListNode(9);

		Solution sol = new Solution();
		ListNode res = sol.mergeTwoLists(l1, l2);
		ListNode temp = res;
		while(temp != null){
			System.out.print(temp.val + "->");
			temp = temp.next;	
		}
		System.out.print("null");
		System.out.println();
	}
}
