package Q7;

public class Wrapper {

	public static void main(String[] args) {
		
		//Boxing 
		@Deprecated
		int primitive = 10;
		@SuppressWarnings("removal")
		Integer wrapperInt = new Integer (primitive); //Converting Primitive[int] TO Wrapper[Integer] Object by creating new instance of Integer Wrapper Class.
		System.out.println("Wrapper Object: " + wrapperInt);
		
		//Unboxing
		@Deprecated
		int unboxed = wrapperInt.intValue();//Converting Wrapper[Integer] Object TO Primitive[int] using intValue() Function. 
		System.out.println("Primitive Variable: " + unboxed);
		
		
		
		//AutoBoxing
		int primitive2 = 10; //Primitive Integer Value
		Integer wrapperInt2 = primitive2; //Converting Primitive[int] TO Wrapper[Integer] Object automatically.
		System.out.println("Wrapper Object: " + wrapperInt2);
		
		//AutoUnboxing
		int unboxed2 = wrapperInt2;//Converting Wrapper[Integer] Object TO Primitive[int] automatically without using intValue() Function. 
		System.out.println("Primitive Variable: " + unboxed2);

	}

}
