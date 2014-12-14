package framework;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;

import pluginInterface.IListGenerator;
import pluginInterface.ISearchAlgorithm;
import pluginInterface.ISortAlgorithm;


/**
 * reads list of plugins and starts the application with these
 * plugins as parameters
 * Plugin mechanism based on a tutorial from
 * www.java-blog-buch.de/d-plugin-entwicklug-in-java/ 
 *
 */
public class Main {

	public static void main(String[] args) {
		File folder = new File("bin/plugins");
		System.out.println("Search plugins folder:");
		System.out.println(folder.getAbsolutePath());
		File[] plugins = folder.listFiles();
		ClassLoader cl = getURLClassLoaderFromRelativePath(plugins);
		
		
		
		List<Class<IListGenerator>> listgens = new ArrayList<Class<IListGenerator>>();
		List<Class<ISearchAlgorithm>> searchAlgs = new ArrayList<Class<ISearchAlgorithm>>();
		List<Class<ISortAlgorithm>> sortAlgs = new ArrayList<Class<ISortAlgorithm>>();
		
		try {
			for (File plugin : plugins) {
				if(plugin.getName().toLowerCase().endsWith(".class")){
					Class<?> cls = cl.loadClass("plugins." + plugin.getName().substring(0, plugin.getName().length()-6));
					if(IListGenerator.class.isAssignableFrom(cls)){
						listgens.add((Class<IListGenerator>) cls);
					} else if(ISearchAlgorithm.class.isAssignableFrom(cls)){
						searchAlgs.add((Class<ISearchAlgorithm>) cls);
					} else if(ISortAlgorithm.class.isAssignableFrom(cls)){
						sortAlgs.add((Class<ISortAlgorithm>) cls);
					} 
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<IListGenerator> lists = new ArrayList<IListGenerator>();
		for(Class<IListGenerator> plug: listgens){
			try {
				lists.add(plug.newInstance());
			} catch (InstantiationException e) {e.printStackTrace();}
			catch (IllegalAccessException e) {e.printStackTrace(); }
		}
		
		List<ISearchAlgorithm> searchs = new ArrayList<ISearchAlgorithm>();
		for(Class<ISearchAlgorithm> plug: searchAlgs){
			try {
				searchs.add(plug.newInstance());
			} catch (InstantiationException e) {e.printStackTrace();}
			catch (IllegalAccessException e) {e.printStackTrace(); }
		}
		
		List<ISortAlgorithm> sorts = new ArrayList<ISortAlgorithm>();
		for(Class<ISortAlgorithm> plug: sortAlgs){
			try {
				sorts.add(plug.newInstance());
			} catch (InstantiationException e) {e.printStackTrace();}
			catch (IllegalAccessException e) {e.printStackTrace(); }
		}
		
		Output.printList(lists);
		Output.printList(searchs);
		Output.printList(sorts);

		new Application(lists, searchs, sorts);

	}
	/**
	 * determines URLs from given files
	 * and creates a class loader from these
	 * @param path path relative to project root 
	 * @return URLClassLoader
	 */
	private static ClassLoader getURLClassLoaderFromRelativePath(File[] plugins){
		URL[] urls = new URL[plugins.length];
		try {
			for(int i=0; i<plugins.length; ++i){
				urls[i] = plugins[i].toURI().toURL();
			}
		} catch (MalformedURLException e) {
			System.err.println("Could not read requested plugin files.");
			e.printStackTrace();
		}
		return new URLClassLoader(urls);
	}
}
