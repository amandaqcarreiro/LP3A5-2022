import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		
		//Exemplo of
		try {
        Optional<Integer> opOf = Optional.of(null);
  
        System.out.println(".of: " + opOf);
    }
    catch (Exception e) {
        System.out.println(e);
    }
		
		//Example ofNullable
        Optional<Integer> opOfNullable = Optional.ofNullable(2019);
  
        System.out.println(".ofNullable: " + opOfNullable);
        
        // Exemplo filter
        Optional<Integer> opFilter = Optional.of(2020);
  
        System.out.println(".filter: "+ opFilter);
  
        System.out.println("Valor filtrado " + "(par): " + opFilter.filter(num -> num % 2 == 0));
        
        //Exemplo orElse
        Optional<Integer> opOrElse = Optional.of(2021);
  
        System.out.println(".orElse: " + opOrElse);
  
        System.out.println("Valor pelo orElse" + "(100) method: " + opOrElse.orElse(100));
        
        //Exemplo orElseGet
        Optional<Integer> opOrElseGet = Optional.of(2022);
  
        System.out.println(".orElseGet: " + opOrElseGet);
  
        System.out.println("Valor pelo orElseGet"+ "(fornecedor) method: "
                           + opOrElseGet.orElseGet(() -> (int)(Math.random() * 10)));
        
        //Exemplo orElseThrow
        Optional<Integer> opOrElseThrow = Optional.of(2023);
  
        System.out.println(".orElseThrow: " + opOrElseThrow);
  
        System.out.println(
            "Value por orElseThrow(" + "ArithmeticException::new) method: "
            + opOrElseThrow.orElseThrow(ArithmeticException::new));
	}
  
  //Inspirado no site GeekForGeeks

}
