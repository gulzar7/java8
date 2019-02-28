interface MyInterface1
{
	int display1(int a);

}

class AB {
	public static void main(String[] args) {
		MyInterface1 myInterface = (int a) -> {
			return a + 1;
		};

		System.out.println(myInterface.display1(2));

	}
}