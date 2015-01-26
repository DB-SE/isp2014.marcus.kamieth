import base.Output;


public aspect Result {
	public static <E> void Output.printArray(E[] arr){
		System.out.print("{ ");
		for(int i=0; i<arr.length - 1; ++i){
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length -1]+ " }");
	}
	public static void Output.printText(String text){
		System.out.print(text);
	}
	
	Integer around(Object[] a, Object b) : call(* ALinearSearch.linearSearch(..))
		&& args(a,b) {
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
}
