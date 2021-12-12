package com.biz.bst;

public class BstNode<K> {
    public BstNode<K> leftNode;
    public BstNode<K> rightNode;
    K data;

    public BstNode(K data) {
        this.leftNode = null;
        this.rightNode = null;
        this.data = data;
    }

    @Override
    public String toString() {
        return "\nBstNode{" +
                "\nleftNode=" + leftNode +
                ", rightNode=" + rightNode +
                ", data=" + data +
                '}';
    }
}
