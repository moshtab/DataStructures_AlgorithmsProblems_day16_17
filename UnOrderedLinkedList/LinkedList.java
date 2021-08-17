package day16.UnorderedLinkedList;

public class LinkedList<T> implements InterfaceLinkedList<T> {
	Node<T> head;

	static class Node<T> {
		T data;
		Node<T> next;

		public Node(T data) {
			this.data = data;
			next = null;
		}

	}

	public void add(T data) {
		if (head == null) {
			head = new Node<T>(data);
			return;
		}
		Node<T> newNode = new Node<T>(data);
		newNode.next = head;
		head = newNode;

	}

	// searchMethod. Checks whether the value x is present in linked list
	public boolean search(Node<T> head, T x) {
		Node<T> current = head; // Initialize current
		while (current != null) {
			if (current.data == x)
				return true; // data found
			current = current.next;
		}
		return false; // data not found
	}

	// deleting the entered key
	public void deleteNode(T key) {
		System.out.println("deleting the entered key");
		// Store head node
		Node<T> temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			return;
		}

		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;
		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;

	}

	public void printList() {
		Node<T> n = head;
		while (n != null) {
			System.out.print(n.data + " ");
			n = n.next;
		}

	}

}
