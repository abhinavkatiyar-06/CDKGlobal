package strategies;

public class NilDiscountStrategy implements IDiscountStrategy {

	@Override
	public double pay(double amount) {
		if (amount > 0 && amount < 5000)
			return amount;
		return 0;

	}

}
