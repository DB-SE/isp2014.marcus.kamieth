import base.Output;


public aspect Code {
	
	after() : call(* *.*(..)) && target(Sort){
		System.out.print(thisJoinPointStaticPart.getSignature());
		System.out.println(" was called with arguments");
		System.out.println(thisJoinPointStaticPart.getKind());
		System.out.println(thisJoinPointStaticPart.getSourceLocation());
	}
	after() : call(* *.*(..)) && target(LinearSearch){
		System.out.print(thisJoinPoint.getSignature());
		System.out.println(" was called with arguments");
		Output.printArray(thisJoinPoint.getArgs());
		System.out.println(thisJoinPoint.getSourceLocation());
	}
}
