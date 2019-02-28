interface inter3 {
	default void display(){
		System.out.println("inter1");
	}
}

class DefaultMethods2 implements inter3 {
	public void display(){
		System.out.println("DefaultMethods");
	}

	public static void main(String[] args) {
		DefaultMethods2 defaultMethods=new DefaultMethods2();
		defaultMethods.display();
	}
}
