package com.test;

class Node{
	public Node(String data) {
		this.data = data;
	}
	String data;
	Node next;
}

class SimpleLinkedList {
	private Node head = null;
	private Node tail = null;
	SimpleLinkedList(String head){
		this.head = new Node(head);
		this.tail = this.head;
	}
	
	public void add(String inputs) {
		Node newNode = new Node(inputs);
		this.tail.next = newNode;
		this.tail = newNode;
	}
	
	public void display() {
		Node curr = this.head;
		while(curr!=null) {
			System.out.println(curr.data);
			curr= curr.next;
		}
	}
}

public class TestLinkedList{
	public static void main(String[] args) {
		SimpleLinkedList list = new SimpleLinkedList("hello");
		list.add("I am");
		list.add("Bala");
		list.add("Simple");
		list.add("Testing");
		list.display();
		
	}
}