package strategies;

public class TwentyPercentDiscountStrategy implements IDiscountStrategy {
	private double discount = 0.2;

	@Override
	public double pay(double amount) {
		if (amount > 10000)
			return (amount - amount*discount);
		return 0;
	}

}
