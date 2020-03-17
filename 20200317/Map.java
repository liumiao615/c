public interface Map<K, V> {
    V get(K key);

    V put(K key, V value);
}
