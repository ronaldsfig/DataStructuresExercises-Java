
public class MainEx3
{
	public static void main(String args[])
	{
		int tamanho = 5;
		int vetor[] = {5, 11, 4, 2, 1};
		
		HeapBinariaMinima heapMinima = new HeapBinariaMinima(tamanho, vetor);

		System.out.println("Conteúdo da heap mínima:");
		heapMinima.imprime();
		
		System.out.println("");
		
		System.out.println("Conteúdo da heap máxima:");
		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(heapMinima);
		
		heapMaxima.imprime();
	}
}