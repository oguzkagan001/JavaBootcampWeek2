package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product(956472,"Monster Notebook","Monster Abra A5 V17.1.3",16.999,60); //Constructor
		
		/*product.name = "Monster Notebook";
		product.id = 956472;
		product.description = "Monster Abra A5 V17.1.3";  
		product.price = 16.999;	
		product.stockAmount=60; */
		
		/*Product product = new Product();
		product.setName("Monster Notebook");
		product.setId(956472);
		product.setDescription("Monster Abra A5 V17.1.3");  //Getter and Setter
		product.setPrice(16.999);
		product.setStockAmount(60);*/
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);  
			
	}

}
