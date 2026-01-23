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
	public ListNode mergeTwoLists(ListNode list1, ListNode list2){
		if(list1 == null && list2 == null){
			return null;
		}
		//Create a fake starting point with the next pointer being null
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				curr.next = list1;
				list1 = list1.next;
			}
			else if(list2.val < list1.val){
				curr.next = list2;
				list2 = list2.next;	
			}

			//Case if the val in list1 and list2 are the same so just append one 
			else{
				curr.next = list1;
				list1 = list1.next;
			}
			curr = curr.next;
		}
		if(list1 != null){
			curr.next = list1;
		}
		if(list2 != null){
			curr.next = list2;
		}
		return dummy.next;
	}
	public int findDuplicate(int [] nums){
		if(nums.length == 0){
			return -1;
		}
		int slow = nums[0];
		int fast = nums[0];
		while(true){
			slow = nums[slow];
			fast = nums[nums[fast]];
			if(fast == slow){
				break;
			}
		}
		slow = nums[0];
		while(slow != fast){
			slow = nums[slow];
			fast = nums[fast];
		}
		return slow;
	}
	public void reorderList(ListNode head){
		if(head == null){
			return; 
		}
		//First need to find middle point of the list
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode first = head;
		ListNode second = slow.next;
		slow.next = null;
		second = reverseList(second);
		//making the connection
		while(second != null){
			ListNode t1 = second.next;
			ListNode t2 = first.next;

			first.next = second;
			second.next = t2;

			first = t2;
			second = t1;
		}
	}
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
	public ListNode detectCycle(ListNode head){
		if(head == null){
			return head;
		}
		ListNode slow = head;
		ListNode fast = head;
		
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(fast == slow){
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
	public ListNode copyRandomList(ListNode head){
		if(head == null){
			return null;
		}
		HashMap<ListNode, ListNode> map = new HashMap<>();
		ListNode curr = head;
		while(curr != null){
			map.put(curr, new ListNode(curr.val));
			curr = curr.next;
		}
		curr = head;
		while(curr != null){
			map.get(curr).next = map.get(curr.next);
			map.get(curr).random = map.get(curr.random);
		}
		map.get(head);
	}
	public ListNode removeNthFromEnd(ListNode head, int n){
		if(head == null){
			return null;
		}
		ListNode dummy  = new ListNode(-1);
		dummy.next = head;
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
public class Revision{
	public static void main(String [] args){
		
	}
}
