
public class MainEx4
{
	public static void main(String args[])
	{
		int vetor[] = {0, 11, 5, 4, 9, 3};
		
		HeapBinariaMaxima heapMaxima = new HeapBinariaMaxima(3);

		System.out.println(heapMaxima.verificaPropriedadeHeap(vetor));
		
		
	}
}
