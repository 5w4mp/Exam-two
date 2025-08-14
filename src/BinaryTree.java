public class BinaryTree
{
    private Node root;

    private class Node
    {
        Node left, right;
        Comparable data;

        public Node(Comparable newData)
        {
            left = null;
            right = null;
            data = newData;
        }
    }// end BST class
    //Creates an empty BST
    public BinaryTree(){root = null;}

    // Inorder traversal
    private void printTree(Node node)
    {
        if (node == null) return;
        printTree(node.left);
        System.out.println(node.data + " ");
        printTree(node.right);
    }
    private void printTreePre(Node node)
    {
        if (node == null) return;
        System.out.println(node.data + " ");
        printTreePre(node.left);
        printTreePre(node.right);
    }

    private void printTreePost(Node node)
    {
        if (node == null) return;
        printTreePost(node.left);
        printTreePost(node.right);
        System.out.println(node.data + " ");
    }

    private void printTreeI(Node node)
    {
        if(node == null){return;}
        printTreeI(node.left);
        System.out.println(node.data + " ");
        printTreeI(node.right);
    }
    private void printTreePr(Node node)
    {
        if(node == null){return;}
        System.out.println(node.data + " ");
        printTreePr(node.left);
        printTreePr(node.right);
    }

    private void printTreePo(Node node)
    {
        if(node == null){return;}
        printTreePo(node.right);
        printTreePo(node.left);
        System.out.println(node.data + " ");
    }





































}
