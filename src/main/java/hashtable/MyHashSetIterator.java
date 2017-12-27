package hashtable;

import java.util.Iterator;

public class MyHashSetIterator<E> implements Iterator<E> {

    private int currentBucketIndex = -1;
    private Iterator<E> currentIterator;
    private final Iterable[] bucket;

    MyHashSetIterator(final Iterable[] bucket) {
        this.bucket = bucket;
        findNextIterator();
    }

    private void findNextIterator() {
        currentBucketIndex++;

        for (int i = currentBucketIndex; i < bucket.length; i++) {
            if (bucket[i] != null) {
                currentIterator = (Iterator<E>) bucket[i].iterator();
                currentBucketIndex = i;
                return;
            }
        }

        currentIterator = null;
    }

    @Override
    public boolean hasNext() {
        if (currentIterator == null) {
            return false;
        }

        if (currentIterator.hasNext()) {
            return true;
        }

        findNextIterator();
        return this.hasNext();
    }

    @Override
    public E next() {
        return currentIterator.next();
    }
}
