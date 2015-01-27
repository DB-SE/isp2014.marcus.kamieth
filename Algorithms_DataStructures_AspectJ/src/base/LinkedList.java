package base;

public class LinkedList<E> extends List<E>{
	private java.util.LinkedList<E> data;
	@Override
	public E get(int index) {
		return data.get(index);
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public void insert(E item) {
		data.add(item);
	}

	@Override
	public void swap(int i, int j) {
		E tmp = data.get(i);
		data.set(i, data.get(j));
		data.set(j, tmp);
		
	}
	
}