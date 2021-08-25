package com.bridgelabz.hashmap;

import java.util.HashMap;

public class MyHashMap <K,V>{

	MyLinkedList<K> myLinkedList;
	
	public MyHashMap() {
		this.myLinkedList=new MyLinkedList<>();
	}
	public V get(K key) {
		MapNode<K,V> myMapNode=(MapNode<K,V>)this.myLinkedList.search(key);
		return (myMapNode==null)?null:myMapNode.getValue();
	}
	public void add(K key,V value) {
		MapNode<K,V> myMapNode=(MapNode<K,V>)this.myLinkedList.search(key);
		if(myMapNode==null) {
			myMapNode=new MapNode<>(key,value);
			this.myLinkedList.append(myMapNode);
		}else {
			myMapNode.setValue(value);
		}
	}
	@Override
	public String toString() {
		return "MyLinkedList("+myLinkedList+")";
	}
}
