interface MyInterface4
{
	int display(int a,int b);
}

class fi
{
	public static void main(String[] args) {
		MyInterface4 myInterface4 =(int a, int b)->{
			return a+b;
		};
		System.out.println(myInterface4.display(4,3));
	}
}