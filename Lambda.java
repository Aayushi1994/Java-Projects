package collectiondemos;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda {

	public static void main(String[] args) {
		List<Integer> amc = Arrays.asList(10,9,8,25,27);
		
		System.out.println("The original Array: "+ amc);
		
		Optional<Integer> max = amc.stream().max((x,y) -> x.compareTo(y));
		
		System.out.println("The max value is: " + max.orElse(null));
		
		Optional<Integer> min = amc.stream().min((x,y) -> x.compareTo(y));
		
		System.out.println("The min value is: " + min.orElse(null));
		
		
	}

}
