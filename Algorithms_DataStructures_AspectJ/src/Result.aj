import base.*;

public aspect Result {
	public static <E> void Output.printArray(List<E> arr){
		System.out.print("{ ");
		if(arr.size() > 0){
			for(int i=0; i<arr.size() - 1; ++i){
				System.out.print(arr.get(i) + ", ");
			}
			System.out.print(arr.get(arr.size() -1));
		}
		System.out.println("}");
	}
	public static void Output.printText(String text){
		System.out.print(text);
	}
	
	Integer around(List<Object> a, Object b) : call(* LinearSearch.linearSearch(..))
		&& args(a,b) {
		System.out.println("Array for LinearSearch");
		Output.printArray(a);
		Output.printText("Needle=" + b + "\n");	
		Integer result = proceed(a,b);
		if(result == null){
			System.out.println("Needle wasn't in list");
		} else {
			System.out.println("Needle found at index " + result);
		}
		return result;
	}
	
	void around(List<Object> arr) : call(* Sort.quickSort(..)) && args(arr) {
		System.out.println("Array before QuickSort:");
		Output.printArray(arr);
		proceed(arr);
		System.out.println("Array after QuickSort:");
		Output.printArray(arr);
	}
	
	void around(List<Object> arr) : call(* Sort.bubbleSort(..)) && args(arr) {
		System.out.println("Array before BubbleSort:");
		Output.printArray(arr);
		proceed(arr);
		System.out.println("Array after BubbleSort:");
		Output.printArray(arr);
	}
}
