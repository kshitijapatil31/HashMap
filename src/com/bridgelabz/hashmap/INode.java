package com.bridgelabz.hashmap;

public interface INode<T> {

	
  
	
	T getKey();
	void setKey(T key);
	
	INode getNext();
	void setNext(INode<T> next);
	//V getValue();
	//void setValue(V value);
}
