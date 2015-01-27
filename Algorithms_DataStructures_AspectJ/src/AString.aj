import base.*;

public aspect AString {
	private static String[] ValueGenerator.values = {
		"elephant","giraffe","monkey","cheetah","dog","cat","tiger",
		"mouse","tortoise","shark","whale","salmon","deer","wolf",
		"grizzlybear","fox","snake","worm","fly","bee","hornet"
	};
	public static List<String> ValueGenerator.getNewStringArray(){
		int size = (int)(Math.random()*20 +1);
		List<String> arr = new Array<String>(size);
		for(int i=0; i<size;++i){
			arr.insert( getNewString() );
		}
		return arr;
	}

	public static String ValueGenerator.getNewString(){
		int index = (int)(Math.random()*ValueGenerator.values.length);
		return ValueGenerator.values[index];
	}
	
	
	
	
	public void Main.linearSearchExampleStr(){
		List<String> strarray = ValueGenerator.getNewStringArray();
		String needle = ValueGenerator.getNewString();
		//Output.printArray(strarray);
		//Output.printText("Needle=" + needle);
		LinearSearch<String> searchstr = new LinearSearch<String>();
		searchstr.linearSearch(strarray, needle);
	}
	
	public void Main.bubbleSortExampleStr(){
		List<String> strarray = ValueGenerator.getNewStringArray();
		//Output.printArray(strarray);
		Sort.bubbleSort(strarray);
		//Output.printArray(strarray);
	}
	
	public void Main.quickSortExampleStr(){
		List<String> strarray = ValueGenerator.getNewStringArray();
		//Output.printArray(strarray);
		Sort.quickSort(strarray);
		//Output.printArray(strarray);
	}
	
	after(Main main) : execution(Main.new()) && this(main) {
		main.linearSearchExampleStr();
		main.bubbleSortExampleStr();
		main.quickSortExampleStr();
	}
}
