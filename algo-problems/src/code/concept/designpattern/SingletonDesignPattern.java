package code.concept.designpattern;

/**
 * This is singleton design pattern which will help to create the object of the
 * class only once.
 * 
 * @author harikrushna
 *
 */
public class SingletonDesignPattern {

	private static SingletonDesignPattern singletonDesignPattern;

	/**
	 * Private construction with the exception to avoid creating the object
	 * using Java Reflection .
	 */
	private SingletonDesignPattern() {
		if (singletonDesignPattern != null) {
			throw new IllegalStateException("Unable to create already created object.");
		}
	}

	/**
	 * Get the object of the singleton instance.
	 * 
	 * @return object of {@link SingletonDesignPattern}.
	 */
	public SingletonDesignPattern getInstance() {
		if (singletonDesignPattern == null) {
			synchronized (SingletonDesignPattern.class) {
				if (singletonDesignPattern == null) {
					singletonDesignPattern = new SingletonDesignPattern();
				}

			}
		}

		return singletonDesignPattern;
	}
}
