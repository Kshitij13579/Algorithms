package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node right;
    Node left;

    Node(int x){
        data=x;
        left=right=null;
    }
}

public class MirrorTree {

    public static void mirrorTree(Node root){
        if(root==null)
            return;
        
        mirrorTree(root.left);
        mirrorTree(root.right);

        Node temp = root.left;
        root.left=root.right;
        root.right=temp;
    }

    public static void levelOrderMirrorTree(Node root){
        
        if(root==null)
            return;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){
            Node curr = q.poll();

            Node temp = curr.left;
            curr.left=curr.right;
            curr.right=temp;
     
            if(curr.left!=null) q.add(curr.left);
            if(curr.right!=null) q.add(curr.right);
        }

    }

    public static void inorder(Node root){
        if(root==null)
            return;
        
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);

        System.out.println("Before:");
        inorder(root);
        System.out.println("\nAfter Mirror:");
        mirrorTree(root);
        inorder(root);

        System.out.println("\nAfter Level Order Mirror:");
        levelOrderMirrorTree(root);
        inorder(root);
    }
}
