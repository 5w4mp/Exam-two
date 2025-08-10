/**
 * Must use seperate chaining strategy
 */
import com.sun.jdi.ObjectReference;

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

    }
}
