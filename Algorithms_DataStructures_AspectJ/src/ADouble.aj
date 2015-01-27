import base.*;


public aspect ADouble {
	public static double ValueGenerator.getNewDouble(){
		return Math.random()*100;
	}
	public static List<Double> ValueGenerator.getNewDoubleArray(){
		int size = (int)(Math.random()*20 +1);
		List<Double> arr = new Array<Double>(size);
		for(int i=0; i<size;++i){
			arr.insert(ValueGenerator.getNewDouble());
		}
		return arr;
	}

	public void Main.linearSearchExampleDbl(){
		List<Double> dblarray = ValueGenerator.getNewDoubleArray();
		Double needle = ValueGenerator.getNewDouble();
		//Output.printArray(dblarray);
		//Output.printText("Needle=" + needle);
		LinearSearch<Double> searchdbl = new LinearSearch<Double>();
		searchdbl.linearSearch(dblarray, needle);
	}
	
	public void Main.bubbleSortExampleDbl(){
		List<Double> dblarray = ValueGenerator.getNewDoubleArray();
		//Output.printArray(dblarray);
		Sort.bubbleSort(dblarray);
		//Output.printArray(dblarray);
	}
	
	public void Main.quickSortExampleDbl(){
		List<Double> dblarray = ValueGenerator.getNewDoubleArray();
		//Output.printArray(dblarray);
		Sort.quickSort(dblarray);
		//Output.printArray(dblarray);
	}
	after(Main main) : execution(Main.new()) && this(main){
		main.linearSearchExampleDbl();
		main.bubbleSortExampleDbl();
		main.quickSortExampleDbl();
	}
}
