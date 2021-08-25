package com.bridgelabz.hashmap;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {

	private final int numBucket;
	ArrayList<MyLinkedList<K>> myBucketArray;

	public MyLinkedHashMap() {
		numBucket = 10;
		myBucketArray = new ArrayList<>(numBucket);

		for (int i = 0; i < numBucket; i++) {
			myBucketArray.add(null);
		}
	}

	private int getBucketIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % numBucket;
		return index;
	}

	public V get(K key) {
		int index = this.getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			return null;
		}
		MapNode<K, V> mapNode = (MapNode<K, V>) myLinkedList.search(key);
		return (mapNode == null) ? null : mapNode.getValue();
	}

	public void add(K key, V value) {
		int index = getBucketIndex(key);
		MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
		if (myLinkedList == null) {
			myLinkedList = new MyLinkedList<>();
			this.myBucketArray.set(index, myLinkedList);
		}
		MapNode<K, V> mapNode = (MapNode<K, V>) myLinkedList.search(key);
		if (mapNode == null) {
			mapNode = new MapNode<>(key, value);
			myLinkedList.append(mapNode);
		} else {
			mapNode.setValue(value);
		}
	}

}