import base.*;

public aspect AInteger {
	public static Integer ValueGenerator.getNewInt(){
		return new Integer((int)(Math.random()*100));
	}
	
	public static List<Integer> ValueGenerator.getNewIntArray(){
		int size = (int)(Math.random()*20 +1);
		List<Integer> arr = new Array<Integer>(size);
		for(int i=0; i<size;++i){
			arr.insert(ValueGenerator.getNewInt());
		}
		return arr;
	}
	//------MAIN
//	public Main.new(){
//		linearSearchExampleInt();
//		bubbleSortExampleInt();
//		quickSortExampleInt();
//	}
	public void Main.linearSearchExampleInt(){
		List<Integer> intarray = ValueGenerator.getNewIntArray();
		Integer needle = ValueGenerator.getNewInt();
		LinearSearch<Integer> searchint = new LinearSearch<Integer>();
		searchint.linearSearch(intarray, needle);
	}
	
	public void Main.bubbleSortExampleInt(){
		List<Integer> intarray = ValueGenerator.getNewIntArray();
		//Output.printArray(intarray);
		Sort.bubbleSort(intarray);
		//Output.printArray(intarray);
	}
	
	public void Main.quickSortExampleInt(){
		List<Integer> intarray = ValueGenerator.getNewIntArray();
		//Output.printArray(intarray);
		Sort.quickSort(intarray);
		//Output.printArray(intarray);
	}
	
	after(Main main) : execution(Main.new()) && this(main){
		main.linearSearchExampleInt();
		main.bubbleSortExampleInt();
		main.quickSortExampleInt();
	}
}
