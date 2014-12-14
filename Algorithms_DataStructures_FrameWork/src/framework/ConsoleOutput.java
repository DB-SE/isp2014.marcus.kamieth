package framework;

import java.util.List;

import pluginInterface.IPluginOutput;

public class ConsoleOutput implements IPluginOutput {

	public void write(String message) {
		System.out.print(message);

	}
	public void explain(String comment) {
		System.out.print(comment);

	}
	public String buildList(List list) {
		return Output.buildList(list);
	}

}
