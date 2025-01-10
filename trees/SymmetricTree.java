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

public class SymmetricTree {

    public static boolean isMirror(Node leftTree,Node rightTree){
        
        if(leftTree==null && rightTree==null)
            return true;
        
        if(leftTree==null || rightTree==null)
            return false; 

        if(leftTree.data!=rightTree.data)
            return false;
        
        return isMirror(leftTree.left, rightTree.right) && isMirror(rightTree.left, leftTree.right);
    }
    public static boolean isSymmetric(Node root){
        if(root==null)
            return true;
        return isMirror(root.left,root.right);
    }

    public static boolean levelOrderisSymmetric(Node root){
        if(root==null)
            return true;
        
        Queue<Node> q=new LinkedList<>();
        q.offer(root.left);
        q.offer(root.right);

        while(!q.isEmpty()){
            Node leftTree=q.poll();
            Node rightTree=q.poll();

            if(leftTree==null && rightTree==null){
                continue;
            }

            if(leftTree==null || rightTree==null || leftTree.data!=rightTree.data){
                return false;
            }

            q.add(leftTree.left);
            q.add(rightTree.right);

            q.add(leftTree.right);
            q.add(rightTree.left);
        }

        return q.isEmpty();
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(2);
        root.left.left=new Node(3);
        root.left.right=new Node(4);
        root.right.left=new Node(4);
        root.right.right=new Node(3);
        root.right.right.right=new Node(3);
        

        System.out.println("Symmetric:"+levelOrderisSymmetric(root));
    }
}
