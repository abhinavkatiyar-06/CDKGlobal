import java.util.ArrayList;
import java.util.List;

import strategies.IDiscountStrategy;

public class ShoppingCart {

	List<Item> items;

	public ShoppingCart() {
		this.items = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		this.items.add(item);
	}

	public void removeItem(Item item) {
		this.items.remove(item);
	}

	public double sumTotal() {
		double sum = 0;
		for (Item item : items) {
			sum = sum + item.getPrice();
		}
		return sum;
	}

	public double pay(IDiscountStrategy discounStrategy) {
		double sumTotal = this.sumTotal();
		return discounStrategy.pay(sumTotal);
	}

}
