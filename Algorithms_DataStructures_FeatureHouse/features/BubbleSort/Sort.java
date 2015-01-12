public class Sort {

	public static <T extends Comparable<T>> void bubbleSort(T[] input){
		int n = input.length;
		while (n > 1){
			int n_new = 1; //swapped = false
			for(int i=0; i<n-1;++i){
				Output.printComment("Iteration "+n+": "+input[i].toString()+" > "+ input[i+1].toString() + "?\n");
				if( input[i].compareTo(input[i+1]) > 0){
					T tmp = input[i];
					input[i] = input[i+1];
					input[i+1] = tmp;
					n_new = i + 1;
					Output.printComment("Swap!:");
					Output.printArrayComment(input);
					
				}
			}
			n = n_new;
		}
	}
}
