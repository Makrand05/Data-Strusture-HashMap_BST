package com.biz.bsttest;

import com.biz.bst.BinaryTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearchTest {
    @Test
    public void givenNumber_WhenAdd_shouldReturnSize() {
        BinaryTree binaryTree=new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        Assert.assertEquals(3,binaryTree.getSize());
    }
}
