package com.biz.hashmap;

public interface Node <T> {
    T getKey();

    void setKey(T key);

    Node getNext();

    void setNext(Node next);

}
