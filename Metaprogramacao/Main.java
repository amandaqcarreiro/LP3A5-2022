import java.lang.Class;
import java.lang.reflect.*;
import java.util.*;

public class Main {

	@SuppressWarnings("null")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		// TODO Auto-generated method stub
		
		//Instanciando classe com construtor sem parametro
		Time time = new Time();
		
		//Instanciando classe com construtor com parametro
		Time flamengo = new Time("Flamengo", "00000000000", 48000000);
		
		//Imprimindo o valor no construtor com parametro
		System.out.println("Time: " + flamengo.getNome());
		
		//Instanciando objeto do tipo Class para pegar o tipo da classe
		Class<? extends Time> t = time.getClass();
		
		//Instanciando objeto do tipo Class
		Class<?> minhaClasse = Class.forName("Time");
        
		Method metodo = t.getDeclaredMethod("getNome");
		
		Method privateMethod = metodo;
		
		System.out.println("Atributo: " + Arrays.toString(minhaClasse.getDeclaredFields()));
		
		System.out.println("Metodo: " + metodo.toString()); 
		
		//privateMethod.setAccessible(true);
		
		//System.out.println(privateMethod.invoke(flamengo));
		
		
	}

}
