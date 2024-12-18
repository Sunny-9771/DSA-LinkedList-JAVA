package com.igr.dcl;

public class DclTest {
	public static void main(String[] args) {
		DoublyCircularList Dcl = new DoublyCircularList();
		Dcl.insertAtBeginning(10);
		Dcl. displayList();
		Dcl.insertAtBeginning(9);
		Dcl. displayList();
		Dcl.insertAtBeginning(8);
		Dcl. displayList();
		Dcl.insertAtLast(11);
		Dcl.displayList();
		Dcl.insertAtMiddle(0);
		Dcl.displayList();
//		Dcl.deleteAtBeginning();
//		Dcl.displayList();
//		Dcl.deleteAtLast();
//		Dcl.displayList();
		Dcl.deleteAtMiddle();
		Dcl.displayList();
		
		
	}
}
