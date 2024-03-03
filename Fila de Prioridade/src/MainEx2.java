
public class MainEx2
{
	public static void main(String args[])
	{
		int tamanho = 5;
		int vetor[] = {5, 11, 4, 2, 1};
		
		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);

		System.out.println("Conteúdo da heap máxima:");
		heapMaxima.imprime();
		
		System.out.println("");
		
		System.out.println("Conteúdo da heap mínima:");
		HeapBinariaMinima heapMinima = new HeapBinariaMinima(heapMaxima);
		
		heapMinima.imprime();
	}
}