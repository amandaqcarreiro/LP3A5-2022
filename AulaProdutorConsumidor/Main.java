
public class Main {

	public volatile static int products = 0;
	public volatile static int productsId = 0;
	public volatile static int productIdConsumed = - 1;
	
	public static volatile Object lock = new Object();

	public static void main(String[] args) {
		
		for(int i = 0; i <= 20; i++) {
			Product p1 = new Product(i);
			Consumer c1 = new Consumer(i);
			p1.start();
			c1.start();			
		}
	}

	//Inspirado no código do Antonio Deusany
}
