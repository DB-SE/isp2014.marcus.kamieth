public   class  Main {
	
	public static void main(String[] args){
		new Main();
	}

	
	
	public Main  (){
	
		linearSearchExampleInt();
		bubbleSortExampleInt();
		quickSortExampleInt();
	}

	
	
	public static void linearSearchExampleInt  (){
		Integer[] intarray = ValueGenerator.getNewIntArray();
		Integer needle = ValueGenerator.getNewInt();
		LinearSearch<Integer> searchint = new LinearSearch<Integer>();
		searchint.linearSearch(intarray, needle);
	}

	
	public static void linearSearchExampleDbl(){}

	
	public static void linearSearchExampleStr(){}

	
	
	public static void bubbleSortExampleInt  (){
		Integer[] intarray = ValueGenerator.getNewIntArray();
		Output.printArray(intarray);
		Sort.bubbleSort(intarray);
		Output.printArray(intarray);
	}

	
	public static void bubbleSortExampleDbl(){}

	
	public static void bubbleSortExampleStr(){}

	
	
	public static void quickSortExampleInt  (){
		Integer[] intarray = ValueGenerator.getNewIntArray();
		Output.printArray(intarray);
		Sort.quickSort(intarray);
		Output.printArray(intarray);
	}

	
	public static void quickSortExampleDbl(){}

	
	public static void quickSortExampleStr(){}


}
