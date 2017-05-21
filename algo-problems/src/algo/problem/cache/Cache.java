package algo.problem.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	private CachingPolicy cachingPolicy;

	private Map<String, Object> storage;
	private static final int DEFAULT_CACHE_SIZE = 10;

	public Cache(CachingPolicy cachingPolicy) {
		super();
		storage = new ConcurrentHashMap<>();
		this.cachingPolicy = cachingPolicy;
		this.cachingPolicy.setSize(DEFAULT_CACHE_SIZE);

	}

	public Cache(CachingPolicy cachingPolicy, int initialSize) {
		super();
		storage = new ConcurrentHashMap<>(initialSize);
		this.cachingPolicy = cachingPolicy;
		this.cachingPolicy.setSize(initialSize);
	}

	public void add(String key, Object value) {

		if (!storage.containsKey(key)) {
			storage.put(key, value);
			String keyToRemove = cachingPolicy.add(key);
			// If the Cache will be full it has to be removed from the storage
			// as well.
			if (keyToRemove != null) {
				storage.remove(keyToRemove);
			}
		}
	}

	public Object get(String key) {
		if (storage.containsKey(key)) {
			cachingPolicy.keyUsed(key);
			return storage.get(key);
		} else {
			throw new RuntimeException("Error : " + key + " not found in the cache");
		}
	}

}
