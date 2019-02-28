interface Myinterface3
{
	String display(String a);
}

class XYZ
{
	public static void main(String[] args) {
Myinterface3 myinterface3 = (String a)-> {
	return a.toUpperCase();
};
		System.out.println(myinterface3.display("hello"));
	}
}