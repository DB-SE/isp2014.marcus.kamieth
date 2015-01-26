
public aspect AQuickSort {
	//based on http://www.java-uni.de/index.php?Seite=86
		public static <T extends Comparable<T>> void ASort.quickSort(T[] input){
			 ASort.qSort(input, 0, input.length - 1);
		}
		private static <T extends Comparable<T>> void ASort.qSort(T[] list, int left, int right){
			if(left < right){
				int i = ASort.partition(list, left, right);
				ASort.qSort(list, left, i-1);
				ASort.qSort(list, i+1, right);
			}
		}
		
		public static <T extends Comparable<T>> int ASort.partition(T[] list, int left, int right) {
			int i, j;
			T pivot, tmp;
			pivot = list[right];
			i = left;
			j = right - 1;
			
			//Output.printComment("Left["+left+"]:"+list[left]+" , Right/Pivot["+right+"]:"+pivot+"\n");
			ASort.runLoop(i,j,list,pivot);
			// swap list[i] and list[right]
			tmp = list[i];
			list[i] = list[right];
			list[right] = tmp;
			//Output.printComment("After swapping: partition ["+i+"] "+ list[i]+"\n");
			//Output.printArrayComment(list);
			return i;
		}
		
		public static <T extends Comparable<T>> void ASort.runLoop(int i, int j, T[] list, T pivot){
			while (i <= j) {
				if (list[i].compareTo(pivot) > 0) {// list[i] > pivot
					// swap list[i] and list[j]
					T tmp = list[i];
					list[i] = list[j];
					list[j] = tmp;
					j--;
				} else {
					i++;
				}
			}
		}
}
