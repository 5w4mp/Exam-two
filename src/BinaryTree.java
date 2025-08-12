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
}
