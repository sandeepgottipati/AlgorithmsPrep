package com.trees.traversals;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(4);
        root.left.right.right=new Node(5);
        root.right=new Node(3);
        root.right.left=new Node(6);
        root.right.right=new Node(8);
        root.right.left.right=new Node(7);
        root.right.left.right.left=new Node(9);
        //  RecursiveTraversals.preOrder(root);
       // RecursiveTraversals.res.forEach((x)->System.out.println(x));
       // RecursiveTraversals.postOrder(root);
        //RecursiveTraversals.res.forEach((x)->System.out.print(x+" "));
        //RecursiveTraversals.inOrder(root);
        //RecursiveTraversals.res.forEach((x)->System.out.print(x+" "));
        IterativeTraversals it=new IterativeTraversals();
        it.setRes(new ArrayList<>());
        System.out.println("Level Order Traversal ");
        it.levelOrderIterative(root).forEach((x)->System.out.print(x+" "));
        System.out.println();
        it.setRes(new ArrayList<>());
        System.out.println("Pre Order Traversal ");
        it.preOrderIterative(root).forEach((x)->System.out.print(x+" "));
        System.out.println();
        it.setRes(new ArrayList<>());
        System.out.println("Post Order Traversal ");
        it.postOrderIterative(root).forEach((x)->System.out.print(x+" "));

    }
}
