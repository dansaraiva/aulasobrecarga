package app;

import entity.Product;

public class Program {

	public static void main(String[] args) {
		Product p = new Product();
		Product q = new Product("PS5",5900.99,100);
		Product r = new Product("XBox Series X", 3100.00);
		
		p.setName("TV");
		p.setPrice(1234.56);
		p.setQuantity(10);
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);

	}

}
