import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Function;

public class ExampleCollectors {

	public static void main(String[] args) {
		
		//Exemplo set
		List<Integer> numbersSet = List.of(1, 2, 3, 4, 5, 6);

		Set<Integer> numerosImpares = numbersSet.parallelStream().filter(x -> x % 2 != 0).collect(Collectors.toSet());
		System.out.println(numerosImpares); // [1, 3, 5]

		//Exemplo map
		List<Integer> numbersMap = List.of(1, 2, 3, 4, 5, 6);

		Map<Integer, String> mapNumerosImpares = numbersMap.parallelStream().filter(x -> x % 2 != 0)
				.collect(Collectors.toMap(Function.identity(), x -> String.valueOf(x)));
		System.out.println(mapNumerosImpares); // {1=1, 3=3, 5=5}
		
		//Exemplo list
		List<Integer> numbersList = List.of(1, 2, 3, 4, 5, 6);
		
		List<Integer> numerosPares = numbersList.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
		System.out.println(numerosPares);  // [2, 4, 6]
		
		//Exemplo de concatenacao de lista de string
		List<String> vowels = List.of("a", "e", "i", "o", "u");

		// sequential stream - nothing to combine
		StringBuilder resultado = vowels.stream().collect(StringBuilder::new, (x, y) -> x.append(y),
				(a, b) -> a.append(",").append(b));
		System.out.println(resultado.toString());

		// parallel stream - combiner is combining partial results
		StringBuilder resultado2 = vowels.parallelStream().collect(StringBuilder::new, (x, y) -> x.append(y),
				(a, b) -> a.append(",").append(b));
		System.out.println(resultado2.toString());
		
		//Exemplo de juncao de string
		Stream<String> frase = Stream.of("I", "love", "you");
        String str = frase.collect(Collectors.joining());
        System.out.println(str);
	}

	//Inspirado no DigitalOcean
}
