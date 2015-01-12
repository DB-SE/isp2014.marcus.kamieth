public class Main {
	
	public Main(){
		linearSearchExampleStr();
		bubbleSortExampleStr();
		quickSortExampleStr();
	}
	
	public void linearSearchExampleStr(){
		String[] strarray = ValueGenerator.getNewStringArray();
		String needle = ValueGenerator.getNewString();
		Output.printArray(strarray);
		Output.printText("Needle=" + needle);
		LinearSearch<String> searchstr = new LinearSearch<String>();
		searchstr.linearSearch(strarray, needle);
	}
	
	public void bubbleSortExampleStr(){
		String[] strarray = ValueGenerator.getNewStringArray();
		Output.printArray(strarray);
		Sort.bubbleSort(strarray);
		Output.printArray(strarray);
	}
	
	public void quickSortExampleStr(){
		String[] strarray = ValueGenerator.getNewStringArray();
		Output.printArray(strarray);
		Sort.quickSort(strarray);
		Output.printArray(strarray);
	}
}
