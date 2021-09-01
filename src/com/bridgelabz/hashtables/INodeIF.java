package com.bridgelabz.hashtables;

public interface INodeIF<T> {
	
	T getKey();
	void setKey(T data);
	
	INodeIF<T> getNext();
	void setNext(INodeIF<T> next);
}