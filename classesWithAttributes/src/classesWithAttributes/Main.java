package classesWithAttributes;

//Course 31 Field and Attributes
//Course 32 Encapsulation
//Course 33 Getters and Setters
//course 34 Constructor
public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("ASUS Laptop");
		product.setStockAmount(3);
		product.setPrice(5000);
		product.setColor("mavi");
		System.out.println(product.getName());
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getCode());
		
		
	}

}
