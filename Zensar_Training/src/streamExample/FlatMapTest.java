package streamExample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapTest {

	public static void main(String[] args) {
		
//		List<Integer> list1 = Arrays.asList(1,2,3);
//		List<Integer> list2 = Arrays.asList(4,5,6);
		
		Stream<List<Integer>> stream = Stream.of(Arrays.asList(1,2,3), Arrays.asList(4,5,6));
		
		List<Integer> flastIntList = stream.flatMap(List::stream).collect(Collectors.toList());

	}

}
