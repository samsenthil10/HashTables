package com.bridgelabz.hashtables;

public class LinkedList<T> {
	INodeIF<T> head;
	INodeIF<T> tail;

	public LinkedList() {
		this.head = null;
		this.tail = null;
	}

	public void add(INodeIF<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.setNext(head);
			head = node;
		}
	}

	public void add(INodeIF<T> node, T key) {
		INodeIF<T> keyNode = search(key);
		if (keyNode == null) {
			return;
		}
		if (tail.equals(keyNode)) {
			tail = node;
		}
		node.setNext(keyNode.getNext());
		keyNode.setNext(node);
	}

	public INodeIF<T> getHead() {
		return head;
	}

	public INodeIF<T> search(T key) {
		INodeIF<T> temp = head;
		while (temp != null && !temp.getKey().equals(key)) {
			temp = temp.getNext();
		}
		if(temp==null) {
			
		}
		return temp;
	}

	public void append(INodeIF<T> node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
			tail = node;
		}
	}

	public void printList() {
		INodeIF<T> temp = head;
		while (temp != null) {
			System.out.print(temp.getKey().toString() + " ");
			temp = temp.getNext();
		}
		System.out.println();
	}

	public void pop() {
		if (head == null) {
			return;
		}
		head = head.getNext();
		if (head == null) {
			tail = null;
		}
	}

	public void popLast() {
		if (head == null) {
		} else if (head == tail) {
			head = tail = null;
		} else {
			INodeIF<T> temp = head;
			while (temp.getNext() != tail) {
				temp = temp.getNext();
			}
			tail = temp;
			temp.setNext(null);
		}
	}

	public void deleteNode(T key) {
		INodeIF<T> keyNode = search(key);
		if(keyNode == null) {
			return;
		}
		if(head==keyNode) {
			head=null;
			tail=null;
		} else {
			INodeIF<T> temp = head;
			while(temp.getNext()!= keyNode) {
				temp = temp.getNext();
			}
			temp.setNext(keyNode.getNext());
			if(keyNode == tail) {
				tail = temp;
			}
		}
	}

	public int size() {
		int length = 0;
		INodeIF<T> temp = head;
		while (temp != null) {
			temp = temp.getNext();
			length++;
		}
		return length;
	}
}
