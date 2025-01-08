package trees;

import java.util.ArrayList;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BoundaryTraversal {
    
    public static void leafNodes(Node root,ArrayList<Integer> result){
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
            result.add(root.data);
        
        leafNodes(root.left,result);
        leafNodes(root.right,result);

    }

    public static void leftboundary(Node root,ArrayList<Integer> result){

        if(root==null)
            return;
        
        if(root.left!=null){
            result.add(root.data);
            leftboundary(root.left, result);
        }else if(root.right!=null){
            result.add(root.data);
            leftboundary(root.right, result);
        }

    }

    public static void rightboundary(Node root,ArrayList<Integer> result){

        if(root==null)
            return;
        
        if(root.right!=null){
            rightboundary(root.right, result);
            result.add(root.data);
        }else if(root.left!=null){
            rightboundary(root.left, result);
            result.add(root.data);
        }

    }

    public static void boundaryTraversal(Node root){
        ArrayList<Integer> result = new ArrayList<>();

        result.add(root.data);

        //left boundary
        leftboundary(root.left, result);

        //leaf nodes
        leafNodes(root.left, result);
        leafNodes(root.right, result);

        //right boundary
        ArrayList<Integer> temp = new ArrayList<>();
        rightboundary(root.right, temp);
        result.addAll(temp);

        //print result
        for(Integer i:result){
            System.out.print(i+" ");
        }
    }
    
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.right=new Node(6);
        root.right.left=new Node(7);

        root.left.left.left=new Node(8);
        root.left.left.right=new Node(9);
        root.left.left.left.left=new Node(10);
        root.left.left.right.right=new Node(11);

        root.right.right.right=new Node(12);
        root.right.right.left=new Node(13);
        root.right.right.left.left=new Node(14);

        boundaryTraversal(root);

    }
}
