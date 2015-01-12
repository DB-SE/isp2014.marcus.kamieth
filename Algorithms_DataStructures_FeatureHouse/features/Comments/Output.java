public class Output {
	public static void printComment(String text){
		System.out.print(text);
	}
	public static <E> void printArrayComment(E[] array){
		Output.printArray(array);
	}
}