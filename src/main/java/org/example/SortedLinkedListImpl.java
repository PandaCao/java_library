package org.example;

/**
 * This class always returns sorted linked list
 *
 * @author Duc Anh Cao
 * @see    SortedLinkedList
 * @param <T> the type of objects that this linked list is going to be
 */
public class SortedLinkedListImpl<T extends Comparable<T>> implements SortedLinkedList<T> {

    /**
     * Node in the linked list
     *
     * @param <T> the type of object this node is going to be
     */
    private static class Node<T> {
        T value;
        Node<T> nextNode;

        Node(T value) {
            this.value = value;
            this.nextNode = null;
        }
    }

    private Node<T> node;
    private int size;

    /**
     * Constructs an empty list.
     */
    public SortedLinkedListImpl() {
        node = null;
        size = 0;
    }

    /**
     * Adds a value to this list while maintaining the sorted order.
     * The method traverses the list from the first node to find the correct position for the new value.
     *
     * @param value adds value to LinkedList in correct order
     * @throws NullPointerException if the specified value is null
     */
    @Override
    public void add(T value) {
        if (value == null) {
            throw new NullPointerException("Null value is not allowed");
        }

        Node<T> newNode = new Node<>(value);

        if (node == null || node.value.compareTo(value) >= 0) {
            newNode.nextNode = node;
            node = newNode;
        } else {
            Node<T> current = node;
            while (current.nextNode != null && current.nextNode.value.compareTo(value) < 0) {
                current = current.nextNode;
            }
            newNode.nextNode = current.nextNode;
            current.nextNode = newNode;
        }
        size++;
    }

    /**
     * Removes specified element from this list.
     *
     * @param value value of element.
     * @return {@code true} if  element was removed.
     */
    @Override
    public boolean remove(T value) {
        if (node == null) {
            return false;
        }

        if (node.value.equals(value)) {
            node = node.nextNode;
            size--;
            return true;
        }

        Node<T> current = node;
        while (current.nextNode != null && !current.nextNode.value.equals(value)) {
            current = current.nextNode;
        }

        if (current.nextNode == null) {
            return false;
        }
        current.nextNode = current.nextNode.nextNode;
        size--;

        return true;
    }

    /**
     * Returns {@code true} if this list contains the specified element.
     *
     * @param value value of element.
     * @return {@code true} if this list contains the specified value.
     */
    @Override
    public boolean contains(T value) {
        Node<T> current = node;

        while (current != null) {
            if (current.value.equals(value)) {
                return true;
            }

            current = current.nextNode;
        }

        return false;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all elements from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        node = null;
        size = 0;
    }

    /**
     * Returns a string representation of this list in the format "value1 -> value2 -> ... -> null".
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = node;

        while (current != null) {
            sb.append(current.value).append(" -> ");
            current = current.nextNode;
        }
        sb.append("null");

        return sb.toString();
    }
}
