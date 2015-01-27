import base.List;
public aspect ALinearSearch {
	public Integer LinearSearch.linearSearch(List<T> intarray, T needle){
		//Output.printArray(intarray);
		//Output.printText("Needle=" + needle);		
		for (int i=0; i<intarray.size();++i){
			boolean eq = equalsNeedle(intarray.get(i), needle);
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
	public boolean LinearSearch.equalsNeedle(T listValue, T needle){
		return needle.equals(listValue);
	}
}
