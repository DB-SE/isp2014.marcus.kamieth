package pluginInterface;

import java.util.List;

public interface IListGenerator<E> {
	/**
	 * generate a list for algorithm input
	 * @return this list
	 */
	public List<E> getList();
	/**
	 * specify a needle to search for using a search algorithm
	 * not needed when only implementing sorting
	 * @return needle in IListGenerator.getList() (or maybe not)
	 */
	public E getNeedle();
}
