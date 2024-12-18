package com.igr.scl;

public class SclTest {
public static void main(String[] args) {
	SinglyCircularList Scl = new SinglyCircularList();
	Scl.insertAtBeginning(10);
//	Scl.displayList();
	Scl.insertAtBeginning(9);
//	Scl.displayList();
//	Scl.insertAtLast(12);
//	Scl.displayList();
	Scl.insertAtBeginning(8);
//	Scl.displayList();
//	Scl.insertAtLast(13);
	Scl.insertAtBeginning(7);
	Scl.displayList();
//	Scl.displayList();
//	Scl.insertAtMiddle(11);
//	Scl.displayList();
//	Scl.deleteAtbeginning();
//	Scl.displayList();
//	Scl.deleteAtLast();
//	Scl.displayList();
//	Scl.deleteAtMiddle();
	Scl.reverseList();
	Scl.displayList();
//	Scl.displayList();
//	Scl.displayReverseListWithRec();
}
}
