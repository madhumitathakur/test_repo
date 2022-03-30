package streamAssignment;

public class TransactionPredicateByAmount 
implements TransactionPredicate {

	@Override
	public boolean test(Transaction t) {
		return t.getAmount() > 500;
	}

}