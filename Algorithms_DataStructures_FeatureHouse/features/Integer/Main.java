public class Main {
	
	public Main(){
		linearSearchExampleInt();
		bubbleSortExampleInt();
		quickSortExampleInt();
	}
	
	public void linearSearchExampleInt(){
		Integer[] intarray = ValueGenerator.getNewIntArray();
		Integer needle = ValueGenerator.getNewInt();
		LinearSearch<Integer> searchint = new LinearSearch<Integer>();
		searchint.linearSearch(intarray, needle);
	}
	
	public void bubbleSortExampleInt(){
		Integer[] intarray = ValueGenerator.getNewIntArray();
		Output.printArray(intarray);
		Sort.bubbleSort(intarray);
		Output.printArray(intarray);
	}
	
	public void quickSortExampleInt(){
		Integer[] intarray = ValueGenerator.getNewIntArray();
		Output.printArray(intarray);
		Sort.quickSort(intarray);
		Output.printArray(intarray);
	}
}
