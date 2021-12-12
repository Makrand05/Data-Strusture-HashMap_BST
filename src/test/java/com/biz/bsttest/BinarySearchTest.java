package com.biz.bsttest;

import com.biz.bst.BinaryTree;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BinarySearchTest {
    @Test
    public void givenNumber_WhenAdd_shouldReturnSize() {
        BinaryTree binaryTree = new BinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);

        Assert.assertEquals(3, binaryTree.getSize());
    }

    @Test
    public void givenNumberArray_whenAddInBST_shouldReturnSize() {
        BinaryTree binaryTree = new BinaryTree<>();
        int numberArray[] = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};
        for(int number:numberArray){
            binaryTree.add(number);
        }
        System.out.println(binaryTree.root);
        Assert.assertEquals(13, binaryTree.getSize());
    }

}
