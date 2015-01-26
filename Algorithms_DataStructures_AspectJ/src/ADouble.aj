import base.Main;


public aspect ADouble {
	public static double ValueGenerator.getNewDouble(){
		return Math.random()*100;
	}
	public static Double[] ValueGenerator.getNewDoubleArray(){
		int size = (int)(Math.random()*20 +1);
		Double[] arr = new Double[size];
		for(int i=0; i<size;++i){
			arr[i] = ValueGenerator.getNewDouble();
		}
		return arr;
	}

	public void Main.linearSearchExampleDbl(){
		Double[] dblarray = ValueGenerator.getNewDoubleArray();
		Double needle = ValueGenerator.getNewDouble();
		//Output.printArray(dblarray);
		//Output.printText("Needle=" + needle);
		LinearSearch<Double> searchdbl = new LinearSearch<Double>();
		searchdbl.linearSearch(dblarray, needle);
	}
	
	public void Main.bubbleSortExampleDbl(){
		Double[] dblarray = ValueGenerator.getNewDoubleArray();
		//Output.printArray(dblarray);
		Sort.bubbleSort(dblarray);
		//Output.printArray(dblarray);
	}
	
	public void Main.quickSortExampleDbl(){
		Double[] dblarray = ValueGenerator.getNewDoubleArray();
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
