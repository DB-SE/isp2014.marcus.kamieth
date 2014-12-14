package framework;
import java.util.List;
public class Output {
	/**
	 * method for printing various lists to console output
	 * @param list list of type E to be printed
	 */	
	public static <E> void printList(List<E> list){
		System.out.println(buildList(list));
	}
	
	/**
	 * method for printing various lists to console output
	 * @param list list of type E to be printed
	 * @return String to be output later
	 */	
	public static <E> String buildList(List<E> list){
		StringBuilder sb = new StringBuilder("{");
		for(int i=0; i<list.size() - 1; ++i){
			sb.append(list.get(i) + ", ");
		}
		if(list.size()!=0){
			sb.append(list.get(list.size()-1));
		}
		sb.append(" }");
		return sb.toString();
	}
}