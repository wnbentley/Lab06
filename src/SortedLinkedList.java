public class SortedLinkedList<T extends Comparable<T>> implements SortedList<T>{
    //int variables
    protected int size;
    protected Node head;

    public SortedLinkedList() //constructor for linkedlist
    {
        head = null;
        size = 0;
    }

    public boolean add(T newEntry) //add new item in sorted manner
    {
        Node newNode = new Node(newEntry);
        Node cur = head;
        Node prev = null;
        while (cur != null && newEntry.compareTo((T) cur.data) > 0) { //add item and then sort pointers
            prev = cur;
            cur = cur.next;
        }
        if (prev == null) {
            head = newNode;
        }
        else {
            prev.next = newNode;
        }
        newNode.next = cur;
        size++;

        return true;
    }

    public Comparable<T> remove(int pos) //remove item at pos
    {
        if (pos < 0 || pos > size) {
            throw new UnsupportedOperationException("Not valid pos."); //check for out of bounds
        }

        if (pos == 0) //if pos is zero
        {
            Node node = head;
            head = head.next;
            --size;
            return node.data;
        }
        else
        {
            Node prev = head;
            for (int i = 0; i < pos - 1; i++) {
                prev = prev.next;
            }
            Node node = prev.next;
            prev.next = node.next;
            --size;
            return node.data;
        }

    }

    public Comparable<T> get(int pos) //get item at certain pos
    {
        Node curr = head;

        if (pos < 0 || pos >= size)
        {
            throw new UnsupportedOperationException("Out of Bounds."); //check for out of bounds
        }

        for (int i = 0; i < pos; i++)
        {
            curr = curr.next;
        }

        return curr.data;
    }

    public int size() //size of linkedlist
    {
        return size;
    }

    public class Node<T extends Comparable<T>> //node class
    {

        T data;
        Node<T> next;

        public Node(T newEntry)
        {
            data = newEntry;
            next = null;
        }

    }

}


