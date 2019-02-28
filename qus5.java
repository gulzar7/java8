/*
Q5- Implement following functional interfaces from java.util.function using lambdas:
      (1) Consumer
      (2) Supplier
      (3) Predicate
      (4) Function
*/


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class MN {
	public static void main(String[] args) {

		Consumer consumer = e-> System.out.println(e);
		consumer.accept("MIRROR MIRROR ON THE WALL");

		Supplier supplier = ()-> 2;
		System.out.println(supplier.get());

		Predicate<Integer> predicate = e-> (e>15);
		System.out.println(predicate.test(16));

		Function<Integer,Integer> function = e->e*6;
		System.out.println(function.apply(5));


	}
}