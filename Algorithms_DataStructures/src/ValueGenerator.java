
public class ValueGenerator {
//#if String
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
//#endif
//#if Integer
	public static int getNewInt(){
		return (int)(Math.random()*100);
	}
	
	public static Integer[] getNewIntArray(){
		int size = (int)(Math.random()*20 +1);
		Integer[] arr = new Integer[size];
		for(int i=0; i<size;++i){
			arr[i] = getNewInt();
		}
		return arr;
	}
//#endif
//#if Double
	public static double getNewDouble(){
		return Math.random()*100;
	}
	public static Double[] getNewDoubleArray(){
		int size = (int)(Math.random()*20 +1);
		Double[] arr = new Double[size];
		for(int i=0; i<size;++i){
			arr[i] = getNewDouble();
		}
		return arr;
	}
//#endif
}
