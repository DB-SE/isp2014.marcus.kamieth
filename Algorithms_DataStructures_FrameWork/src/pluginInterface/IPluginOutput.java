package pluginInterface;

import java.util.List;

public interface IPluginOutput {
	/**
	 * method for standard output
	 * @param message String to be processed
	 */
	public void write(String message);
	/**
	 * method for extended output
	 * @param comment String to be processed
	 */
	public void explain(String comment);
	/**
	 * method for list to string converting
	 * @param list list of any-type elements
	 * @return string representation of given list
	 */
	public String buildList(List list);
}
