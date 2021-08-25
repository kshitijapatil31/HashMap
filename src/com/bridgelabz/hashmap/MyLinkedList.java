package com.bridgelabz.hashmap;

public class MyLinkedList<T> {

	private INode head;
	private INode tail;
	private int size;
	
	public MyLinkedList() {
		super();
		this.head = null;
		this.tail = null;
		size=0;
	}

	public int listSize() {
		return size;
	}

	public void add(INode newNode) {
		if(tail==null) {
			
			tail=newNode;
			
		} if(head==null) {
			
			head=newNode;
			
		}else {
			INode tempNode=head;
			head=newNode;
			head.setNext(tempNode);
		}
		size++;
		
	}
	
	public void append(INode<T> newNode) {
		if(head==null) {
			head=newNode;
		}if(tail==null) {
			tail=newNode;
		}else {
			tail.setNext(newNode);
			tail=newNode;
			
			
		}
		
		size++;
	}
	
	public void insert(INode node,INode newNode) {
		INode temp=node.getNext();
		node.setNext(newNode);
		newNode.setNext(temp);
		size++;
	}
	public INode pop() {
		INode temp=head;
		head=head.getNext();
		size--;
		return temp;
		
	}
	public INode popLast() {
		INode temp=head;
		while(!temp.getNext().equals(tail)) {
			temp=temp.getNext();
		}
		tail=temp;
		temp=temp.getNext();
		size--;
		return temp;
	}
	public INode <T>search(T element) {
		
		INode <T>temp=head;
		while(temp!=null&&temp.getNext()!=null) {
			if(temp.getKey().equals(element)) {
				return temp;
			}
			
			temp=temp.getNext();
		}
		return null;
	}
	
	
	public void print() {
		System.out.println(head);
	}
	public String toString() {
		return "MyLinkedList:"+head+")";
	}
	
}