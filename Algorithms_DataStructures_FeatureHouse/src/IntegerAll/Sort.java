public   class  Sort {
	

	public static <T extends Comparable<T>> void bubbleSort  (T[] input){
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

	
	
	//based on http://www.java-uni.de/index.php?Seite=86
	public static <T extends Comparable<T>> void quickSort  (T[] input){
		 qSort(input, 0, input.length - 1);
	}

	
	private static <T extends Comparable<T>> void qSort(T[] list, int left, int right){
		if(left < right){
			int i = partition(list, left, right);
			qSort(list, left, i-1);
			qSort(list, i+1, right);
		}
	}

	
	
	private static <T extends Comparable<T>> int partition(T[] list, int left, int right) {
		int i, j;
		T pivot, tmp;
		pivot = list[right];
		i = left;
		j = right - 1;
		
		Output.printComment("Left["+left+"]:"+list[left]+" , Right/Pivot["+right+"]:"+pivot+"\n");
		while (i <= j) {
			if (list[i].compareTo(pivot) > 0) {// list[i] > pivot
				// swap list[i] and list[j]
				tmp = list[i];
				list[i] = list[j];
				list[j] = tmp;
				j--;
			} else {
				i++;
			}
		}
		// swap list[i] and list[right]
		tmp = list[i];
		list[i] = list[right];
		list[right] = tmp;
		Output.printComment("After swapping: partition ["+i+"] "+ list[i]+"\n");
		Output.printArrayComment(list);
		return i;
	}


}
