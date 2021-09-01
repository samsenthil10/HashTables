package com.bridgelabz.hashtables;

public class MyMapNode<K,V> implements INodeIF<K> {
	private K key;
	private V value;
	private INodeIF<K> next;

	public MyMapNode(K data,V value) {
		this.key = data;
		this.value = value;
		this.next = null;
	}

	public V getValue() {
		return this.value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	public K getKey() {
		return this.key;
	}

	public void setKey(K data) {
		this.key = data;
	}

	public void setNext(INodeIF<K> next) {
		this.next = next;
	}

	public INodeIF<K> getNext() {
		return this.next;
	}
}