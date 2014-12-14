package plugins;

import java.util.ArrayList;
import java.util.List;

import pluginInterface.IPluginOutput;
import pluginInterface.ISortAlgorithm;

public class BubbleSort<E extends Comparable<E>> implements ISortAlgorithm<E> {
	private IPluginOutput out;

	public List<E> sortAlgorithm(List<E> inputList) {
		int n = inputList.size();
		while (n > 1){
			int n_new = 1; //swapped = false
			for(int i=0; i<n-1;++i){
				out.explain("Iteration " + n + ": " + inputList.get(i) + 
						" > " + inputList.get(i+1) + "?\n");
				if( inputList.get(i).compareTo(inputList.get(i+1)) > 0){
					E tmp = inputList.get(i);
					inputList.set(i, inputList.get(i+1));
					
					inputList.set(i+1, tmp);
					n_new = i + 1;
					out.explain("Swap!:" +
						out.buildList(inputList) + "\n"
					);
				}
			}
			n = n_new;
		}
		return inputList;
	}
	
	public void setPluginOutput(IPluginOutput out) {
		this.out = out;
	}
	
	public boolean getWithComments(){
		return false;
	}
}
