package plugins;

import java.util.List;

import pluginInterface.IPluginOutput;
import pluginInterface.ISortAlgorithm;

public class QuickSort<E extends Comparable<E>>  implements ISortAlgorithm<E>{
	private IPluginOutput out;
	
	public List<E> sortAlgorithm(List<E> inputList) {
		qSort(inputList, 0, inputList.size() - 1);
		return inputList;
	}
	//based on http://www.java-uni.de/index.php?Seite=86
		public void quickSort(List<E> input){
			 
		}
		private void qSort(List<E> list, int left, int right){
			if(left < right){
				int i = partition(list, left, right);
				qSort(list, left, i-1);
				qSort(list, i+1, right);
			}
		}
		
		private int partition(List<E> list, int left, int right) {
			int i, j;
			E pivot, tmp;
			pivot = list.get(right);
			i = left;
			j = right - 1;
			out.explain("Left[" + left + "]:" + list.get(left) + " , Right/Pivot[" + right + "]:" + pivot + "\n");
			
			while (i <= j) {
				if (list.get(i).compareTo(pivot) > 0) {// list[i] > pivot
					// swap list[i] and list[j]
					tmp = list.get(i);
					list.set(i, list.get(j) );
					list.set(j, tmp);
					j--;
				} else {
					i++;
				}
			}
			// swap list[i] and list[right]
			tmp = list.get(i);;
			list.set(i, list.get(right));
			list.set(right, tmp);
			out.explain("After swapping: partition [" + i + "] " + list.get(i) + "\n");
			out.explain(out.buildList(list));
			return i;
		}
	public void setPluginOutput(IPluginOutput out) {
		this.out = out;
	}
	
	public boolean getWithComments(){
		return false;
	}

}
