package com.trees.traversals;

import java.util.ArrayList;
import java.util.List;

public class RecursiveTraversals {
    static List<Integer >res;
   static{
       res=new ArrayList<>();
   }
     static void  preOrder(Node root){
        if(root==null){
            return;
        }
        res.add(root.data);
        preOrder(root.left);
        preOrder(root.right);


    }
    static void postOrder(Node root){
       if(root==null){
           return;
       }
       postOrder(root.left);
       postOrder(root.right);
       res.add(root.data);
    }
    static void inOrder(Node root){
       if(root==null){
           return ;
       }
       inOrder(root.left);
       res.add(root.data);
       inOrder(root.right);
    }
}
