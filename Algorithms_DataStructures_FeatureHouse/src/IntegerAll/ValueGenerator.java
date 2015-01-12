
public   class  ValueGenerator {
	
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


}
