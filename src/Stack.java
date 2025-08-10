import java.util.EmptyStackException;

public class Stack
{
    private class Node
    {
        private Object data;
        private Node next;

        public Node(Object element, Node node)
        {
            this.data = element;
            this.next = node;
        }
    }//end node class

    protected Node top;
    protected int size;

    public Stack()
    {
        this.top = null;
        this.size = 0;
    }

    public int size(){return size;}

    public boolean isEmpty()
    {
        if (top == null)
            return true;
        return false;
    }

    public void push(Object element)
    {
        Node nn = new Node(element, top);
        this.top = nn;
        this.size++;
    }

    public Object pop() throws EmptyStackException
    {
        if (isEmpty())
            throw new EmptyStackException();
        Object temp = top.data;
        this.top = top.next;
        this.size--;
        return temp;
    }
}
