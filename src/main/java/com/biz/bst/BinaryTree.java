package com.biz.bst;

public class BinaryTree<K extends Comparable> {
    public BstNode<K> root;

    public void add(K data) {
        this.root = this.insert(root, data);
    }

    private BstNode<K> insert(BstNode<K> newRoot, K data) {
        if (newRoot == null)
            return new BstNode<>(data);
        int result = data.compareTo(newRoot.data);
        if (result == 0) {
            return newRoot;
        } else if (result < 0) {
            newRoot.leftNode = insert(newRoot.leftNode, data);
        } else
            newRoot.rightNode = insert(newRoot.rightNode, data);
        return newRoot;
    }
    public int getSize(){
        return this.countNode(root);
    }

    private int countNode(BstNode<K> root) {
        if (root==null)
            return 0;
        else {
            return 1+this.countNode(root.leftNode)+this.countNode(root.rightNode);
        }
    }


}
