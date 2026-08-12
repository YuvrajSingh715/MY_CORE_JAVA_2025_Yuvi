package com.meta.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class SoldierTest {

	public static void main(String[] args) {
		List<Soldier> soldiersList = Arrays.asList(new Soldier(1, "Amit", "Captain", "Infantry", 80000, 30),
				new Soldier(2, "Rahul", "Major", "Artillery", 90000, 35),
				new Soldier(3, "Vikas", "Captain", "Infantry", 75000, 28),
				new Soldier(4, "Arjun", "Colonel", "Engineering", 120000, 45),
				new Soldier(5, "Karan", "Major", "Infantry", 95000, 38),
				new Soldier(6, "Rohit", "Lieutenant", "Signals", 60000, 25));
		System.out.println("Salary > 80k वाले soldiers sort करके");
		List<Soldier> soldier80KAbove = soldiersList.stream().filter(x -> x.getSalary() > 80000)
				.sorted(Comparator.comparing(Soldier::getSalary)).collect(Collectors.toList());
		System.out.println(soldier80KAbove);
		System.out.println("Group By Unit");
		Map<String, List<Soldier>> groupByUnit = soldiersList.stream().collect(Collectors.groupingBy(Soldier::getUnit));
		System.out.println(groupByUnit);
		System.out.println("Highest Salary Soldier");
		Optional<Soldier> highestSalarySoldier = soldiersList.stream().max(Comparator.comparing(Soldier::getSalary));
		System.out.println(highestSalarySoldier);
		System.out.println("Rank-wise Count");
		Map<String, Long> rankByCount = soldiersList.stream()
				.collect(Collectors.groupingBy(Soldier::getRank, Collectors.counting()));
		System.out.println(rankByCount);
		System.out.println("Average Salary");
		double avgSalary = soldiersList.stream().collect(Collectors.averagingDouble(Soldier::getSalary));
		System.out.println(avgSalary);
		System.out.println("Partition (Age > 30)");
		Map<Boolean, List<Soldier>> partitionBy30Age = soldiersList.stream()
				.collect(Collectors.partitioningBy(x -> x.getAge() > 30));
		System.out.println(partitionBy30Age);
		System.out.println("Convert List to Map (ID → Soldier)");
		Map<Integer, Soldier> soldierMap = soldiersList.stream().collect(Collectors.toMap(Soldier::getId, s -> s));
		System.out.println(soldierMap);
		System.out.println("Top 3 Highest Paid Soldiers");
		List<Soldier> top3 = soldiersList.stream().sorted(Comparator.comparing(Soldier::getSalary)).limit(3)
				.collect(Collectors.toList());
		System.out.println(top3);
		System.out.println("Unit + Rank grouping");
		Map<String , Map<String, List<Soldier>>> unitRankGrouping = soldiersList.stream().collect(Collectors.groupingBy(Soldier::getUnit, Collectors.groupingBy(Soldier::getRank)));
        System.out.println(unitRankGrouping);
        System.out.println("Names Joining (Comma separated)");
        String name = soldiersList.stream().map(Soldier::getName).collect(Collectors.joining(" , "));
        System.out.println(name);
        
        
	}

}
