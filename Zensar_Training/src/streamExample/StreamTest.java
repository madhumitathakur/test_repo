package streamExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Account implements Comparable<Account> {
	String name;
	Double balance;

	public Account(String name, Double balance) {
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return this.name;
	}

	public Double getBalance() {
		return this.balance;
	}

	@Override
	public String toString() {
		return this.name + " - " + this.balance;
	}

	@Override
	public int compareTo(Account o) {
		if(this.balance > o.balance)
			return 1;
		else if(this.balance < o.balance)
			return 0;
		return 0;
	}
}

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> studentList = Arrays.asList("Sara", "Anand", "Tom", "Ivan");
		
		List<Account> accountList = Arrays.asList(new Account("Ivan", 90000.0), new Account("Tom",4500.0), new Account("Sam", 50000.0));
		
		
		
		Comparator<Account> accNameComparator = (Account acc1, Account acc2)->acc2.getName().compareTo(acc1.getName()); 
		List<Account> sortAccountList = accountList.stream().sorted(accNameComparator).collect(Collectors.toList());
		System.out.println("sortAccountList : " + sortAccountList);
		
		
		Comparator<Account> accBalComparator = (Account acc1, Account acc2)->acc2.getBalance().compareTo(acc1.getBalance());
		List<Account> sortAccountBalList = accountList.stream().sorted(accBalComparator).collect(Collectors.toList());
		System.out.println("sortAccountBalList : " + sortAccountBalList);
		
		
		
		
		Function<Account,Double> function = (Account account) -> account.getBalance();
		List<Double> accountBalanceList = accountList.stream().map(function).collect(Collectors.toList());
		System.out.println(accountBalanceList);
		
		Function<Account, String> func = (Account account)->account.getName();
		List<String> accountNameList = accountList.stream().map(func).collect(Collectors.toList());
		System.out.println(accountNameList);
	
		
	}

}
