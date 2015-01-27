import base.Output;


public aspect Code {
	
	after() : call(* *.*(..)) && target(Sort){
		System.out.print(thisJoinPointStaticPart.getSignature());
		System.out.println(" was called in");
		System.out.println(thisJoinPointStaticPart.getSourceLocation());
	}
	after() : call(* *.*(..)) && this(LinearSearch){
		System.out.print(thisJoinPoint.getSignature());
		System.out.println(" was called in");
		System.out.println(thisJoinPoint.getSourceLocation());
	}
}
