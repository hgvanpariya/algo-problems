package algo.problem.cache;

public interface CachingPolicy {

	String add(String key);

	/**
	 * This method will update the key usage
	 * @param key
	 */
	void keyUsed(String key);

	void setSize(int initialSize);

}
