
public class ValueGenerator {
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
}
