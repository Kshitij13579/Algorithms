package trees;
/*
 * Depth of Node in Binary Tree
 * LevelOrderTraversal
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 * 
 * Recursion
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class DepthofNodeinBinaryTree {
    public static int height=-1;
    public static int heightofNodeRecursion(Node root,int k){

        if(root==null)
            return -1;
        
        int leftheight = heightofNodeRecursion(root.left, k);
        int rightheight = heightofNodeRecursion(root.right, k);

        int result = Math.max(leftheight, rightheight)+1;

        if(root.data==k){
            height=result;
        }

        return result;
    }

    public static int depthofNodeRecusrion(Node root,int k){
        if(root==null)
            return -1;
        
        int dist=-1;

        if((root.data==k) || (dist=depthofNodeRecusrion(root.left, k))>=0 || (dist=depthofNodeRecusrion(root.right, k)) >=0)
            return dist+1;
        
        return dist;
    }

    public static int depthofNodeLevelOrder(Node root,int k){

        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int level=0;
        int depth=-1;
        while(!q.isEmpty()){
            int size = q.size();

            for(int i=0;i<size;i++){
                Node curr=q.poll();

                if(curr.data==k)
                    depth=level;

                if(curr.left!=null) q.add(curr.left);
                if(curr.right!=null) q.add(curr.right);
            }
            
            level++;
            
        }
        return depth;
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

        int k=8;
        int depth=depthofNodeLevelOrder(root,k);
        System.out.println("Depth of Node Tree:"+depth);

        depth=heightofNodeRecursion(root,k);
        System.out.println("Height of Node Tree Recursion:"+height);

        depth=depthofNodeRecusrion(root,k);
        System.out.println("Depth of Node Tree Recursion:"+depth);
    }
}
