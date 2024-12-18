package com.igr.dll;

public class DllTest {
	public static void main(String[] args) {
		DoublyLinkedList Dll = new DoublyLinkedList();
		Dll.insertfirstNode(100);
//		Dll.displayList();
		Dll.insertfirstNode(10);
//		Dll.displayList();
		Dll.insertLastNode(12);
//		Dll.displayList();
		Dll.insertLastNode(13);
		Dll.displayList();
//		Dll.insertLastNode(14);
//		Dll.displayList();
//		Dll.insertLastNode(15);
//		Dll.displayList();
//		Dll.insertLastNode(16);
//		Dll.displayList();

//		Dll.insertMiddleNode(13);
//		Dll.displayList();
//		Dll.deleteFirstNode();
//		Dll.displayList();
//		Dll.deleteLastNode();
//		Dll.displayList();
//		Dll.deleteMiddleNode();
//		Dll.displayList();
//		Dll.findLocOfElement();
//		Dll.displayList();
//		Dll.findElementOfLoc();
//		Dll.displayList();
//		Dll.reverseNode();
//		Dll.displayList();
//		Dll.displayReverseListWithRec();
		Dll.displayReverseList();
		
	}
}
