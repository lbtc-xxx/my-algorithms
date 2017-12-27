package hashtable;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashtable<K, V> implements Map<K, V> {

    private final int bucketSize;

    public MyHashtable(final int bucketSize) {
        this.bucketSize = bucketSize;
    }

    public int size() {
        return 0;
    }

    public boolean isEmpty() {
        return false;
    }

    public boolean containsKey(final Object key) {
        return false;
    }

    public boolean containsValue(final Object value) {
        return false;
    }

    public V get(final Object key) {
        return null;
    }

    public V put(final K key, final V value) {
        return null;
    }

    public V remove(final Object key) {
        return null;
    }

    public void putAll(final Map<? extends K, ? extends V> m) {

    }

    public void clear() {

    }

    public Set<K> keySet() {
        return null;
    }

    public Collection<V> values() {
        return null;
    }

    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
