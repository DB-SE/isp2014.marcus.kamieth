public class Main {
	
	
	public static void main(String[] args){
		//#if Search || Sort
		Integer[] intarray = null;
		Double[] dblarray = null;
		String[] strarray = null;
		//#endif
		//#if LinearSearch
		linearSearchExample(intarray, dblarray, strarray);
		//#endif
		//#if BubbleSort
		bubbleSortExample(intarray, dblarray, strarray);
		//#endif
		//#if QuickSort
		quickSortExample(intarray, dblarray, strarray);
		//#endif
		
	}
	public static void linearSearchExample(Integer[] intarray, Double[] dblarray, String[] strarray){
		//#if Integer
		intarray = ValueGenerator.getNewIntArray();
			//#if Comments
			Output.printArray(intarray);
			//#endif
		int needle = ValueGenerator.getNewInt();
			//#if Comments
			System.out.println("Needle=" + needle);
			//#endif
		LinearSearch<Integer> searchint = new LinearSearch<Integer>();
		searchint.linearSearch(intarray, needle);
		//#endif
		
		//#if Double
		dblarray = ValueGenerator.getNewDoubleArray();
			//#if Comments
			Output.printArray(dblarray);
			//#endif
		double dblneedle = ValueGenerator.getNewDouble();
			//#if Comments
			System.out.println("Needle=" + dblneedle);
			//#endif
		LinearSearch<Double> searchdbl = new LinearSearch<Double>();
		searchdbl.linearSearch(dblarray, dblneedle);
		//#endif
		
		//#if String
		strarray = ValueGenerator.getNewStringArray();
			//#if Comments
			Output.printArray(strarray);
			//#endif
		String strneedle = ValueGenerator.getNewString();
			//#if Comments
			System.out.println("Needle=" + strneedle);
			//#endif
		LinearSearch<String> searchstr = new LinearSearch<String>();
		searchstr.linearSearch(strarray, strneedle);
		//#endif
	}
	public static void bubbleSortExample(Integer[] intarray, Double[] dblarray, String[] strarray){
		//#if Integer
			intarray = ValueGenerator.getNewIntArray();
				Output.printArray(intarray);
			Sort.bubbleSort(intarray);
				Output.printArray(intarray);
		//#endif
		
		//#if Double
			dblarray = ValueGenerator.getNewDoubleArray();
				Output.printArray(dblarray);
			Sort.bubbleSort(dblarray);
				Output.printArray(dblarray);
		//#endif
		
		//#if String
			strarray = ValueGenerator.getNewStringArray();
				Output.printArray(strarray);
			Sort.bubbleSort(strarray);
				Output.printArray(strarray);
		//#endif
	}
	public static void quickSortExample(Integer[] intarray, Double[] dblarray, String[] strarray){
		//#if Integer
			intarray = ValueGenerator.getNewIntArray();
				Output.printArray(intarray);
			Sort.quickSort(intarray);
				Output.printArray(intarray);
		//#endif
		
		//#if Double
			dblarray = ValueGenerator.getNewDoubleArray();
				Output.printArray(dblarray);
			Sort.quickSort(dblarray);
				Output.printArray(dblarray);
		//#endif
		
		//#if String
			strarray = ValueGenerator.getNewStringArray();
				Output.printArray(strarray);
			Sort.quickSort(strarray);
				Output.printArray(strarray);
		//#endif
	}
}
