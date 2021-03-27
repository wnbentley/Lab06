public interface SortedList<T extends Comparable<T>>{ //interface int
        public boolean add(T newEntry);  //functions in imp
        public Comparable<T> remove(int pos);
        public Comparable<T> get(int pos);
        public int size();
}
