package com.bridgelabz.hashmap;

import java.util.Map;

public class MapNode<K, V> implements INode<K> {

	public K key;

	public V value;

	public MapNode<K, V> next;

	public MapNode(K key, V value) {

		this.key = key;
		this.value = value;
		this.next = null;
	}

	@Override
	public K getKey() {
		// TODO Auto-generated method stub
		return key;
	}

	@Override
	public void setKey(K key) {
		this.key = key;

	}

	@Override
	public INode<K> getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(INode<K> next) {

		this.next = (MapNode<K, V>) next;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		StringBuilder myMapNodeString = new StringBuilder();
		myMapNodeString.append("MyMapNode{ " + "K=").append(key).append("v=").append(value).append('}');
		if (next != null) {
			myMapNodeString.append("->").append(next);

		}
		return myMapNodeString.toString();
	}

}
