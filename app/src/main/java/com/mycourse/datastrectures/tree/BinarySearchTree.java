package com.mycourse.datastrectures.tree;

public class BinarySearchTree {
 BinaryNode root;
 BinaryNode toShow;

 BinarySearchTree(){
     root = null;
 }

 //Insert Method
    private BinaryNode insert(BinaryNode currentNode, int value){
     if(currentNode==null){
         BinaryNode newNode = new BinaryNode();
         newNode.value = value;
//         System.out.println("The value inserted"+ value);
         return newNode;
     } else if(value<=currentNode.value){
         currentNode.left = insert(currentNode.left,value);
         return currentNode;
     } else {
         currentNode.right = insert(currentNode.right,value);
         return currentNode;
     }
    }

    void insert(int value){
  root =   insert(root,value);
    }

    public BinaryNode getRoot(){
     return toShow.left;
    }

    //PreOreder traversal
    public void preOreder(BinaryNode node){
     if(node ==null){
         return;
     }
     System.out.print(node.value+" ");
     preOreder(node.left);
     preOreder(node.right);
    }

}
