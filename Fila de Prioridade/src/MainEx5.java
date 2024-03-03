
public class MainEx5
{
	public static void main(String args[])
	{
		int tamanho = 5;
		int vetor[] = {5, 11, 4, 2, 1};

		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(tamanho, vetor);
		
		heapMaxima.imprime();
		
		System.out.println("Elemento removido: "+heapMaxima.remove(3));
		
		heapMaxima.imprime();
	}
}