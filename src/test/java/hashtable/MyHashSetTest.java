package hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.Set;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MyHashSetTest {

    private Set<Integer> sut;

    @Before
    public void setUp() throws Exception {
        sut = new MyHashSet<>();
    }

    @Test
    public void addWorks() {
        final boolean rc = sut.add(1);

        assertThat(rc, is(true));
        assertThat(sut.contains(1), is(true));
    }

    @Test
    public void containsReturnsFalseIfSutDoesNotContainTheValue() {
        assertThat(sut.contains(1), is(false));
    }

    @Test
    public void iteratorWorks() {
        sut.add(1);
        sut.add(2);

        final Iterator<Integer> actual = sut.iterator();

        assertThat(actual.hasNext(), is(true));
        assertThat(actual.next(), is(1));
        assertThat(actual.hasNext(), is(true));
        assertThat(actual.next(), is(2));
    }

    @Test
    public void addingTheSameValueDoesNotMakeSideEffect() {
        sut.add(1);
        final boolean rc = sut.add(1);

        assertThat(rc, is(false));
    }

    @Test
    public void worksCorrectlyWithSameHashCode() {
        final Set<SomeFakeObjectReturnsFixedHashCode> sut2 = new MyHashSet<>();
        final SomeFakeObjectReturnsFixedHashCode obj1 = new SomeFakeObjectReturnsFixedHashCode(10);
        final SomeFakeObjectReturnsFixedHashCode obj2 = new SomeFakeObjectReturnsFixedHashCode(10);

        assertThat(sut2.add(obj1), is(true));
        assertThat(sut2.add(obj2), is(true));

        final Iterator<SomeFakeObjectReturnsFixedHashCode> actual = sut2.iterator();
        assertThat(actual.hasNext(), is(true));
        assertThat(actual.next(), is(obj1));
        assertThat(actual.hasNext(), is(true));
        assertThat(actual.next(), is(obj2));
    }
}
