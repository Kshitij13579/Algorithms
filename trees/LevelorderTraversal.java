package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class LevelorderTraversal {

    /*
     * Level Order: 1,2,3,4,5,6,7 
     * Traverse tree horizontally. 
     */
    public static void levelorder(Node root){

        Queue<Node> queue= new LinkedList<Node>();
        queue.add(root);

        while(!queue.isEmpty()){
            Node current= queue.poll();
            System.out.print(current.data+" ");

            if(current.left!=null) queue.add(current.left);
            if(current.right!=null) queue.add(current.right);
        }

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("Level Order Traversal:");
        levelorder(root);
    }
}
