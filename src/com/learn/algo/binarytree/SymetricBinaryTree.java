package com.learn.algo.binarytree;

import com.learn.algo.binarytree.data.BinaryTree;
import com.learn.algo.binarytree.data.BinaryTreeSampleData;
import java.util.Stack;

public class SymetricBinaryTree {

    public static void main(String[] args) {
        System.out.println("Welome to Algorithm Learning");
        SymetricBinaryTree symetricBinaryTree=new SymetricBinaryTree();
        boolean isSymetric= symetricBinaryTree.isSymetricBinaryTree(BinaryTreeSampleData.symetricBinaryTreeData());
        System.out.println("Symetric binary Tree::"+ isSymetric);
    }

    public boolean  isSymetricBinaryTree(BinaryTree rootNode){
        boolean isSymetric=true;
        if (rootNode==null) {
            return isSymetric;
        }
        Stack<BinaryTree> stack=new Stack<BinaryTree>();
        stack.add(rootNode.leftNode);
        stack.add(rootNode.rightNode);
        while(!stack.empty()){
            BinaryTree left=stack.pop();
            BinaryTree right=stack.pop();
            //System.out.println("Left node Vlaue:"+left ==null ? " ":left.value +" Right node Value : "+right==null?" ":right.value);
            if (left ==null &&right ==null) {
                continue;
            }
            if (left==null ||right==null || left.value!=right.value) {
                return  false;
            }
            stack.push(left.leftNode);
            stack.push(right.rightNode);
            stack.push(left.rightNode);
            stack.push(right.leftNode);

        }


        return isSymetric;
    }

}
