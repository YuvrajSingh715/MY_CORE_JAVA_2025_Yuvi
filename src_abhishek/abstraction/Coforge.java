package abstraction;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Coforge {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
 Map<String, Long> charCount = Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));	 
  Entry<String, Long> secondNonREChar =  charCount.entrySet().stream().filter(entry -> entry.getValue() == 1).skip(1).findFirst().orElse(null);
  
  System.out.println(secondNonREChar);
	}

}
