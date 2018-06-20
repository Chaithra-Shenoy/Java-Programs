/**
 * 
 */
package com.bridgelabz.datastructure;

/**
 * purpose Queue implementation using Array.
 * 
 * @author Chaithra-Shenoy
 * @version 1.0
 * @since 17-05-2018
 */
public class Queue<T> {
	int size;
	int front = -1;
	int rear = -1;
	int[] array;
	private T data;

	Queue(int size) {
		this.size = size;
		array = new int[size];
	}

	/**
	 * 
	 */
	public Queue(T data) {
		this.data=data;
	}

	public int enqueue(T data) {
		if (rear == size - 1) {
			System.out.println("Queue is full");
			return -1;
		}
		rear++;
		return array[rear] = (int) data;
	}

	public int dequeue() {
		if (front == size - 1) {
			System.out.println("Queue is empty");
			return -1;
		}
		front++;
		return array[front];
	}

	public boolean isEmpty() {
		if (front == -1 && rear == -1)
			return true;
		else
			return false;
	}

	public int size() {
		return size;
	}
}
