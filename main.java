package oopIntro;


import java.util.Hashtable;
import java.util.List;

public class main {



	public static void main(String[] args) {
		
		StoreItems storeItems = new StoreItems();
		ShoppingCart shoppingCart = new ShoppingCart();

		
		Item product1 = new Item(1,"Lenovo a5","AliExpress",1000.0,680.0,20.0);

		
		
		Item product2 = new Item(2,"Monster","Itopya",5000.0,3900.0,20.0);

		
		
		
		Item product3 = new Item(3,"Dell","Amazon",10000.0,6800.0,20.0);
	
		storeItems.setStoreItems(product1,product2,product3);
		Hashtable<Integer, Item> items = storeItems.getStoreItems();
		items.forEach((key, item) -> {
			System.out.println("itemler sistemite tanımlanıyor:=" + item.getProductName() + " "+ item.getSurchargePrice());
        });
		shoppingCart.addToCart(2);
		shoppingCart.addToCart(3);
		System.out.println("Total sepet tutarı : "+shoppingCart.getTotalPrice());

	}

}
