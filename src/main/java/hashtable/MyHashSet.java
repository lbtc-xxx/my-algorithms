package hashtable;

import linkedlist.MyLinkedList;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyHashSet<V> implements Set<V> {

    private static final int SIZE = 20;
    private final List<V>[] bucket = createBuckets(SIZE);

    private List<V>[] createBuckets(int size) {
        List<V>[] list = (List<V>[]) new List[size];
        for (int i = 0; i < list.length; i++) {
            list[i] = new MyLinkedList<>();
        }
        return list;
    }

    public boolean add(final V v) {
        final int i = toIndex(v);
        List<V> vs = bucket[i];

        for (V elem : vs) {
            if (elem.equals(v)) {
                return false;
            }
        }

        return vs.add(v);
    }

    public boolean contains(final Object o) {
        final List<V> vs = bucket[toIndex(o)];

        for (V v : vs) {
            if (v.equals(o)) {
                return true;
            }
        }

        return false;
    }

    public boolean remove(final Object o) {
        return false;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public Iterator<V> iterator() {
        return new MyHashSetIterator<>(bucket);
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public <T> T[] toArray(final T[] a) {
        return null;
    }

    public boolean containsAll(final Collection<?> c) {
        return false;
    }

    public boolean addAll(final Collection<? extends V> c) {
        return false;
    }

    public boolean retainAll(final Collection<?> c) {
        return false;
    }

    public boolean removeAll(final Collection<?> c) {
        return false;
    }

    public void clear() {

    }

    private static int toIndex(Object o) {
        return o.hashCode() % SIZE;
    }
}
