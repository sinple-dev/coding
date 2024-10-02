package com.coding.hackerrank.easy;

import java.io.*;
import java.util.List;
import java.util.Stack;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;

class SinglyLinkedListNode {
	public int data;
	public SinglyLinkedListNode next;

	public SinglyLinkedListNode(int nodeData) {
		this.data = nodeData;
		this.next = null;
	}
}

class SinglyLinkedList {
	public SinglyLinkedListNode head;
	public SinglyLinkedListNode tail;

	public SinglyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void insertNode(int nodeData) {
		SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.next = node;
		}

		this.tail = node;
	}
}

class SinglyLinkedListPrintHelper {
	public static void printList(SinglyLinkedListNode node, String sep) {
		while (node != null) {
			System.out.print(node.data);

			node = node.next;

			if (node != null) {
				System.out.print(sep);
			}
		}
	}
}

class Result7 {

	/*
	 * Complete the 'reversePrint' function below.
	 *
	 * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
	 */

	/*
	 * For your reference:
	 *
	 * SinglyLinkedListNode {
	 *     int data;
	 *     SinglyLinkedListNode next;
	 * }
	 *
	 */

	public static void reversePrint(SinglyLinkedListNode llist) {
		// Write your code here

		Stack<Integer> stack = new Stack<>();
		while (llist != null) {
			stack.push(llist.data);
			llist = llist.next;
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}
}

public class Print_in_Reverse {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int tests = Integer.parseInt(bufferedReader.readLine().trim());

		IntStream.range(0, tests).forEach(testsItr -> {
			try {
				SinglyLinkedList llist = new SinglyLinkedList();

				int llistCount = Integer.parseInt(bufferedReader.readLine().trim());

				IntStream.range(0, llistCount).forEach(i -> {
					try {
						int llistItem = Integer.parseInt(bufferedReader.readLine().trim());

						llist.insertNode(llistItem);
					} catch (IOException ex) {
						throw new RuntimeException(ex);
					}
				});

				Result7.reversePrint(llist.head);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		bufferedReader.close();
	}
}
