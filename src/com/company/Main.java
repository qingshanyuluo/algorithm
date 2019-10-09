package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Integer[] data = {1, 2, 3};
        MyLinkedList<Integer> integerMyLinkedList = new MyLinkedList<>(data);
        integerMyLinkedList.insert(1, 10);
        integerMyLinkedList.delete(1);
        "fsjflasfj".replace("aa", "a");

    }
}

class MyLinkedList <T>{
    class Node {
        Node(T date) {
            this.date = date;
        }
        T date;
        Node next;
    }

    private Node head;
    private Node end;

    MyLinkedList(T[] date) {
        for (int i = 0; i < date.length; i++) {
            add(date[i]);
        }
    }

    public void add(T data) {
        if (head == null) {
            head = new Node(data);
            end = head;
        } else {
            end.next = new Node(data);
            end = end.next;
        }
    }

    public void insert(int index, T date) {
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        Node newNode = new Node(date);
        newNode.next = current.next;
        current.next = newNode;
    }

    public void delete(int index) {
        Node current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }
}