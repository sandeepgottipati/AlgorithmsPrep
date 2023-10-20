package com.trees.traversals;

import java.util.*;

public class IterativeTraversals {

    private List<Integer> res;
    public List<Integer> getRes() {
        return res;
    }

    public void setRes(List<Integer> res) {
        this.res = res;
    }
    public List<Integer> levelOrderIterative(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int currSize=queue.size();
            for(int i=0;i<currSize;i++){
                Node curr=queue.poll();
                if(curr.left!=null)queue.add(curr.left);
                if(curr.right!=null)queue.add(curr.right);
                res.add(curr.data);

            }


        }
        return res;
    }
    public List<Integer> preOrderIterative(Node root){
        Stack<Node> st=new Stack<>();
        if(root==null){return new ArrayList<>();}
        st.push(root);
        while(!st.isEmpty()){
            Node curr=st.pop();
            if(curr.right!=null) st.push(curr.right);
            if(curr.left!=null) st.push(curr.left);
            res.add(curr.data);

        }
        return res;


    }
    public List<Integer> inOrderIterative(Node root){
        if(root==null) return new ArrayList<>();
        Stack<Node> st=new Stack<>();
       Node curr=root;
        while(!st.isEmpty() || curr!=null){

            if(curr!=null){
              st.push(curr);
                curr=curr.left;
            }
            else{
                curr=st.pop();
                res.add(curr.data);

                curr=curr.right;
            }


        }
        return res;
    }

public List<Integer> postOrderIterative(Node root){

    if(root==null) return new ArrayList<>();
    Stack<Node> st=new Stack<>();
    Node curr=root;
    Node temp=null;
    while(curr!=null || !st.isEmpty()){
        if(curr!=null){
            st.push(curr);
            curr=curr.left;
        }
        else{
            temp=st.peek().right;
            if(temp==null){
                temp=st.pop();
                res.add(temp.data);
                while(!st.isEmpty() && temp==st.peek().right){
                    temp=st.pop();
                    res.add(temp.data);
                }

            }
            else{
                curr=temp;
            }
        }
    }
    return res;
}

}
