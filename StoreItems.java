package oopIntro;
import java.util.ArrayList;
import java.util.List;
import java.util.Enumeration;
import java.util.Hashtable;

public class StoreItems {

	

	
	private static Hashtable<Integer, Item> storeItems = new Hashtable<>();
	public Hashtable<Integer, Item> getStoreItems() {
		return storeItems;
	}

	public void setStoreItems(Item... storeItems) {
		for (Item item : storeItems) {
			this.storeItems.put(item.getProductId(),item);
        }
	}
	public Item getById(int itemId) {
		return storeItems.get(itemId);
	}
	 
}
