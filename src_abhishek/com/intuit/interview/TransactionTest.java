package com.intuit.interview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionTest {

	public static void main(String[] args) {
		List<Transaction> transactionList = List.of(new Transaction("Success", "U1", 100),
				new Transaction("Failed", "U1", 200), new Transaction("Success", "U2", 300),
				new Transaction("Success", "U1", 150), new Transaction("Failed", "U2", 50));

		// ✅ 1. How do you filter transactions by status?
		List<Transaction> successfulTransactions = transactionList.stream().filter(s -> "Success".equals(s.getStatus()))
				.collect(Collectors.toList());
		System.out.println(successfulTransactions);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		// ✅ 2. How do you group transactions by user ID?
		Map<String, List<Transaction>> groupedByUser = transactionList.stream()
				.collect(Collectors.groupingBy(Transaction::getUserId));
		System.out.println(groupedByUser);
		// ✅ 3. How do you calculate sum per user using streams?
		Map<String, Double> totalAmountPerUser = transactionList.stream().filter(s -> "Success".equals(s.getStatus()))
				.collect(Collectors.groupingBy(Transaction::getUserId,
						Collectors.summingDouble(Transaction::getAmount)));
		System.out.println(totalAmountPerUser);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		// ✅ 4. If you only want User IDs of successful transactions
		List<String> successTransactionUserIds = transactionList.stream().filter(s -> "Success".equals(s.getStatus()))
				.map(Transaction::getUserId).collect(Collectors.toList());
		System.out.println(successTransactionUserIds);
	}

}
