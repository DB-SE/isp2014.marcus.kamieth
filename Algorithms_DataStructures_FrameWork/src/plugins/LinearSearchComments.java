package plugins;

import java.util.List;

import pluginInterface.IPluginOutput;
import pluginInterface.ISearchAlgorithm;

public class LinearSearchComments<E> implements ISearchAlgorithm<E> {
	private IPluginOutput out;
	
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
	
	public boolean getWithComments(){
		return true;
	}

}
