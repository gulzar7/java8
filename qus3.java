interface MyInterface5
{
	int display(int a, int b);
}
class AD {



	int instanceadd(int a, int b){
		return a+b;
		//System.out.println(a+b);
	}
	int instancesubtract(int a, int b) {
		return a-b;
		//System.out.println(a - b);
	}
	static int staticmultiply(int a, int b){
		return a*b;
		// System.out.println(a*b);
	}

	public static void main(String[] args) {
		MyInterface5 obj1 = (a,b)->a;

				MyInterface5 add = new AD()::instanceadd;

		MyInterface5 subtract1=new AD()::instancesubtract;

		MyInterface5 multiply=AD::staticmultiply;


		System.out.println("Addition :"+add.display(1,5));
		System.out.println("Subtraction :"+subtract1.display(9,6));
		System.out.println("Multiplication :"+multiply.display(6,7));


		}

	}
