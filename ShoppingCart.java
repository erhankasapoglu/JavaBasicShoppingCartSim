package oopIntro;


import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Enumeration;


public class ShoppingCart {
	
	private static Hashtable<Integer, Item> cartItems = new Hashtable<>();
	private StoreItems storeItems = new StoreItems();
	   
	public void addToCart(int itemId) {
		Item item = storeItems.getById(itemId);
		cartItems.put(item.getProductId(),item);
		System.out.println("sepete eklendi" + item.getProductName());
	}
	public void dropFromCart(int itemId) {
		Item item = storeItems.getById(itemId);
		cartItems.remove(itemId);
		System.out.println("sepetten silindi" + item.getProductName());
	}
	public double getTotalPrice() {
		double totalPrice = 0;
		Enumeration<Integer> e = cartItems.keys();
        while (e.hasMoreElements()) {
            int key = e.nextElement();
            Item item = cartItems.get(key);
            totalPrice = totalPrice + item.getSurchargePrice();
        }
		return totalPrice;
	}
}
