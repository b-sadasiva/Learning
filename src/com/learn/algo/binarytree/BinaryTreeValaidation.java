package com.learn.algo.binarytree;

import com.learn.algo.binarytree.data.BinaryTree;
import com.learn.algo.binarytree.data.BinaryTreeSampleData;

public class BinaryTreeValaidation {


    public static void main(String[] args) {
        System.out.println("Binary Tree..............");
        BinaryTreeValaidation binaryTreeValaidation=new BinaryTreeValaidation();
        boolean isBinaryTree=binaryTreeValaidation.isBinaryTree(BinaryTreeSampleData.binaryTreeData(), Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("Is Binary Tree::"+isBinaryTree);
    }
    
    public boolean isBinaryTree(BinaryTree root, long min,long max){
        long maxvalue=max;
        long minValue=min;
        if (root==null) {
            return  true;
        }

        if (root.value<=minValue|| root.value>=maxvalue) {
            return false;
        }
        BinaryTree  leftNode=root.leftNode;
        BinaryTree rightNode=root.rightNode;
        boolean isLeftIsBinary=isBinaryTree(leftNode,minValue,root.value);
        if(isLeftIsBinary){
            boolean isRightIsBinary= isBinaryTree(rightNode,root.value,maxvalue);
            return isRightIsBinary;
        }

        return false;
    }

}
