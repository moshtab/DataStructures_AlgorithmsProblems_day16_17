package day16.UnorderedLinkedList;

import day16.UnorderedLinkedList.LinkedList.Node;

interface InterfaceLinkedList<T> {
	public void add(T data);
	public boolean search(Node<T> head, T x);
	public void deleteNode(T key);
	public void printList();

}
