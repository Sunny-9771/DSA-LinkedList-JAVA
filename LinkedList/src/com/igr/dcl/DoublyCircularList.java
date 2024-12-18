package com.igr.dcl;

import java.util.Scanner;

import com.igr.scl.SclNode;

public class DoublyCircularList {
	DclNode head;
	DclNode prev;
	Scanner scan = new Scanner(System.in);

	void insertAtBeginning(int data) {
		DclNode newNode = new DclNode(); // allocating memory.
		newNode.data = data; // assigning data to newNode.
		if (head == null) {// checking head (head-1st node of list) is null or not.
			head = newNode; // if it's null then making newNode head.
			newNode.next = head; // link the new node to head.
			newNode.prev = head; // new node's previous points to head.
		} else {
			head.prev.next = newNode; // link the last node to newNode.
			newNode.prev = head.prev; // link newNode previous to head.
			newNode.next = head; // link newNode next to head.
			head.prev = newNode; // link head previous to newNode.
			head = newNode; // making newNode head.
		}
	}

	void insertAtLast(int data) {
		DclNode newNode = new DclNode();// allocating memory.
		newNode.data = data;// assigning data to newNode.

		head.prev.next = newNode;// link the last node to newNode.
		newNode.prev = head.prev;// link newNode previous to head previous(last node).
		newNode.next = head;// link the new node to head.
		head.prev = newNode;// link head previous to newNode.
	}

	void insertAtMiddle(int data) {
		DclNode newNode = new DclNode();// allocating memory.
		newNode.data = data;// assigning data to newNode.
		DclNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("Enter the index of newNode: ");
		int index = scan.nextInt();
		for (int i = 1; i < index; i++) {
			temp = temp.next;// move to the next node in a linked list.
		}
		temp.next.prev = newNode;// link newNode
		newNode.next = temp.next;// link newNode next to temp next(node).
		newNode.prev = temp;// link newNode prev to tempNode.
		temp.next = newNode;// link temp to newNode.
	}

	void deleteAtBeginning() {
		if (head == null) {// checking head (head-1st node of list) is null or not.
			System.out.println("List is empty");
			return;
		} else {
			head.prev.next = head.next;// link head previous(last node) to
										// head next(2ndNode of list)
			head = head.next;// making 2nd node head of list.
			head.prev = head.prev.prev;// link last node to new head.
		}
	}

	void deleteAtLast() {
		if (head == null) {// checking head (head-1st node of list) is null or not.
			System.out.println("List is empty");
			return;
		} else {
			head.prev.prev.next = head;// link head to second last node.
			head.prev = head.prev.prev;//// link last node to new head.
		}
	}

	void deleteAtMiddle() {
		if (head == null) {// checking head (head-1st node of list) is null or not.
			System.out.println("List is empty");
			return;
		} else {
			DclNode temp = head;// taking head (head is first node of list) as temp.
			System.out.println("Enter the index of deletion node: ");
			int index = scan.nextInt();
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;// move to the next node in a linked list.
			}
			temp.next = temp.next.next;// linking the current node to it's next node
										// of node.
		}
	}

	void displayList() {
		System.out.println("The circular list is : ");
		if (head == null) {// checking head (head-1st node of list) is null or not.
			System.out.println("The List is empty");
			return;
		}
		DclNode temp = head;//taking head (head is first node of list) as temp.
		do {
			System.out.print(temp.data + " ");
			temp = temp.next;// move to the next node in a linked list.
		} while (temp != head);//loop iterates until it reaches head.
		System.out.println();
	}

	void displayReverseListWithRec() {
		DclNode temp = head; // taking head as temp
		if (head == null) { // checking head(head-1st node of list) is null or not
			System.out.println("List is Empty");
		} else {
			displayReverseList(temp); // if head is not null that mean there is something
			// in a list, and we r calling displayReverseList
			// method.
		}
	}

	void displayReverseList(DclNode temp) {
		if (temp.next == head) { // checking temp.next have the add of head node.
			System.out.println(temp.data); // if it have that means we r on last node,
											// and we r printing last node.
			return;
		} else {
			displayReverseList(temp.next); // if we r not on last node then this method
			// will call itself and will pass next node as
			// parameter until it reaches last node
		}
		System.out.println(temp.data); // printing data of each node.
	}
}
