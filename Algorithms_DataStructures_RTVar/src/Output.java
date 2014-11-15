public class Output {
	/**
	 * method for printing various arrays to console output
	 * @param arr array of type E to be printed out
	 */
	public static <E> void printArray(E[] arr){
		System.out.print("{ ");
		for(int i=0; i<arr.length - 1; ++i){
			System.out.print(arr[i] + ", ");
		}
		System.out.println(arr[arr.length -1]+ " }");
	}
}