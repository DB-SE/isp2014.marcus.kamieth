package base;
//super class for all list datatypes
public abstract class List<E> {
	
	public abstract E get(int index);
	public abstract int size();
	public abstract void insert(E item);
	public abstract void swap(int i, int j);
}