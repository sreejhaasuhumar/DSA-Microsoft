package Microsoft;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Date 02/11/2016
 * @author Tushar Roy
 *
 * Reference
 * https://leetcode.com/problems/lru-cache/
 */


class LRUCache {
	public static void main(String[] args) {
		LRUCache lRUCache = new LRUCache(2);
		lRUCache.put(1, 1);
		lRUCache.put(2, 2); // cache is {1=1, 2=2}
		lRUCache.get(1);    // return 1
		lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
		lRUCache.get(2);    // returns -1 (not found)
		lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
		lRUCache.get(1);    // return -1 (not found)
		lRUCache.get(3);    // return 3
		lRUCache.get(4);    // return 4
	}
    Map<Integer, Integer> cache;
	int capacity;

    LRUCache(int capacity) {
        this.cache = new LinkedHashMap<Integer, Integer>(capacity);
		this.capacity = capacity;
    }
    
	int get(int key) {

		if (!cache.containsKey(key)) {
            
			return -1;
		}

		int val = cache.remove(key);
		cache.put(key, val);

		return val;
	}
    
	void put(int key, int value) {

		if (cache.containsKey(key)) {

			cache.remove(key);
		} else if (cache.size() == capacity) {

			int firstKey = cache.keySet().iterator().next();
			cache.remove(firstKey);
		}

		cache.put(key, value);
	}
}