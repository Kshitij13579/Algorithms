package trees;

/*
 * Height of Binary tree
 * root to deepest node
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(h)
 */
class Node{
    int data;
    Node right;
    Node left;

    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class DepthofTree {

    public static int depthofTree(Node root){
        if(root==null)
            return -1;
        
        int leftheight= depthofTree(root.left);
        int rightheight= depthofTree(root.right);

        return Math.max(leftheight, rightheight)+1;
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

        int depth=depthofTree(root);
        System.out.println("Depth of Tree:"+depth);
    }
}
