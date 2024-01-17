public class ShoppingCartSimulation {
    public static void main(String[] args) {
        // Item sınıfını kullanarak ürün oluşturma
        Item item1 = new Item("Laptop", "ABC Electronics", 2500.0, 2000.0);

        // Satış fiyatını %20 arttırma
        item1.increaseSellingPrice();

        // Karı hesaplama
        double profit = item1.calculateProfit();

        // Bilgileri ekrana yazdırma
        System.out.println("Ürün Adı: " + item1.getProductName());
        System.out.println("Tedarikçi Adı: " + item1.getSupplierName());
        System.out.println("Yeni Satış Fiyatı: " + item1.getSellingPrice());
        System.out.println("Alış Fiyatı: " + item1.getPurchasePrice());
        System.out.println("Elde Edilen Kar: " + profit);
    }
}
