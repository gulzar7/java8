interface MyInterface
		{
			boolean display(int a, int b);

		}
		class A{
			public static void main(String[] args) {
				MyInterface myInterface = (int a, int b)->
				{
					if (a>b)
						return true;


						else
						return false;



				};
				System.out.println(myInterface.display(3,2));
			}
			}