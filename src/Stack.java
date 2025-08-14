import java.util.EmptyStackException;

public class Stack {
    private class Node {
        private Object data;
        private Node next;

        public Node(Object element, Node node) {
            this.data = element;
            this.next = node;
        }
    }//end node class

    protected Node top;
    protected int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.top == null)
            return true;
        return false;
    }

    /**
     * Push a new object onto the stack
     *
     * @param element data to be pushed onto the stack
     */
    //public void push(Object element) {
        //Node nn = new Node(element, top);
        //this.top = nn;
        //this.size++;
    //}

    /**
     * @return Object that was popped from stack.
     * @throws EmptyStackException
     */
    //public Object pop() throws EmptyStackException {
        //if (isEmpty())
            //throw new EmptyStackException();
        //Object temp = this.top.data;
        //this.top = this.top.next;
        //this.size--;
        //return temp;
    //}

    public void push(Object data)
    {
        Node nn = new Node(data, top);
        this.top = nn;
        this.size++;
    }

    public Object pop() throws EmptyStackException
    {
        if(isEmpty()){throw new EmptyStackException();}
        Object temp = this.top.data;
        this.top = this.top.next;
        this.size--;
        return temp;
    }






}









































