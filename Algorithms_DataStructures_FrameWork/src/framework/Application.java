package framework;

import java.util.ArrayList;
import java.util.List;

import pluginInterface.*;

public class Application {
	private List<IListGenerator> listPlugins;
	private List<ISearchAlgorithm> searchAlgPlugins;
	private List<ISortAlgorithm> sortAlgPlugins;
	
	public Application(List<IListGenerator> lists, 
			List<ISearchAlgorithm> searchs,
			List<ISortAlgorithm> sorts){
		listPlugins = lists;
		searchAlgPlugins = searchs;
		sortAlgPlugins = sorts;
		
		for(IListGenerator list: lists){
			List elems = list.getList();
			Object needle = list.getNeedle(); //may be null
			
			for(ISearchAlgorithm search: searchs){
				System.out.println("---");
				System.out.println("Search by: " + search.getClass());
				if(search.getWithComments()){
					search.setPluginOutput(new ConsoleOutput());
				} else {
					search.setPluginOutput(new SimpleConsoleOutput());
				}
				Object result = search.searchAlgorithm(elems, needle);
				
				Output.printList(elems);
				System.out.println(result);
			}
			for(ISortAlgorithm sort: sorts){
				System.out.println("---");
				System.out.println("Sort by: " + sort.getClass());
				List unsorted = new ArrayList(elems);
				if(sort.getWithComments()){
					sort.setPluginOutput(new ConsoleOutput());
				} else {
					sort.setPluginOutput(new SimpleConsoleOutput());
				}
				
				List result = sort.sortAlgorithm(unsorted);
				
				Output.printList(elems);
				Output.printList(result);
			}
		}
	}
}
