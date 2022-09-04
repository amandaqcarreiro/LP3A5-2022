
public class Product extends Thread {
	int id;
	
	Product(int newId ){
		this.id = newId;
	}
	
	public void run() {
		synchronized(Main.lock) 
		{
			System.out.println("Produtor " + this.id + " está pronto!");
			if (Main.products >= 20) { // Buffer, estoque cheio!
				try {
					Main.lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Main.products = Main.products + 1;
			Main.productsId = Main.productsId + 1;
			System.out.println("Produtor " + this.id + " criou item: " + Main.productsId + " total de itens: " + Main.products);
			Main.lock.notify();
		} // fim do lock
	}
	
	
}
