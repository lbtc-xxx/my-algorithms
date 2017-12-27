package linkedlist;

class MutableNode<E> implements MyNode<E> {

    MyNode<E> next;
    E value;

    public MutableNode() {
    }

    @Override
    public MyNode<E> next() {
        return next;
    }

    @Override
    public E value() {
        return value;
    }
}
