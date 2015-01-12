
public class ValueGenerator {
	private static String[] values = {
		"elephant","giraffe","monkey","cheetah","dog","cat","tiger",
		"mouse","tortoise","shark","whale","salmon","deer","wolf",
		"grizzlybear","fox","snake","worm","fly","bee","hornet"
	};
	public static String[] getNewStringArray(){
		int size = (int)(Math.random()*20 +1);
		String[] arr = new String[size];
		for(int i=0; i<size;++i){
			arr[i] = getNewString();
		}
		return arr;
	}

	public static String getNewString(){
		int index = (int)(Math.random()*values.length);
		return values[index];
	}
}
