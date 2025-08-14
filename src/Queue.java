// Implement all below.

public class Queue
{
    private class Node
    {
        private Object data;
        private Node next;

        public Node(Object data)
        {
            this.data = data;
            this.next = null;
        }
    }
    protected Node head, tail;
    protected int size;

    public Queue()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //public void enqueue(Object data)
    //{
        //Node nn = new Node(data);
        //if (this.size == 0){this.head = nn;}
        //else{this.tail.next = nn;}
        //this.tail = nn;
        //this.size++;
    //}

    //public Object dequeue(Object data) throws Exception
    //{
      //  if (this.size == 0)
        //    throw new Exception("Queue is empty. ");
        //Object temp = this.head.data;
        //this.head = this.head.next;
        //this.size--;
        //if(size==0)
            //this.tail = null;
        //return temp;
    //}



    public void enqueue(Object data)
    {
        Node nn = new Node(data);
        if(this.size == 0)
        {
            this.head = nn;
        }
        else
            this.tail.next = nn;
        this.tail = nn;
        this.size++;
    }

    public Object dequeue() throws Exception
    {
        if (size == 0){throw new Exception("Queue is empty. ");}
        Object temp = this.head.data;
        this.head = this.head.next;
        this.size--;
        if(size == 0)
            this.tail = null;
        return temp;
    }




}
