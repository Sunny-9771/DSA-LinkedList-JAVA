package com.igr.sll; //package name 

import java.util.Scanner;

class SinglyLinkedList {
	SllNode head;
	Scanner scan = new Scanner(System.in);// taking it intially so we can use it in any
	// method. & no need to declear multiple times.

	void insertFirstNode(int data) {
		SllNode newNode = new SllNode(); // allocating memory
		newNode.data = data; // assigning data to newNode.
		if (head == null) { // we consider 1st node of list is head so we r checking
			// that it is null or not
			head = newNode;// if it's null then making newNode head.
		} else {
			newNode.next = head;// link newNode to head.
			head = newNode;// assigning head to newNode.
		}
	}

	void insertLastNode(int data) {
		SllNode newNode = new SllNode();// allocating memory.
		newNode.data = data;// assigning data to newNode.

		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not
			head = newNode; // if it's null then making newNode head.
		} else {
			SllNode temp = head;// taking head (head is first node of list) as temp.
			while (temp.next != null) {
				temp = temp.next;// move to the next node in a linked list.
			}
			temp.next = newNode;// link to temp(curr node) to newNode.
		}
	}

	void insertMiddleNode(int data) {
		SllNode newNode = new SllNode();// allocating memory.
		newNode.data = data;// assigning data to newNode.
		SllNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("Enter the index of new node: ");
		int index = scan.nextInt();
		for (int i = 1; i < index; i++) {
			temp = temp.next;// move to the next node in a linked list.
		}
		newNode.next = temp.next;// link newNode to temp next(node)
		temp.next = newNode;// link to newNode.
	}

	void deleteFirstNode() {
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not.
			System.out.println("List is empty");
		} else {
			head = head.next;// assigining head to nextNode of head(means 2nd nodOf list.
		}
	}

	void deleteLastNode() {
		SllNode temp = head;// taking head (head is first node of list) as temp.
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not.
			System.out.println("List is empty");
		}
		while (temp.next.next != null) {// loop itrates until next of next node null.
			temp = temp.next;// move to the next node in a linked list.
		}

		temp.next = null;// temp(node)next part making null that mean deleting address
							// he have currently.
	}

	void deleteMiddleNode() {
		if (head == null) {// we consider 1st node of list is head so we r checking
			// that it is null or not.
			System.out.println("List is empty");
		}
		SllNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("Enter the index of deleting node :");
		int index = scan.nextInt();
		for (int i = 0; i < index; i++) {
			temp = temp.next;// move to the next node in a linked list.
		}
		temp.next = temp.next.next;// link temp(node) to its next of next node.

	}

	void reverseList() {
		System.out.println("The Reverse list is :");
		SllNode curr = head;// taking head (head is first node of list) as curr.
		SllNode prev = null;// taking prev as a null.
		while (curr != null) {// loop iterates until it gets curr as null.
			SllNode temp = curr.next;// assigning temp to cur.next(2nd node)
			// cur is head.
			curr.next = prev;// link curr to previous.
			prev = curr;// assigning prev to curr. curr will be prev.
			curr = temp;// assigning curr to. temp will be curr.
		}
		head = prev;// assigning head to prev.
	}

	void findLoc() {
		System.out.println("Enter the data  :");
		int item = scan.nextInt();
		SllNode temp = head;// taking head (head is first node of list) as temp.
		int i = 0;
		while (temp != null) {// loop iterates until it gets temp null.
			if (temp.data == item) {// if node data & item(we putted data) is same
				System.out.println("Item found at loc :" + (i + 1));
				return;
			}
		}
	}

	void displayList() {
		SllNode temp = head;// taking head (head is first node of list) as temp.
		System.out.println("The linkedList is:");
		while (temp != null) {// loop iterates until it gets null.
			System.out.print(" " + temp.data);
			temp = temp.next;// move to the next node in a linked list.
		}
		System.out.println();
	}

	void displayReversListOfNode() {

		if (head == null)
			System.out.println("List is empty");

		SllNode temp = head;
		int countNode = 1;
		while (temp.next != null) {
			temp = temp.next;
			countNode++;
		}
		System.out.println(countNode);
		System.out.println(temp.data);
		for (int i = 1; i < countNode; i++) {
			temp = head;
			for (int j = 1; j < countNode - i; j++) {
				temp = temp.next;
			}
			System.out.println(temp.data);
		}
	}

	void displayReverseListWithRec() {
		displayReverseList(head);// and we r calling displayReverseList
	}

	void displayReverseList(SllNode temp) {
		if (temp == null) { // checking temp(head-1st node of list) is null or not.
			System.out.println("List is Empty");
			return;
		}
		if (temp.next == null) { // if node's next is null then,
			System.out.println(temp.data); // it will print data of that node.
		} else {
			displayReverseList(temp.next);// if we r not on last node then this method
											// will call itself and will pass
			System.out.println(temp.data); // printing data of each node.
		}
	}

	SinglyLinkedList creatReverseLinkedWithRec(SllNode temp) {
		SinglyLinkedList newLinkedList = new SinglyLinkedList();// allocating memory.
		extracted(temp, newLinkedList);
		return newLinkedList;
	}

	private void extracted(SllNode firstNodeOfLl, SinglyLinkedList newLinkedList) {
		if (firstNodeOfLl.next == null) {
			newLinkedList.insertLastNode(firstNodeOfLl.data);
			return;
		} else {
			extracted(firstNodeOfLl.next, newLinkedList);
			newLinkedList.insertLastNode(firstNodeOfLl.data);
		}

	}
}
