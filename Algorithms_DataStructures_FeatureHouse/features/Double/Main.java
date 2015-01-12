public class Main {
	
	public Main(){
		linearSearchExampleDbl();
		bubbleSortExampleDbl();
		quickSortExampleDbl();
	}
	
	public void linearSearchExampleDbl(){
		Double[] dblarray = ValueGenerator.getNewDoubleArray();
		Double needle = ValueGenerator.getNewDouble();
		Output.printArray(dblarray);
		Output.printText("Needle=" + needle);
		LinearSearch<Double> searchdbl = new LinearSearch<Double>();
		searchdbl.linearSearch(dblarray, needle);
	}
	
	public void bubbleSortExampleDbl(){
		Double[] dblarray = ValueGenerator.getNewDoubleArray();
		Output.printArray(dblarray);
		Sort.bubbleSort(dblarray);
		Output.printArray(dblarray);
	}
	
	public void quickSortExampleDbl(){
		Double[] dblarray = ValueGenerator.getNewDoubleArray();
		Output.printArray(dblarray);
		Sort.quickSort(dblarray);
		Output.printArray(dblarray);
	}
}
