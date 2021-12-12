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

    public Node<K> delete(K key) {
        Node temp=head;
        if (temp==null){
            return null;
        }
        while (temp.getNext()!=null)
        {
            if (temp.getNext().getKey().equals(key)){
                Node m=temp.getNext().getNext();
                temp.setNext(m);
            }
            temp=temp.getNext();
        }
        return  temp;
    }
}
