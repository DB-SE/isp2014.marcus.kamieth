import base.Output;
import base.*;

public aspect Comments {
	boolean around(Object a, Object b) : execution(public boolean LinearSearch.equalsNeedle(Object, Object))
	&& args(a,b) {
		boolean eq = proceed(a,b); 
		if(!eq){
			System.out.println("Test " + a + " != " + b );
		} else {
			System.out.println("blub");
		}
		return eq;
	}
	
	int around(List<Object> list, int left, int right) : execution(int Sort.partition(List<Object>, int, int))
	&& args(list, left, right){
		System.out.println("Left["+left+"]:"+list.get(left)+" , Right/Pivot["+right+"]:"+list.get(right)+"\n");
		int i = proceed(list, left, right);
		System.out.println("After swapping: partition ["+i+"] "+ list.get(i)+"\n");
		Output.printArray(list);
		return i;
	}
}
