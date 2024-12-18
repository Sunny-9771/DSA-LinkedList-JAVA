package com.igr.scl;

import java.util.Scanner;

public class SinglyCircularList {
	SclNode head;
	Scanner scan = new Scanner(System.in);

	void insertAtBeginning(int data) {
		SclNode newNode = new SclNode(); // allocating memory
		newNode.data = data; // assigning data to newNode.

		if (head == null) { // taking head (head is first node of list) as temp.
			head = newNode; // if it's null then making newNode head.
			newNode.next = head; // adding address of head in newNode next part.
		} else {
			newNode.next = head; // adding address of head in newNode next part.
			SclNode temp = head; // taking head (head is first node of list) as temp.
			while (temp.next != head) { // checks that the next node after temp is
										// not the head node.
				temp = temp.next; // is used to move to the next node in a linked list.
			}
			temp.next = newNode; // is used to link the current node (temp) to
									// a new node
			head = newNode; // making newNode head.
		}
	}

	void insertAtLast(int data) {
		SclNode newNode = new SclNode(); //allocating memory
		newNode.data = data; //assigning data to newNode.

		if (head == null) {// taking head (head is first node of list) as temp.
			head = newNode; //if it's null then making newNode head.
			newNode.next = head;// adding address of head in newNode next part.
		} else {
			SclNode temp = head;// taking head (head is first node of list) as temp.
			newNode.next = head;// is used to link the newNode to
								// head.
			while (temp.next != head) {
				temp = temp.next;// is used to move to the next node in a linked list.
			}
			temp.next = newNode;// is used to link the current node (temp) to
								// a new node
			newNode.next = head;// is used to link the newNode to
								// a head.
		}
	}

	void insertAtMiddle(int data) {
		SclNode newNode = new SclNode();// allocating memory.
		newNode.data = data;// assigning data to newNode.
		System.out.println("Enter the index: ");
		int index = scan.nextInt();
		SclNode temp = head;// taking head as temp.
		for (int i = 1; i < index; i++) {
			temp = temp.next; // is used to move to the next node in a linked list.
		}
		newNode.next = temp.next;// is used to link the newNode to
									// to the node that comes after temp.
		temp.next = newNode;// is used to link the current node (temp) to
							// a new node
	}

	void deleteAtbeginning() {
		if (head == null) {// taking head (head is first node of list) as temp.
			System.out.println("List is empty");
			return;
		} else {
			SclNode temp = head;// taking head as temp.
			while (temp.next != head) {// is used in linked lists to
				// traverse the list until you return to the starting node (head).
				temp = temp.next;// is used to move to the next node in a linked list.
			} 

			head = head.next;//move to the next node in a linked list.
			temp.next = head;//last node's next pointing to the new head.
		}
	}

	void deleteAtLast() {
		if (head == null) {// taking head (head is first node of list) as temp.
			System.out.println("List is empty");
			return;
		} else {
			SclNode temp = head;//taking head as temp.
			while (temp.next.next != head) {//is used in linked lists to
				// traverse the list until you get to the second last node.
				temp = temp.next;// move to the next node in a linked list.
			}
			temp.next = head;//second last node's next pointing to the new head.
		}
	}

	void deleteAtMiddle() {
		if (head == null) {// taking head (head is first node of list) as temp.
			System.out.println("List is empty");
			return;
		} else {
			SclNode temp = head;//taking head as temp.
			System.out.println("Enter the index: ");
			int index = scan.nextInt();
			for (int i = 1; i < index; i++) {
				temp = temp.next;//move to the next node in a linked list.
			}
			temp.next = temp.next.next;//linking the current node to it's next node 
									//of node.
		}
	}
	
	
	void reverseList() {
		System.out.println("The Reverse linked list is: ");

	    if (head == null) { 
	        // If the list is empty 
	        return;
	    }
		SclNode curr = head;
		SclNode prev = null;
		do{ 
			SclNode temp = head;
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}while (curr != head);
		head.next = prev;
		head = prev;
		}
		

	void displayList() {
		System.out.println("The linked list is: ");
		if (head == null) {
			System.out.print("List is empty");
			return;
		}

		System.out.print(head.data + " ");
		SclNode temp = head.next;
		while (temp != head) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	void displayReverseListWithRec() {
		SclNode temp = head; // taking head (head is first node of list) as temp.
		if (head == null) { // checking head(head-1st node of list) is null or not
			System.out.println("List is Empty");
		} else {
			displayReverseList(temp); // if head is not null that mean there is something
										// in a list, and we r calling displayReverseList
										// method.
		}
	}

	void displayReverseList(SclNode temp) {
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
	
	void displayReversListOfNode() {
		if (head == null) {// checking head(head-1st node of list) is null or not
			System.out.println("List is empty");
		}
		SclNode temp = head; // taking head (head is first node of list) as temp.
		while (temp.next != head) {
			temp = temp.next;
		}
	}
}
