package com.biz.hashmap;

public class LinkedList<K> {
    Node<K> head;
    Node<K> tail;

    public Node<K> search(K key) {
        Node temp = head;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void append(Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
}
