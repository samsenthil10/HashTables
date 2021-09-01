package com.bridgelabz.hashtables;

public class MyHashMap<K,V> {
	
	LinkedList<K> linkedList= new LinkedList<>();
	
	public V get (K key) {
		MyMapNode<K,V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}
	
	public void add(K key, V value) {
		MyMapNode<K,V> mapNode = (MyMapNode<K, V>) linkedList.search(key);
		if(mapNode == null) {
			mapNode = new MyMapNode<K, V>(key,value);
			this.linkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}
}