import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class TestesQuicksortForkJoin {
	public static void main(String[] args) {
	//cria um pool de threads Fork/Join
        ForkJoinPool pool = new ForkJoinPool();
        
        //array que será ordenado
        int[] numeros = {6, 9, 4, 5, 1, 0, 2, 7, 2, 3};
        
        //imprime o vetor desordenado
        System.out.println("A (desordenado) = " + Arrays.toString(numeros));
        
        //tarefa ForkJoin para ordenar o vetor de numeros
        QuicksortForkJoinHoare quicksortTaskHoare = new QuicksortForkJoinHoare(numeros);
        //executa a tarefa utilizando o pool
        pool.invoke(quicksortTaskHoare);
        System.out.println("A (ordenado com Quicksort de Hoare) = " + Arrays.toString(numeros));
		
	}
}
