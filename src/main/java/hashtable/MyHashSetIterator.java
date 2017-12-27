package hashtable;

import java.util.Iterator;

public class MyHashSetIterator<E> implements Iterator<E> {

    private int current;
    private final Object[] bucket;

    MyHashSetIterator(final Object[] bucket) {
        this.bucket = bucket;
        findNext();
    }

    private void findNext() {
        for (int i = current; i < bucket.length; i++) {
            if (bucket[i] != null) {
                current = i;
                return;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return bucket[current] != null;
    }

    @Override
    public E next() {
        final Object rc = bucket[current];
        current++;
        findNext();
        return (E) rc;
    }
}
