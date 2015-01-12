public   class  Output {
	
	public static <E> void printArray(E[] arr){
		System.out.print("{ ");
		for(int i=0; i<arr.length - 1; ++i){
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length -1]+ " }");
	}

	
	public static void printText(String text){
		System.out.print(text);
	}

	
	public static void printComment  (String text){
		System.out.print(text);
	}

	
	public static <E> void printArrayComment  (E[] array){
		Output.printArray(array);
	}


}
