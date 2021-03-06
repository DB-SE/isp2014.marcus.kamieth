import base.List;
public aspect AQuickSort {
	//based on http://www.java-uni.de/index.php?Seite=86
		public static <T extends Comparable<T>> void Sort.quickSort(List<T> input){
			 Sort.qSort(input, 0, input.size() - 1);
		}
		private static <T extends Comparable<T>> void Sort.qSort(List<T> list, int left, int right){
			if(left < right){
				int i = Sort.partition(list, left, right);
				Sort.qSort(list, left, i-1);
				Sort.qSort(list, i+1, right);
			}
		}
		
		public static <T extends Comparable<T>> int Sort.partition(List<T> list, int left, int right) {
			int i, j;
			T pivot;
			pivot = list.get(right);
			i = left;
			j = right - 1;
			
			//Output.printComment("Left["+left+"]:"+list[left]+" , Right/Pivot["+right+"]:"+pivot+"\n");
			Sort.runLoop(i,j,list,pivot);
			// swap list[i] and list[right]
			list.swap(i,right);
			//Output.printComment("After swapping: partition ["+i+"] "+ list[i]+"\n");
			//Output.printArrayComment(list);
			return i;
		}
		
		public static <T extends Comparable<T>> void Sort.runLoop(int i, int j, List<T> list, T pivot){
			while (i <= j) {
				if ((list.get(i)).compareTo(pivot) > 0) {// list[i] > pivot
					// swap list[i] and list[j]
					list.swap(i,j);
					j--;
				} else {
					i++;
				}
			}
		}
}
