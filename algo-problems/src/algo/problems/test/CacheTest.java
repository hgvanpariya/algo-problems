package algo.problems.test;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import algo.problem.cache.Cache;
import algo.problem.cache.CachingPolicy;
import algo.problem.cache.LRUCachingPolicy;


public class CacheTest {

	Cache cache ;
	@Before
	public void setup() {
		CachingPolicy lruCachingPolicy = new LRUCachingPolicy();
		cache = new Cache(lruCachingPolicy,3);
	}
	
	@Test
	public void firstTest(){
		cache.add("a", "value of a");
		cache.add("b", "value of b");
		cache.add("c", "value of c");
		assertTrue(cache.get("a").equals("value of a"));
	}
	
	@Test(expected = RuntimeException.class)
	public void cacheMiss(){
		cache.add("a", "value of a");
		cache.add("b", "value of b");
		cache.add("c", "value of c");
		cache.add("d", "value of d");
		cache.get("a");
	}
	
	@Test
	public void cacheMissAfterUsedElement(){
		cache.add("a", "value of a");
		cache.add("b", "value of b");
		cache.add("c", "value of c");
		cache.get("a");
		cache.add("d", "value of d");
		assertTrue(cache.get("a").equals("value of a"));
	}
	
	@Test(expected = RuntimeException.class)
	public void removedLruElemnt(){
		cache.add("a", "value of a");
		cache.add("b", "value of b");
		cache.add("c", "adasda");
		cache.get("a");
		cache.add("d", "adasda");
		cache.get("b");
	}
}

