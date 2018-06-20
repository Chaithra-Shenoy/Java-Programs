/**
 * 
 */
package com.bridgelabz.datastructure;

import com.bridgelabz.datastructure.Node;

/**
 * purpose Ordered List Using LinkedList
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class OrderLinkList<E> {
	private Node head;
	private Node tail;
	private int size;

	/**
	 * @param sorted
	 */
	public void add(Integer sorted) {
		Node n1 = new Node(sorted, null, null);
		size++;
		if (head == null) {
			head = n1;
			tail = null;
		} else {

			Node temp = head;
			if (sorted instanceof Integer)
				while (temp != null) {
					if ((Integer) temp.getData() > (Integer) sorted) {
						n1.next = temp;
						n1.prev = temp.prev;
						if (temp.prev != null)
							temp.prev.next = n1;
						else
							head = n1;
						temp.prev = n1;
						return;
					}
					temp = temp.next;
				}
			if ((Integer) sorted > (Integer) tail.getData()) {
				n1.prev = tail;
				tail.next = n1;
				tail = n1;
			} else {
				n1.prev = null;
				n1.next = head;
				head = n1;
			}
		}
		size++;
	}

	public boolean search(E data) {
		if (head == null)
			return false;
		else {
			Node temp = head;
			while (temp != null) {
				if (((Integer) temp.getData()) == ((Integer) data)) {
					return true;
				}
				temp = temp.next;
			}
			return false;
		}
	}

	public void remove(E data) {
		if (head != null) {

			Node temp = head;
			while (temp != null) {
				if (((Integer) temp.getData()) == ((Integer) data)) {
					if (head == temp) {
						(temp.prev).next = head;
						head = head.next;
						return;
					} else if (tail == temp) {
						(temp.prev).next = null;
						tail = tail.prev;
						return;
					} else {
						(temp.prev).next = temp.next;
						(temp.next).prev = temp.prev;
						return;
					}
				}
				temp = temp.next;
			}
			size--;
		}
	}

	public String getLinkListString() {
		Node temp = head;
		String string = new String();
		while (temp != null) {
			string += temp.getData() + "";
			temp = temp.next;
		}
		return string;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.getData() + "-->");
			temp = temp.next;
		}
		System.out.println();
	}

	/**
	 * @param intArray
	 * @return
	 */
	public int[] Sort(int[] intArray) {
		int temp = 0;
		for (int i = 0; i < intArray.length; i++) {
			for (int j = i; j < intArray.length; j++) {
				if (intArray[j] < intArray[i]) {
					temp = intArray[j];
					intArray[j] = intArray[i];
					intArray[i] = temp;
				}
			}
		}
		return intArray;
	}

}