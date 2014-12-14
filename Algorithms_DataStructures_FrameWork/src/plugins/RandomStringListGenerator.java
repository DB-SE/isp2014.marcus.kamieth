package plugins;

import java.util.ArrayList;
import java.util.List;

import pluginInterface.IListGenerator;

public class RandomStringListGenerator implements IListGenerator<String> {
	private static String[] values = {
		"elephant","giraffe","monkey","cheetah","dog","cat","tiger",
		"mouse","tortoise","shark","whale","salmon","deer","wolf",
		"grizzlybear","fox","snake","worm","fly","bee","hornet"
	};
	public List<String> getList() {
		int size = (int)(Math.random()*20 +1);
		List<String> list = new ArrayList<String>();
		for(int i=0; i<size;++i){
			list.add(getNewString());
		}
		return list;
	}

	public String getNeedle() {
		return getNewString();
	}
	
	public static String getNewString(){
		int index = (int)(Math.random()*values.length);
		return values[index];
	}

}
