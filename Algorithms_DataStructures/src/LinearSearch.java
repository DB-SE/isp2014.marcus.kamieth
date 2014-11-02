public class LinearSearch <T>{

	public void linearSearch(T[] intarray, T needle){
		
		for (int i=0; i<intarray.length;++i){
			if(needle.equals(intarray[i])){
				System.out.format("Value %s found at index %d\n", intarray[i].toString(),i);
				return;
			}
			else
				{
				//#if Comments
				System.out.format("Value %s != array value %s\n", needle.toString(), intarray[i].toString());
				//#endif
				}
		}
		System.out.println("Value not in list.");
	}
}
