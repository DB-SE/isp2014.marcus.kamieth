
public aspect ALinearSearch {
	public <T> Integer LinearSearch.linearSearch(T[] intarray, T needle){
		//Output.printArray(intarray);
		//Output.printText("Needle=" + needle);		
		for (int i=0; i<intarray.length;++i){
			boolean eq = needle.equals(intarray[i]);
			if(eq){
				//Output.printText("Value "+ intarray[i].toString() +" found at index " + i +"\n");
				return i;
			}
			else
				{
				//Output.printComment("Value "+ needle.toString() +" != array value "+ intarray[i].toString() +"\n");
				}
		}
		//Output.printText("Value not in list.\n");
		return null;
	}
	
	/* used cause otherwise it was not possible to access a joinpoint for outputting*/
	public <T> boolean ALinearSearch.equalsNeedle(T listValue, T needle){
		return needle.equals(listValue);
	}
}
