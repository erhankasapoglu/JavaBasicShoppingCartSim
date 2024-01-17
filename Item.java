package oopIntro;

public class Item {
	
	private int id;
	private String productName;
	private String supplierName;
	private double sellingPrice;
	private double buyingPrice;
	private double surcharge;
	
	
	
	public Item(int id, String productName, String supplierName, double sellingPrice, double buyingPrice,double surcharge) {
		//super();
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
		this.sellingPrice = sellingPrice;
		this.buyingPrice = buyingPrice;
		this.surcharge = surcharge;
		
	}

	public int getProductId() {
		return id;
	}

	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public double getSellingPrice() {
		return sellingPrice;
	}


	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}


	public double getBuyingPrice() {
		return buyingPrice;
	}


	public void setBuyingPrice(double buyingPrice) {
		this.buyingPrice = buyingPrice;
	}


	public double getSurcharge() {
		return surcharge;
	}


	public void setSurcharge(double surcharge) {
		this.surcharge = surcharge;
	}

	public double getSurchargePrice() {
	
		return this.sellingPrice + (this.sellingPrice * (this.surcharge / 100) );
	}
	
	public double getProfit() {
		return this.sellingPrice + (this.sellingPrice * this.surcharge / 100 ) - this.buyingPrice ;
	}
	
	
	

}
