package day52_Collection;

import java.util.*;

public class Lists {

    public static void main(String[] args) {

// List<String> list0 =  new List<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);

        List<Integer> list2 = new LinkedList<>();
        list2.add(10);
        list2.remove(0);

        System.out.println("===================================");
        ArrayList<Integer> arraylist = new ArrayList<>();
        arraylist.add(10);

        Vector<Integer>  vector = new Vector<>();
        vector.add(10);

        Stack<Integer> stack = new Stack<>();
        stack.add(10);

        System.out.println("===========================================");

        Stack<String> names = new Stack<>();
        names.add("Sha");
        names.add("Dovran");
        names.add("Rahman");
        names.add("Anna");
        names.add("Rustem");

        System.out.println(names);

        String s1 = names.pop(); //"Rustem"
        System.out.println(s1);


        System.out.println("================================");

        System.out.println(names);

        String s2 =    names.pop(); // "Anna"
        System.out.println(s2);
        System.out.println(names);

        names.push("Phu");
        System.out.println(names);

// (Singly link)Array list--retrieving fast
        // (doubly link) Linked link-----adjusting fast.

        System.out.println("======================================================");
    }










        List<String> list8 = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends String> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int index) {
                return null;
            }

            @Override
            public String set(int index, String element) {
                return null;
            }

            @Override
            public void add(int index, String element) {

            }

            @Override
            public String remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @Override
            public ListIterator<String> listIterator(int index) {
                return null;
            }

            @Override
            public List<String> subList(int fromIndex, int toIndex) {
                return null;
            }
        };


    }


