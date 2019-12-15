import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import strategies.NilDiscountStrategy;
import strategies.TenPercentDiscountStrategy;
import strategies.TwentyPercentDiscountStrategy;

class ShoppingCartTest {

	@Test
	void testPay() {
		//Amount is below 5000
		ShoppingCart shoppingCart = new ShoppingCart();
		shoppingCart.addItem(new Item("1",4000));
		assertEquals(4000, shoppingCart.pay(new NilDiscountStrategy()));
		
		//Amount is between 5000 and 10000
		ShoppingCart shoppingCart10Percent = new ShoppingCart();
		shoppingCart10Percent.addItem(new Item("1",6000));
		assertEquals(5400, shoppingCart10Percent.pay(new TenPercentDiscountStrategy()));
		
		//Amount is between 5000 and 10000
		ShoppingCart shoppingCart20Percent = new ShoppingCart();
		shoppingCart20Percent.addItem(new Item("1",11000));
		assertEquals(8800, shoppingCart20Percent.pay(new TwentyPercentDiscountStrategy()));
	}

}
