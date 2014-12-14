package plugins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import pluginInterface.IListGenerator;

public class SimpleListGenerator implements IListGenerator<Integer> {

	public List<Integer> getList() {
		return new ArrayList<Integer>(Arrays.asList(34, 23, 18, 17, 55, 67, 13, 16, 8, 7, 22, 45));
	}

	public Integer getNeedle() {
		return 7;
	}

}
