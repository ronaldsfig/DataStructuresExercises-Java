public class HeapBinariaMinima
{
	private int n;               /* Numero de elementos no heap. */   
	private int tam;             /* Tamanho m�ximo do heap. */
	private int[] vetor;          /* Vetor com elementos. */


	public HeapBinariaMinima(int tamanho)
	{
		n = 0;
		tam = tamanho;
		vetor = new int[tamanho+1];
	}

	
	public HeapBinariaMinima(int tamanho, int[] v)
	{
		tam = tamanho;
		vetor = new int[tamanho+1];
		n = tamanho;

		for( int i = 0; i < tamanho; i++ )
			vetor[ i + 1 ] = v[ i ];

		constroiHeap();
	}
	
	public HeapBinariaMinima(HeapBinariaMaxima heapMaxima) {
		tam = heapMaxima.getTam();
		vetor = new int[heapMaxima.getTam()+1];
		n = heapMaxima.getTam();
		
		for(int i = 0; !heapMaxima.vazia(); i++) {
			vetor[i + 1] = heapMaxima.removeMax();
		}
		
		constroiHeap();
	}
	
	
	public int getTam() {
		return tam;
	}


	public boolean vazia()
	{
		return n == 0;
	}


	public void fazVazia()
	{
		n = 0;
	}

	
	public void imprime()
	{
		System.out.print("Conte�do da heap: ");
		
		for(int i = 1; i <= n; i++)
			System.out.print(vetor[i] + " ");

		System.out.println();
	}


	public int min()
	{
		if (this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MAX_VALUE;
		}

		return vetor[1];
	}


	public int removeMin()
	{
		int itemMin;
		
		if(this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MAX_VALUE;
		}

		itemMin = vetor[1];
		vetor[1] = vetor[n];
		n--;
		refaz(1);
		
		return itemMin;
	}

	
	private void constroiHeap()
	{
		for( int i = n / 2; i > 0; i-- )
			refaz(i);
	}
	
	
	private void refaz(int i)
	{
		int x = vetor[ i ];

		while(2*i <= n)
		{
			int filhoEsq, filhoDir, menorFilho;
			
			filhoEsq = 2*i;
			filhoDir = 2*i + 1;
			
			menorFilho = filhoEsq;
			
			if(filhoDir <= n)
			{
				if(vetor[ filhoDir ] < vetor[ filhoEsq ])
					menorFilho = filhoDir;
			}

			if(vetor[ menorFilho ] < x)
				vetor [ i ] = vetor[ menorFilho ];
			else
				break;

			i = menorFilho;
		}
		
		vetor[ i ] = x;
	}
	
	


	public void insere(int x)
	{
		if (tam == n)
		{
			System.out.println("Fila de prioridades cheia!");
			return;
		}

		n++;
		int pos = n;
		
		vetor[0] = x;

		while(x < vetor[pos/2])
		{
			vetor[pos] = vetor[ pos/2 ];
			pos /= 2;
		}
		
		vetor[pos] = x;
	}
}