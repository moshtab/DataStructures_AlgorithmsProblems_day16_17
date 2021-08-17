package day16.UnorderedLinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		String str = "be to not or be To";
		String[] arr = str.split(" ");
		int size = arr.length;
		for (int i = 0; i < size; i++) {
			list.add(arr[i]);
		}

		list.printList();
		System.out.println();

		// searching for enterd elements,if it is there,then deleting it
		if (list.search(list.head, "mohsin")) {
			System.out.printf("Yes %s is present \n", "mohsin");
			list.deleteNode("mohsin");
			list.printList();
			System.out.println();
		} else {
			// searching for enterd elements,if it is not there,then adding it
			System.out.printf("element %s not found and adding that element to list \n", "mohsin");

			list.add("mohsin");
			list.printList();
		}
	}

}
