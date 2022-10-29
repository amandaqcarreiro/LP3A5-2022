public class Teste {

	public static void main(String[] args) throws NovaExcecao{
		int[] numeros = {4, 8, 5, 16, 32, 21};
		int[] den = {2, 0 , 4, 8, 2};
		
		//Várias exceções, cada qual em seu bloco catch
		for(int i= 0; i <numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					throw new NovaExcecao(numeros[i], den[i]);
				}
				throw new NovaExcecao();
			}catch(ArithmeticException  e) {
				throw new ArithmeticException();
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Causa da excecao:" + e.getCause());
			}catch(NovaExcecao e) {
				System.out.println("Causa da excecao:" + e.getCause());
			}
		}
		
		//Várias exceções em um mesmo bloco catch, usando o operador "|"
		for(int i= 0; i <numeros.length; i++) {
			try {
				if(numeros[i] % 2 != 0) {
					throw new NovaExcecao(numeros[i], den[i]);
				}
				throw new NovaExcecao();
			}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NovaExcecao e) {
				System.out.println("Causa da excecao:" + e.getCause());
			}
		}

	}
  
  //Inspirado no canal da Loiane Groner

}
