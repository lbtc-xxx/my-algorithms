package linkedlist;

import java.util.Iterator;

class MyLinkedListIterator<E> implements Iterator<E> {

    private MyNode<E> nextNode;

    MyLinkedListIterator(final MyNode<E> node) {
        this.nextNode = node;
    }

    @Override
    public boolean hasNext() {
        return nextNode != null;
    }

    @Override
    public E next() {
        final E value = nextNode.value();
        nextNode = nextNode.next();
        return value;
    }
}
