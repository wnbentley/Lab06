public class Test {
    public static void main(String[] args)
    {

        //Empty At Start Checks
        SortedArrayList<String> a1 = new SortedArrayList<String>();
        SortedLinkedList<String> l1 = new SortedLinkedList<String>();
        System.out.println(a1.size()); //Print out size of new arraylist
        System.out.println(l1.size()); //Print out size of new linkedlist
        // System.out.println(a1.get(0)); //Check that we throw Out of Bounds Exception for Arraylist comment in to check
        // System.out.println(l1.get(0)); // Check that we throw Out of Bounds Exception for Linkedlist

        //Adds Correctly Check, Items sorted
        //ArrayList
        a1.add("coolwhip");
        a1.add("brian");
        a1.add("zoo");
        a1.add("wow"); //n = 4
        System.out.println(a1.size());
        System.out.println(a1.get(0));
        System.out.println(a1.get(1));
        System.out.println(a1.get(2));
        System.out.println(a1.get(3));

        //LinkedList
        l1.add("coolwhip");
        l1.add("brian");
        l1.add("zoo");
        l1.add("wow"); //n = 4
        System.out.println(l1.size());
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));
        System.out.println(l1.get(3));

        //Checks get and remove error handling, comment in to check

        //System.out.println(a1.get(-1));
        //System.out.println(a1.get(a1.size+1));
        //System.out.println(a1.remove(-1));
        //System.out.println(a1.remove(a1.size+1));
        //System.out.println(l1.get(-1));
        //System.out.println(l1.get(a1.size+1));
        //System.out.println(l1.remove(-1));
        //System.out.println(l1.remove(a1.size+1));

        //Checks remove functionality

        //Arraylist
        a1.remove(2);
        System.out.println(a1.size());
        System.out.println(a1.get(0));
        System.out.println(a1.get(1));
        System.out.println(a1.get(2));

        //LinkedList
        l1.remove(2);
        System.out.println(l1.size());
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));



    }
}

