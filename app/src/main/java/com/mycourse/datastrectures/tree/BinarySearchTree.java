package com.mycourse.datastrectures.tree;

import java.util.LinkedList;
import java.util.Queue;

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

    //In Order traversal
    public void inOrder(BinaryNode node){
     if(node==null){
         return;
     }
     inOrder(node.left);
     System.out.print(node.value+" ");
     inOrder(node.right);
    }

    //Post Order
    public void postOrder(BinaryNode node){
     if(node==null){
         return;
     }
     postOrder(node.left);
     postOrder(node.right);
     System.out.println(node.value+" ");
    }

    /*Tree traversal*/
    public void traversal(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value+" ");
            if(presentNode.left!=null){
                queue.add(presentNode.left);
            }
            if(presentNode.right!=null){
                queue.add(presentNode.right);
            }
        }
    }

    /*Binary Search tree*/
    public BinaryNode searchElement(BinaryNode node, int val){
        if(node==null){
            System.out.println("Value not found");
            return null;
        }
        if(node.value == val){
            System.out.println("Value Found "+val);
            return node;
        } else if(val <node.value){
            searchElement(node.left,val);
        } else {
            searchElement(node.right,val);
        }
        return node;
    }

    /*Minimum node for successar*/
    public static BinaryNode minimumNode(BinaryNode node){
        if(node.left==null){
            return node;
        } else {
            return minimumNode(node.left);
        }
    }
    /*Delete node in Binary Search tree*/
    public BinaryNode deleteNode(BinaryNode root, int val){
        if(root == null){
            return null;
        }
        if(val<root.value){
            root.left = deleteNode(root.left,val);
        } else if(val>root.value){
            root.right = deleteNode(root.right,val);
        } else if(root.left!=null && root.right!=null){
            BinaryNode temp =root;
            BinaryNode nextNodeForRight = minimumNode(temp.right);
            root.value = nextNodeForRight.value;
            root.right = deleteNode(root.right,nextNodeForRight.value);
        } else if(root.left!=null){
            root = root.left;
        } else if(root.right!=null){
            root = root.right;
        } else {
            root = null;
        }

        return root;


    }

}
