package plugins;

import java.util.ArrayList;
import java.util.List;

import pluginInterface.IListGenerator;

public class RandomIntegerListGenerator implements IListGenerator<Integer> {

	public List<Integer> getList() {
		int size = (int)(Math.random()*20 +1);
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<size;++i){
			list.add(getNewInt());
		}
		return list;
	}

	public Integer getNeedle() {
		return getNewInt();
	}
	
	private int getNewInt(){
		return (int)(Math.random()*100);
	}

}
