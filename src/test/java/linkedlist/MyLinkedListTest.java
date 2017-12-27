package linkedlist;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class MyLinkedListTest {

    @Test
    public void addWorks() {
        final List<Integer> sut = sut();

        final boolean rc = sut.add(1);

        assertThat(rc, is(true));
    }

    @Test
    public void iteratorWorks() {
        final List<Integer> sut = sut();
        sut.add(1);
        sut.add(1);

        final Iterator<Integer> actual = sut.iterator();

        Assert.assertThat(actual.hasNext(), is(true));
        Assert.assertThat(actual.next(), is(1));
        Assert.assertThat(actual.hasNext(), is(true));
        Assert.assertThat(actual.next(), is(1));
    }

    private static <T> List<T> sut() {
        return new MyLinkedList<>();
    }
}