package pack1;

//Shopkeeper sells the product by taking credit card


public class Shopkeeper {
	product sells(creditcard c) {
		System.out.println("Shopkeeper takes the credit card and sells the product");
		product p=new product();
		return p;
		
	}
	
	public static void main(String args[]) {
		Shopkeeper s = new Shopkeeper();
		creditcard cc=new creditcard();	
		System.out.println(s.sells(cc));
		
	}

}

class product{
	
}

class creditcard{
	
}