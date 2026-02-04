package com.meta.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test3 {

	public static void main(String[] args) {
		String str = "abhishek singh kushwah";
		Map<Character, Long> charCount = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(charCount);
		Character nonch = str.chars().mapToObj(c -> (char) c).filter(s -> charCount.get(s) == 1).findFirst()
				.orElse(null);
		System.out.println(nonch);

		List<String> list = Arrays.asList("Abhishek", "Shiva", "Abhishek", "Shiva", "Anand");
		list.stream().sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
		System.out.println("yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy");
		Map<String, Long> countString = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(countString);

		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.stream().sorted().forEach(System.out::println);
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String JoinedString = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		System.out.println(JoinedString);
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		listOfIntegers.stream().filter(s -> s % 5 == 0).forEach(System.out::println);
		System.out.println("============================");
		int max = listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		System.out.println(max);
		int min = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		System.out.println(min);
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };
		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		System.out.println(Arrays.toString(c));
		listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);
		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		System.out.println("++++++++++++++++++++++++++");
		int i = 15623;
		Integer summingInt = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		System.out.println(summingInt);
		System.out.println("++++++++++++++++++++++++++++");
		Integer secNum = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secNum);
		int[] d = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };
		int sum = Arrays.stream(d).sum();
		System.out.println(sum);
		System.out.println("PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPP");
		double e = Arrays.stream(d).average().getAsDouble();
		System.out.println(e);
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
		System.out.println("TTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");
		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
		list1.stream().filter(list2::contains).forEach(System.out::println);
		

	}

}
