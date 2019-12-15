package strategies;

public class TenPercentDiscountStrategy implements IDiscountStrategy {
	private double discount = 0.1;
	
	@Override
	public double pay(double amount) {
		if (amount > 5000 && amount <= 10000)
			return (amount - amount*discount);
		return 0;

	}

}
