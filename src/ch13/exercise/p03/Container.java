package ch13.exercise.p03;

public class Container<T, S> {
	
	private T t;
	private S s;
	
	public void set(T t, S s) {
		this.t = t;
		this.s = s;
	}
	
	public T getKey() {
		return t;
	}
	
	public S getValue() {
		return s;
	}

}
