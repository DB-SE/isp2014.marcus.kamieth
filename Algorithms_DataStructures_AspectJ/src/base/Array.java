import java.util.ArrayList;
import base.List;
//unused / not implemented, generic arrays are not supported this way!
//for demonstration purpose
public class Array<E> extends List<E> {

	//private E[] data;
	private ArrayList<E> data;
	
	public Array(int size){
		//data = new E[size]; //doesn't work
		data = new ArrayList<E>(size);
	}
	public int size(){
		return data.size();
	}
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return data.get(index);
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