package org.gunnm.java.effective;

import java.util.Iterator;

/**
 * Generic LinkedList with an iterator. See the test
 * to check how to use it.
 * @param <E>
 */
public class GenericLinkedList<E> implements Iterable<E>{

    class LinkedListIterator implements Iterator<E> {
        private GenericLinkedList<E> currentNode;
        LinkedListIterator(GenericLinkedList<E> n) {
            this.currentNode = n;
        }

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public E next() {
            E e = currentNode.element;
            this.currentNode = currentNode.next;
            return e;
        }
    }

    private E element;
    private GenericLinkedList<E> next;

    public GenericLinkedList(E e) {
        this.element = e;
        this.next = null;
    }

    public GenericLinkedList(E e, GenericLinkedList<E> n){
        this.element = e;
        this.next = n;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator(this);
    }
}
