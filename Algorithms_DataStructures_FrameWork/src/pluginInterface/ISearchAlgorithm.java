package pluginInterface;

import java.util.List;

public interface ISearchAlgorithm<E> {
	/**
	 * implementation of search algorithm of this plugin
	 * @param haystack underlying list
	 * @param needle element to search for
	 * @return index of needle in haystack
	 */
	public Integer searchAlgorithm(List<E> haystack, E needle);
	/**
	 * used for sending output messages to the application output
	 * store out in implementing class and call included methods
	 * @param out reference to application output - save and use
	 */
	public void setPluginOutput(IPluginOutput out);
	/**
	 * used for specifying one of two IPluginOutput implementations 
	 * @return true for full output, false for limited output without explain()
	 */
	public boolean getWithComments();
}
