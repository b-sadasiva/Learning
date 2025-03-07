package com.learn.algo.binarytree;

import com.learn.algo.binarytree.data.BinaryTree;
import com.learn.algo.binarytree.data.BinaryTreeSampleData;


public class BinaryTreesSame {

    public static void main(String[] args) {
        System.out.println("valid Binary Trees...");
        BinaryTreesSame binaryTreeSame=new BinaryTreesSame();
        boolean isSameBinary=binaryTreeSame.isSameTree(BinaryTreeSampleData.binaryTreeData(), BinaryTreeSampleData.binaryTreeData());
        System.out.println("Same Binary Tree::"+isSameBinary);
    }
      public boolean isSameTree(BinaryTree p, BinaryTree q) {

        if(p ==null && q==null) {
            return true;
        }
        if ((p!=null&&q==null)||(p==null&&q!=null)||(p.value !=q.value)) {
            return false;
        }
        BinaryTree leftNodeP=p.leftNode;
        BinaryTree leftNodeQ=q.leftNode;
        BinaryTree rightNodeP=p.rightNode;
        BinaryTree rightNodeQ=q.rightNode;

        boolean isLeftNodesAreEqual=isSameTree(leftNodeP, leftNodeQ);
        if (isLeftNodesAreEqual) {
            boolean isRightNodesAreEqual=isSameTree(rightNodeP,rightNodeQ); 
            return isRightNodesAreEqual;
        }



        return false;
        
    }
}
