import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> cache;

    public LRUCache(int size) {
        capacity = size;
        cache = new LinkedHashMap<Integer, Integer>(size, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void set(int key, int value) {
        cache.put(key, value);
    }
}

public class Main1 {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);

        lruCache.set(1, 1);
        lruCache.set(2, 2);

        System.out.println(lruCache.get(1)); // Output: 1
        lruCache.set(3, 3); // Removes the least recently used key (2)
        System.out.println(lruCache.get(2)); // Output: -1
        lruCache.set(4, 4); // Removes the least recently used key (1)
        System.out.println(lruCache.get(1)); // Output: -1
        System.out.println(lruCache.get(3)); // Output: 3
        System.out.println(lruCache.get(4)); // Output: 4
    }
}