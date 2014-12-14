package plugins;

import java.util.ArrayList;
import java.util.List;

import pluginInterface.IListGenerator;

public class RandomDoubleListGenerator implements IListGenerator<Double> {

	public List<Double> getList() {
		int size = (int)(Math.random()*20 +1);
		List<Double> list = new ArrayList<Double>();
		for(int i=0; i<size;++i){
			list.add(getNewDouble());
		}
		return list;
	}

	public Double getNeedle() {
		return getNewDouble();
	}
	
	private static double getNewDouble(){
		//round double to ##.###
		return Math.floor(Math.random()*100000 ) / 1000;
	}

}
