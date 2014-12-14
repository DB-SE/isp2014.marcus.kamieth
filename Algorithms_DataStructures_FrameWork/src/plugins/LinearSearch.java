package plugins;

import java.util.List;

import pluginInterface.IPluginOutput;
import pluginInterface.ISearchAlgorithm;

public class LinearSearch<E> implements ISearchAlgorithm<E> {
	private IPluginOutput out;
	private boolean withComments;
	
	public Integer searchAlgorithm(List<E> haystack, E needle) {
		for (int i=0; i<haystack.size();++i){
			if(needle.equals(haystack.get(i))){
				out.write("Value " + haystack.get(i).toString() + " found at index " + i + "\n");
				return i;
			}
			else {
				out.explain("Value " + needle.toString() + " != array value " + haystack.get(i).toString() + "\n");
			}
		}
		out.write("Value not in list.\n");
		return null;
	}

	public void setPluginOutput(IPluginOutput out) {
		this.out = out;
	}
	
	public void setWithComments(boolean withComments){
		this.withComments = withComments;
	}
	
	public boolean getWithComments(){
		return withComments;
	}

}
