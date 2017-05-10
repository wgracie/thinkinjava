package typeinfo;

public class BoundedClassReferences {
	public static void main(String[] args) {
		Class<? extends Number> bounded = int.class;
		bounded = double.class;
		bounded = Number.class;
		
//		Class<Number> bounded2 = int.class;
//		bounded2 = double.class;
//		bounded2 = Number.class;
		
	}


}
