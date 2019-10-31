package superclassandsubclass;

public class ClassOne {
	
	public static void main(String[] args) {
		
		SubClass subobject = new SubClass();
		
		SuperClass supobject;
		
		supobject = subobject;
		
		System.out.println(supobject.a);
		
		System.out.println(subobject.z);
		
	}

}
