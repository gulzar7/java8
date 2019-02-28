interface inter1 {
	default void display(){
		System.out.println("inter1");
	}
}

class DefaultMethods implements inter1 {
	public static void main(String[] args) {
		DefaultMethods defaultMethods=new DefaultMethods();
		defaultMethods.display();
	}
}
