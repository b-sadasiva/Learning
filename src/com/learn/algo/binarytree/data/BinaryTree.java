package com.learn.algo.binarytree.data;

public class BinaryTree {
    public int value;
    public BinaryTree leftNode;
    public BinaryTree rightNode;

    public BinaryTree(int value,BinaryTree leftNode, BinaryTree rightNode){
        this.value=value;
        this.leftNode=leftNode;
        this.rightNode=rightNode;
    }


}
