package org.example;

/**
 * Represents a sorted linked list that maintains its elements in a sorted order.
 *
 * @author Duc Anh Cao
 * @param <T> the type of elements in this list, which must implement {@link Comparable}.
 */
public interface SortedLinkedList<T extends Comparable<T>> {
    /**
     * Adds the value of element to this list in a correct order.
     *
     * @param value value of element.
     */
    void add(T value);

    /**
     * Removes element from this list.
     *
     * @param value value of element.
     * @return {@code true} if element removed; {@code false} if element could not be removed.
     */
    boolean remove(T value);

    /**
     * Checks whether this element is in this list.
     *
     * @param value value of element.
     * @return {@code true} if element is contained in this list; {@code false} if element is not in this list.
     */
    boolean contains(T value);

    /**
     * Returns the size of this list as an {@code int}.
     * @return the number of elements in this list
     */
    int size();

    /**
     * Removes all elements from this list.
     */
    void clear();

    /**
     * Returns a string representation of this object.
     * @return a string describing this object
     */
    String toString();
}
