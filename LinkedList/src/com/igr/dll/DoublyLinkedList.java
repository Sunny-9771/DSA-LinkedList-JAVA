package com.igr.dll;

import java.util.Scanner;

public class DoublyLinkedList {
	DllNode head; 
	Scanner scan = new Scanner(System.in);// taking it intially so we can use it in any
										// method. & no need to declear multiple times.

	void insertfirstNode(int data) {
		DllNode newNode = new DllNode();// allocating memory
		newNode.data = data;// assigning data to newNode.
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not
			head = newNode;// if it's null then making newNode head.
		} else {
			newNode.next = head;// link newNode to head.
			head.prev = newNode;
			head = newNode;// making newNode head.
		}
	}

	void insertLastNode(int data) {
		DllNode newNode = new DllNode();// allocating memory
		newNode.data = data;// assigning data to newNode.
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not
			head = newNode;// if it's null then making newNode head.
		}
		DllNode temp = head;// taking head (head is first node of list) as temp.
		while (temp.next != null) {
			temp = temp.next;// move to the next node in a linked list.
		}
		temp.next = newNode;// link to temp(curr node) to newNode.
		newNode.prev = temp;
	}

	void insertMiddleNode(int data) {
		DllNode newNode = new DllNode();// allocating memory
		newNode.data = data;// assigning data to newNode.
		DllNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("Enter the loc of insertion: ");
		int index = scan.nextInt();
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;// move to the next node in a linked list.
		}
		newNode.next = temp.next;// link newNode to temp next(node)
		temp.next = newNode;// link to temp(curr node) to newNode.
	}

	void deleteFirstNode() {
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not
			System.out.println("List is empty");
		} else {
			head = head.next;// move head to next node.
			if (head != null)// If new head is not null,
				head.prev = null;// set its prev pointer to null
			System.out.println(head.prev + " it must be null as in doubly linked l");
		}
	}

	void deleteLastNode() {
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not
			System.out.println("List is empty");
		}
		DllNode temp = head;// taking head (head is first node of list) as temp.
		while (temp.next.next != null) {
			temp = temp.next;// move to the next node in a linked list.
		}
		temp.next = null;// temp(head)next part making null that mean deleting address
							// he have currently.
	}

	void deleteMiddleNode() {
		DllNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("Enter the loc of deletion: ");
		int index = scan.nextInt();
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;// move to the next node in a linked list.
		}
		temp.next = temp.next.next;// link temp(node) to its next of next node.
		temp.next.prev = temp;// next node's previous pointing to temp.
	}

	void findLocOfElement() {
		System.out.println("Enter the element : ");
		int item = scan.nextInt();
		DllNode temp = head;// taking head (head is first node of list) as temp.
		int i = 0;
		while (temp != null) {// loop will iterate until gets null temp.
			if (temp.data == item) {// if it gets data & item same then,
				System.out.println("Location of element:" + (i + 1));
				return;
			}
			temp = temp.next;// move to the next node in a linked list.
			i++;// moving ahead i
		}
		System.out.println("Element not available in list");
	}

	void findElementOfLoc() {
		System.out.println("Enter the loc : ");
		int loc = scan.nextInt();
		DllNode temp = head;// taking head (head is first node of list) as temp.
		int i = 1;
		while (temp != null) {// loop will iterate until gets null temp.
			if (i == loc) {
				System.out.println(" :" + temp.data);
				return;
			}
			temp = temp.next;// move to the next node in a linked list.
			i++;// moving ahead i
		}
		System.out.println("Loc is not available in list");
	}

	void reverseNode() {
		System.out.println("The reversee list is: ");
		DllNode curr = head;// taking head (head is first node of list) as temp.
		DllNode prev = null;// taking prev as a null.
		while (curr != null) {// loop iterates until it gets curr as null.
			DllNode temp = curr.next;// assigning temp to cur.next(2nd node)
										// cur is head.
			curr.next = prev;// link curr to previous.
			prev = curr;// assigning prev to curr. curr will be prev.
			curr = temp;// assigning curr to. temp will be curr.
		}
		head = prev;// assigning head to prev.
	}

	void displayList() {
		DllNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("The Duoblylinked list : ");
		while (temp != null) {// loop iterates until it gets null temp.
			System.out.print(" " + temp.data);
			temp = temp.next;// move to the next node in a linked list.
		}
		System.out.println();
	}

//	void displayReverseListWithRec() {
//		DllNode temp = head;// taking head (head is first node of list) as temp.
//		if (head == null) {// we consider 1st node of list is head so we r checking
//			// that it is null or not
//			System.out.println("List is empty");
//		}
//		displayReverseList(temp);
//
//	}
//
//	void displayReverseList(DllNode temp) {
//		if (temp == null) { // checking temp(head-1st node of list) is null or not.
//			return; // if its null that means list is empty, will go out.
//		} else {
//			displayReverseList(temp.next); // if we r not on last node then this method
//			// will call itself and will pass next node as
//			// parameter until it reaches last node
//		}
//		System.out.println(temp.data); // printing data of each node.
//	}
	
	void displayReverseList() {
		if (head == null) {
			System.out.println("List is empty");
		}
		DllNode temp = head;
		int countNode =1;
		while(temp.next != null) {
			temp = temp.next;
			countNode++;
		}
		System.out.println(countNode);
		System.out.println(temp.data);
		
		for(int i=1; i<countNode; i++) {
			temp = head;
			for(int j=1; j<countNode -i; j++) {
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}
}
