public   class  LinearSearch  <T> {
	

	public void linearSearch  (T[] intarray, T needle){
		Output.printArray(intarray);
		Output.printText("Needle=" + needle);		
		for (int i=0; i<intarray.length;++i){
			if(needle.equals(intarray[i])){
				Output.printText("Value "+ intarray[i].toString() +" found at index " + i +"\n");
				return;
			}
			else
				{
				Output.printComment("Value "+ needle.toString() +" != array value "+ intarray[i].toString() +"\n");
				}
		}
		Output.printText("Value not in list.\n");
	}


}
