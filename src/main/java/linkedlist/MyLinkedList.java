package linkedlist;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {

    private MutableNode<E> firstNode;
    private MutableNode<E> lastNode;

    @Override
    public boolean add(final E e) {
        if (firstNode == null) {
            firstNode = new MutableNode<>();
            firstNode.value = e;
            lastNode = firstNode;
            return true;
        }

        final MutableNode<E> newNode = new MutableNode<>();
        newNode.value = e;
        lastNode.next = newNode;
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator<>(firstNode);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(final Object o) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return null;
    }

    @Override
    public boolean remove(final Object o) {
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(final Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(final int index, final Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(final int index) {
        return null;
    }

    @Override
    public E set(final int index, final E element) {
        return null;
    }

    @Override
    public void add(final int index, final E element) {

    }

    @Override
    public E remove(final int index) {
        return null;
    }

    @Override
    public int indexOf(final Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(final Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(final int index) {
        return null;
    }

    @Override
    public List<E> subList(final int fromIndex, final int toIndex) {
        return null;
    }
}
