package algo.problem.cache;

import java.util.LinkedList;
import java.util.Queue;

public class LRUCachingPolicy implements CachingPolicy {

	Queue<String> allKeys = new LinkedList<>();
	private static final int DEFAULT_CACHE_SIZE = 10;

	int size = DEFAULT_CACHE_SIZE;

	public String add(String key) {
		allKeys.add(key);
		if (allKeys.size() > size) {
			return allKeys.remove();
		}
		return null;

	}

	/**
	 * This method will update the key usage
	 * 
	 * @param key
	 */
	public void keyUsed(String key) {
		allKeys.remove(key);
		allKeys.add(key);

	}

	public void setSize(int initialSize) {
		this.size = initialSize;
	}
}
