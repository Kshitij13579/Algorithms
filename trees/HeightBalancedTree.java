package trees;

class Node {
    int data;
    Node right;
    Node left;

    Node(int x){
        data=x;
        left=right=null;
    }
}

public class HeightBalancedTree {

    public static int heightOfNode(Node root){
        if(root==null){
            return 0;
        }

        int lheight= heightOfNode(root.left);
        if(lheight==-1)
            return -1;

        int rheight= heightOfNode(root.right);
        if(rheight==-1)
            return -1;

        if(Math.abs(rheight-lheight)>1)
            return -1;

        return Math.max(lheight, rheight)+1;
    }

    public static boolean isHeightBalanced(Node root){
        
        if(root==null)
            return true;

        if(heightOfNode(root)<0)
            return false;
        return true;
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(9);
        root.left.left=new Node(3);
        root.right.left=new Node(4);
        root.right.right=new Node(3);

        System.out.println("Is Tree Height Balanced:"+isHeightBalanced(root));
 
    }
}
