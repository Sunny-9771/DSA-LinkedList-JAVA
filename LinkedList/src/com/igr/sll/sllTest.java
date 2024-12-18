package com.igr.sll;

public class sllTest {
	public static void main(String args[]) {
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.insertLastNode(22);
//		sll.displayList();
		sll.insertLastNode(23);
//		sll.displayList();
		sll.insertLastNode(24);
//		sll.insertAtLast(66);
		sll.insertLastNode(25);
//		sll.insertLastNode(26);
//		sll.insertLastNode(27);

		sll.displayList();
//		sll.deleteFirstNode();
//		sll.displayList();
//		sll.deleteLastNode();
//		sll.displayList();
//		sll.insertFirstNode(99);
//		sll.insertFirstNode(29);
//		sll.reverseList();
//		sll.displayList();
//		sll.insertMiddleNode(69);
//		sll.displayList();
//		sll.deleteMiddleNode();
//		sll.displayList();
//		sll.findLoc();
//		sll.displayList();
//		sll.displayReversListOfNode();
		System.out.println("Display rev :");
		sll.displayReverseListWithRec();
		System.out.println("Output of display reverse recursion:");
		sll.creatReverseLinkedWithRec(sll.head).displayReverseListWithRec();

	}
}
