public class SortedArrayList<T extends Comparable<T>> implements SortedList<T>{

    //Int global variables
    protected T[] arr;
    protected int size;

    public SortedArrayList() //makes new array list and sets size at 0
    {
        arr = (T[]) new Comparable[10];
        size = 0;
    }

    public boolean add(T newEntry) //add and check sort
    {
        if (size == arr.length){ //grow array if needed
            grow_array();
        }
        arr[size] = newEntry; //put new item in array
        for (int i = size; i > 0 && arr[i - 1].compareTo(arr[i]) >= 0; i--) //Sort array with new item in it
        {
            T temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
        }
        size++;
        return true;
    }

    public Comparable<T> remove(int pos) //remove item at certain location
    {

        if (pos < 0 || pos > size) {
            throw new UnsupportedOperationException("Not valid pos."); //throw error if pos is out of bounds
        }
        T item = arr[pos];


        for(int i = pos; i < size - 1; i++) { //shrinking array
            arr[i] = arr[i + 1];
        }

        size -= 1;
        return item;
    }

    public Comparable<T> get(int pos) //gets item at certain location
    {
        if (pos < 0 || pos >= size)
        {
            throw new UnsupportedOperationException("Out of Bounds."); //check if out of bounds
        }
        return arr[pos];
    }

    public int size() //size of arraylist
    {
        return size;
    }

    private void grow_array() //doubles size of array
    {
        T[] new_arr = (T[]) new Object[arr.length * 2];

        for(int i = 0; i <arr.length; i++){
            new_arr[i] = arr[i];
        }

        arr = new_arr;
    }
}

