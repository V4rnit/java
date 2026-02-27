import java.util.*;
class ListNode{
	public char letter;
	ListNode next;

	//Constructor

	ListNode(char letter){
		this.letter = letter;
		this.next = null;
	}
}
class Solution{
	public void alternatePrint(ListNode word1, ListNode word2){
		if(word1 == null && word2 == null){
			return;
		}
		
		while(word1 != null && word2 != null){
			System.out.print(word1.letter);
			System.out.print(word2.letter);

			word1 = word1.next;
			word2 = word2.next;
		}
		
		while(word1 != null){
			System.out.print(word1.letter);
			word1 = word1.next;
		}
		while(word2 != null){
			System.out.print(word2.letter);
			word2 = word2.next;
		}
		System.out.println();
	}
}
public class AlternatePrint{
	public static void main(String [] args){
		Solution sol = new Solution();

		ListNode one = new ListNode('h');
		one.next = new ListNode('e');
		one.next.next = new ListNode('l');
		one.next.next.next = new ListNode('l');
		one.next.next.next.next = new ListNode('o');


		ListNode two = new ListNode('c');
		two.next = new ListNode('o');
		two.next.next = new ListNode('m');
		two.next.next.next = new ListNode ('p');
		two.next.next.next.next = new ListNode('u');
		two.next.next.next.next.next = new ListNode('t');
		two.next.next.next.next.next.next = new ListNode('e');
		two.next.next.next.next.next.next.next = new ListNode('r');

		sol.alternatePrint(one, two);
	}
}
