package org.example;

public class Main {
    public static void main(String[] args) {
        var list1 = new SortedLinkedListImpl<Integer>();
        list1.add(4);
        list1.add(3);
        list1.add(5);
        list1.add(7);
        list1.add(2);
        list1.add(6);
        list1.add(1);
        var list2 = new SortedLinkedListImpl<String>();
        list2.add("a");
        list2.add("d");
        list2.add("b");
        list2.add("e");
        list2.add("c");
        list2.add("f");
        list2.add("g");

        System.out.println("Sorted string list1:" + list1);
        System.out.println("Size of list1:" + list1.size());
        System.out.println("Sorted string list2:" + list2);
        System.out.println("Size of list2:" + list2.size());

        list1.remove(5);

        System.out.println("Sorted string list1:" + list1);
        System.out.println("Size of list1:" + list1.size());

        list1.remove(3);

        System.out.println("Sorted string list1:" + list1);
        System.out.println("Size of list1:" + list1.size());

        list1.clear();

        System.out.println("Sorted string list1:" + list1);
        System.out.println("Size of list1:" + list1.size());
    }
}