package pluginInterface;

import java.util.List;

public interface ISortAlgorithm<E> {
	/**
	 * implementation of sort algorithm of this plugin
	 * @param inputList
	 * @return sorted list
	 */
	public List<E> sortAlgorithm(List<E> inputList);
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
