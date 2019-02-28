interface inter4 {
	default void display(){
		System.out.println("inter1");
	}
}

interface child1 extends inter4{
	default void display(){
		System.out.println("child1");
	}
}

interface child2 extends inter4{
	default void display(){
		System.out.println("child2");
	}
}

class DefaultMethods3 implements child1,child2 {
	public void display(){
		System.out.println("DefaultMethods");
	}

	public static void main(String[] args) {
		DefaultMethods3 defaultMethods=new DefaultMethods3();
		defaultMethods.display();
	}
}
