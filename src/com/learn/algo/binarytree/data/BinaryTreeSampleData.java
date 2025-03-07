package com.learn.algo.binarytree.data;

public class BinaryTreeSampleData {

    public static BinaryTree symetricBinaryTreeData(){
        BinaryTree l1=new BinaryTree(3, null, null);
        BinaryTree l2=new BinaryTree(4, null, null);
        BinaryTree m1=new BinaryTree(4, null, null);
        BinaryTree m2=new BinaryTree(5, null, null);
        BinaryTree l11=new BinaryTree(2, l1, l2);
        BinaryTree l12=new BinaryTree(2, m1, m2);
        BinaryTree l=new BinaryTree(1, l11, l12);
        return  l;

    }

    public static BinaryTree binaryTreeData(){
        BinaryTree l1=new BinaryTree(2, null, null);
        BinaryTree l2=new BinaryTree(5, null, null);
        BinaryTree m1=new BinaryTree(7, null, null);
        BinaryTree m2=new BinaryTree(9, null, null);
        BinaryTree l11=new BinaryTree(4, l1, l2);
        BinaryTree l12=new BinaryTree(8, m1, m2);
        BinaryTree l=new BinaryTree(6, l11, l12);
        return  l;

    }

}
