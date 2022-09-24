package classesWithAttributes;

public class ProductManager {

	public void Add(Product product) {

		/*
		 System.out.println("Ürün eklendi: " + product.name);
		 System.out.println("Ürün ID: " + product.id);
		 System.out.println("Ürün açıklaması: " + product.description);
		 System.out.println("Ürün fiyatı: " + product.price);
		 System.out.println("Stok adeti: " + product.stockAmount);
		 */
		
		System.out.println("Ürün eklendi: " + product.getName());
		System.out.println("Ürün ID:" + product.getId());
		System.out.println("Ürün açıklaması:" + product.getDescription());
		System.out.println("Ürün fiyatı:" + product.getPrice());
		System.out.println("Ürün adeti:" + product.getStockAmount());
		System.out.println("Ürünün kodu:" + product.getKod());
			
	}

}
