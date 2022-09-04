
public class Consumer extends Thread {
	int id;
	
	Consumer(int newId){
		this.id = newId;
	}
	
	public void run() {
		synchronized(Main.lock) 
		{	
			System.out.println("Consumidor " + this.id + " achou: " + Main.products + " produto(s).");
			while(Main.products <= 0) { // Repete enquanto o estoque estiver zerado
				try {
					Main.lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Main.products = Main.products - 1;
			Main.productIdConsumed = Main.productIdConsumed + 1;
			System.out.println("Consumidor " + this.id + " processou o item " + Main.productIdConsumed);
			Main.lock.notifyAll();
		} // fim do lock
	}
	
	
}
