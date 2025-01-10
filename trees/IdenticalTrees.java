package trees;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class IdenticalTrees {

    public static boolean isIdentical(Node tree1, Node tree2){
        
        if(tree1==null && tree2==null)
            return true;
        
        if(tree1==null || tree2==null){
            return false;
        }
        
        return ((tree1.data==tree2.data) && isIdentical(tree1.left, tree2.left) && isIdentical(tree1.right, tree2.right));
    }

    public static boolean isIdenticalLevelOrder(Node tree1,Node tree2){

        if(tree1==null && tree2==null)
            return true;
        
        if(tree1==null || tree2==null)
            return false;
        
        Queue<Node> q1=new LinkedList<>();
        Queue<Node> q2=new LinkedList<>();

        q1.add(tree1);
        q2.add(tree2);

        while(!q1.isEmpty() && !q2.isEmpty()){
            Node curr1 = q1.poll();
            Node curr2 = q2.poll();

            if(curr1.data!=curr2.data)
                return false;
            
            if(curr1.left!=null && curr2.left!=null){
                q1.add(curr1.left);
                q2.add(curr2.left);
            }else if(curr1.left!=null || curr2.left!=null){
                return false;
            }

            if(curr1.right!=null && curr2.right!=null){
                q1.add(curr1.right);
                q2.add(curr2.right);
            }else if(curr1.right!=null || curr2.right!=null){
                return false;
            }
        }

        return (q1.isEmpty() && q2.isEmpty());
    }

    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);

        root.left.left=new Node(4);

        Node root1=new Node(1);
        root1.left=new Node(2);
        root1.right=new Node(3);

        root1.left.left=new Node(4);
        
        boolean isIdentical = isIdentical(root, root1);
        System.out.println("DFS Approach Is Identical:"+isIdentical);

        isIdentical = isIdenticalLevelOrder(root1, root);
        System.out.println("Level order Approach Is Identical:"+isIdentical);

    }
}
