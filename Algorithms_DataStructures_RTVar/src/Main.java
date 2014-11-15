import java.util.HashMap;
import java.util.Map;

public class Main {

	public static Map<String, Boolean> configuration;

	/**
	 * simulation program for algorithm flow various features can be given to
	 * this function
	 * 
	 * @param args
	 *            list of feature names Comments, Double, String, Integer,
	 *            BubbleSort, QuickSort, LinearSearch not yet implemented: Code,
	 *            all data structures except Array which is included if needed
	 */
	public static void main(String[] args) {
		configuration = new HashMap<String, Boolean>();
		/* check input configuration */
		String[] defs = { "Comments", "Double", "String", "Integer",
				"BubbleSort", "QuickSort", "LinearSearch" };

		// applicable features are set false per default
		for (String def : defs) {
			configuration.put(def, false);
		}

		// then input arguments are checked for correctness and updated in
		// configuration
		for (String arg : args) {
			if (configuration.containsKey(arg)) {
				configuration.put(arg, true);
			} else {
				System.err.println("invalid feature " + arg + "!");
			}
		}
		// last but not least dependent features used in the code are added
		if (configuration.containsKey("BubbleSort") || configuration.containsKey("QuickSort"))
			configuration.put("Sort", true);
		else configuration.put("Sort", false);
		if (configuration.containsKey("LinearSearch"))
			configuration.put("Search", true);
		else configuration.put("Search", false);

		//begin of actual program
		if (configuration.get("Search")
				|| configuration.get("Sort")) {
			Integer[] intarray = null;
			Double[] dblarray = null;
			String[] strarray = null;

			if (configuration.get("LinearSearch")) {
				linearSearchExample(intarray, dblarray, strarray);
			}
			if (configuration.get("BubbleSort")) {
				bubbleSortExample(intarray, dblarray, strarray);
			}
			if (configuration.get("QuickSort")) {
				quickSortExample(intarray, dblarray, strarray);
			}
		}
	}
	
	/**
	 * simulates the linear search algorithm on given sample data
	 * @param intarray integer sample data
	 * @param dblarray double sample data
	 * @param strarray string sample data
	 */
	public static void linearSearchExample(Integer[] intarray, Double[] dblarray, String[] strarray){
		if(configuration.get("Integer") || configuration.get("Double") || configuration.get("String")){
			System.out.println("LinearSearch:");
		}
			
		if (configuration.get("Integer")){
			intarray = ValueGenerator.getNewIntArray();
			if (configuration.get("Comments")){
				Output.printArray(intarray);
			}
			int needle = ValueGenerator.getNewInt();
			if (configuration.get("Comments")){
				System.out.println("Needle=" + needle);
			}
			LinearSearch<Integer> searchint = new LinearSearch<Integer>();
			searchint.linearSearch(intarray, needle);
		}
		
		if (configuration.get("Double")){
			dblarray = ValueGenerator.getNewDoubleArray();
			if (configuration.get("Comments")){
				Output.printArray(dblarray);
			}
			double dblneedle = ValueGenerator.getNewDouble();
			if (configuration.get("Comments")){
				System.out.println("Needle=" + dblneedle);
			}
			LinearSearch<Double> searchdbl = new LinearSearch<Double>();
			searchdbl.linearSearch(dblarray, dblneedle);
		}
		
		if (configuration.get("String")){
			strarray = ValueGenerator.getNewStringArray();
			if (configuration.get("Comments")){
				Output.printArray(strarray);
			}
			String strneedle = ValueGenerator.getNewString();
			if (configuration.get("Comments")){
				System.out.println("Needle=" + strneedle);
			}
			LinearSearch<String> searchstr = new LinearSearch<String>();
			searchstr.linearSearch(strarray, strneedle);
		}
	}
	/**
	 * simulates the bubblesort algorithm on given sample data
	 * @param intarray integer sample data
	 * @param dblarray double sample data
	 * @param strarray string sample data
	 * TODO strategy pattern
	 */
	public static void bubbleSortExample(Integer[] intarray, Double[] dblarray,
			String[] strarray) {
		if (configuration.get("Integer")){
			intarray = ValueGenerator.getNewIntArray();
			System.out.println();
			System.out.println("Sort integer array by bubbleSort:");
			Output.printArray(intarray);
			Sort.bubbleSort(intarray);
			Output.printArray(intarray);
		}

		if (configuration.get("Double")){
			dblarray = ValueGenerator.getNewDoubleArray();
			System.out.println();
			System.out.println("Sort double array by bubbleSort:");
			Output.printArray(dblarray);
			Sort.bubbleSort(dblarray);
			Output.printArray(dblarray);
		}

		if (configuration.get("String")){
			strarray = ValueGenerator.getNewStringArray();
			System.out.println();
			System.out.println("Sort string array by bubbleSort:");
			Output.printArray(strarray);
			Sort.bubbleSort(strarray);
			Output.printArray(strarray);
		}
	}
	/**
	 * simulates the quicksort algorithm on given sample data
	 * @param intarray integer sample data
	 * @param dblarray double sample data
	 * @param strarray string sample data
	 */
	public static void quickSortExample(Integer[] intarray, Double[] dblarray,
			String[] strarray) {
		if (configuration.get("Integer")){
			intarray = ValueGenerator.getNewIntArray();
			System.out.println();
			System.out.println("Sort integer array by quickSort:");
			Output.printArray(intarray);
			Sort.quickSort(intarray);
			Output.printArray(intarray);
		}

		if (configuration.get("Double")){
			dblarray = ValueGenerator.getNewDoubleArray();
			System.out.println();
			System.out.println("Sort double array by quickSort:");
			Output.printArray(dblarray);
			Sort.quickSort(dblarray);
			Output.printArray(dblarray);
		}

		if (configuration.get("String")){
			strarray = ValueGenerator.getNewStringArray();
			System.out.println();
			System.out.println("Sort string array by quickSort:");
			Output.printArray(strarray);
			Sort.quickSort(strarray);
			Output.printArray(strarray);
		}
	}
}
