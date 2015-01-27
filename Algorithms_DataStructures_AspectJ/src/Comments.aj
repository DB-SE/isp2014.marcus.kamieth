import base.Output;


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
	
	int around(Object[] list, int left, int right) : execution(public int Sort.partition(Object[], int, int))
	&& args(list, left, right){
		System.out.println("Left["+left+"]:"+list[left]+" , Right/Pivot["+right+"]:"+list[right]+"\n");
		int i = proceed(list, left, right);
		System.out.println("After swapping: partition ["+i+"] "+ list[i]+"\n");
		Output.printArray(list);
		return i;
	}
}
