import java.util.*;
import java.util.stream.Collectors;

class Flu {
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9 , 10);
		System.out.println(
				list.stream()
						.filter(e -> e %2 ==0)
						.collect(Collectors.toList())
		);
	}
}