interface MyInterface2
{
	String display(String a, String b);
}

class Concat
{
	public static void main(String[] args) {
MyInterface2 myinterface2 = (String a,String b)-> {
	return a.concat(b);
};
		System.out.println(myinterface2.display("Hello","World"));
	}
}