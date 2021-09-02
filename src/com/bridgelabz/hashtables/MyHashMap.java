package com.bridgelabz.hashtables;

import java.util.*;

public class MyHashMap<K,V> {
	private int numBuckets;
	ArrayList<LinkedList<K>> bucketArray;

	public MyHashMap() {
		this.numBuckets = 10;
		this.bucketArray = new ArrayList<>(numBuckets);
		for(int i=0;i<numBuckets;i++) {
			bucketArray.add(null);
		}
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBuckets;
		return index;
	}

	public V get (K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = bucketArray.get(index);
		if(linkedList == null) {
			return null;
		}
		MyMapNode<K,V> MyMapNode = (MyMapNode<K,V>) linkedList.search(key);
		return (MyMapNode == null) ? null : MyMapNode.getValue();
	}

	public void add(K key, V value) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = bucketArray.get(index);
		if(linkedList == null) {
			linkedList = new LinkedList();
			bucketArray.set(index, linkedList);
		}
		MyMapNode<K,V> MyMapNode = (MyMapNode<K,V>) linkedList.search(key);
		if(MyMapNode == null) {
			MyMapNode = new MyMapNode(key,value);
			linkedList.append(MyMapNode);
		} else {
			MyMapNode.setValue(value);
		}
	}

	public void remove(K key) {
		int index = this.getBucketIndex(key);
		LinkedList<K> linkedList = bucketArray.get(index);
		if(linkedList != null) {
			linkedList.deleteNode(key);
		}
	}
}