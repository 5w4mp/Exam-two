/**
 * Must use seperate chaining strategy
 *
 * Seperate Chaining's downside is it uses two data structures, a Linked List and an array.
 * This is extra memory usage.
 *
 * Linear Probing directly saves all the records to the one d array without a linked list
 * The colliding items are placed in the next available cell(It wraps around to the beginning if it
 * must).
 * Each table cell inspected is referred to as a probe.
 * Colliding items lump together causing future collisions to cause a larger sequence of probes
 *
 * Load factor(A) is the number of records in a hash table divided by the total size of the array.
 * the number of probes is 1 / (1-A)
 *
 * the more probes, the more searching done
 *
 */


import java.util.LinkedList;
public class HashTable
{
    private class Record
    {
        private Object key;
        private Object value;

        public Record()
        {
            this.key = null;
            this.value = null;
        }
        public Record(Object inKey, Object inData)
        {
            this.key = inKey;
            this.value = inData;
        }
        public boolean equals(Object object)
        {
            if (object instanceof Record)
            {
                Record node = (Record)object;
                return this.key.equals(node.key);
            }
            else
            {
                return false;
            }
        }
        public String toString(){return "Key: ["+this.key+"] Value: ["+this.value+"]";}
    }// end record class
    private int numElem;
    private LinkedList<Record> [] table;

    // Constructor
    public HashTable(int realSize)
    {
        this.table = new LinkedList[realSize];
        this.numElem = 0;
    }
    private int hash(Object key)
    {
        int result = 42;
        String inputString = key.toString().toLowerCase();
        char [] characters = inputString.toCharArray();
        for(int i = 0; i < characters.length; i++)
        {
            char currentChar = characters[i];
            int j = (int)currentChar;
            result += j;
        }
        return (result % this.table.length);
    }

    /**
     *
     * @param key
     * @param data
     */
    public void put(Object key, Object data)
    {
        boolean update = false;
        if(data == null || key == null)
        {
            System.err.println("ERROR: Either the key or the data are null. ");
            return;
        }
        // Find out where in our array the new item goes.
        int pos = this.hash(key);
        // If nothing exists in the position create a new linked list there.
        if(this.table[pos] == null)
        {
            this.table[pos] = new LinkedList<Record>();
        }
        LinkedList<Record> collisionList = this.table[pos];
        // If trying to add duplicate keys
        // we need to update value associated with the existing key
        // First delete the existing mapping and insert a new record at that key
        if(collisionList.contains(new Record(key, data)) )
        {
            collisionList.remove(new Record(key, data));
            update = true;
        }
        // Add to the linked list in the appropriate position
        collisionList.add(new Record(key, data));
        if( ! update)
        {
            this.numElem ++;
        }
    }

    public Object get(Object key)
    {
        if (key == null)
        {
            System.err.println("ERROR: Key is null.");
            return null;
        }
        // Find the hash position
        int pos = this.hash(key);

        if(this.table[pos] == null){return null;}

        // Get the linked list at this position
        LinkedList<Record> thisList = this.table[pos];

        // Create dummy record with the key to search for
        Record searchRecord = new Record(key, null);

        // Find it
        for(Record record : thisList)
        {
            if(record.equals(searchRecord)){return record.value;}
        }
        return null;
    }


}

