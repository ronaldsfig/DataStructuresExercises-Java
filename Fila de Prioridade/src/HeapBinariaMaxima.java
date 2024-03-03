public class HeapBinariaMaxima
{
	private int n;               /* Numero de elementos no heap. */   
	private int tam;             /* Tamanho m�ximo do heap. */
	private int[] vetor;          /* Vetor com elementos. */


	public HeapBinariaMaxima(int tamanho)
	{
		n = 0;
		tam = tamanho;
		vetor = new int[tamanho+1];
	}

	
	public HeapBinariaMaxima(int tamanho, int[] v)
	{
		tam = tamanho;
		vetor = new int[tamanho+1];
		n = tamanho;

		for( int i = 0; i < tamanho; i++ )
			vetor[ i + 1 ] = v[ i ];

		constroiHeap();
	}
	
	public HeapBinariaMaxima(HeapBinariaMinima heapMinima) {
		tam = heapMinima.getTam();
		vetor = new int[heapMinima.getTam()+1];
		n = heapMinima.getTam();
		
		for(int i = 0; !heapMinima.vazia(); i++) {
			vetor[i + 1] = heapMinima.removeMin();
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
	

	public void imprimeTamanho()
	{
		for(int i = 1; i <= tam; i++)
			System.out.print(vetor[i] + " ");
		
		System.out.println();
	}

	
	public int max()
	{
		if (this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MIN_VALUE;
		}

		return vetor[1];
	}
	

	public int removeMax()
	{
		int itemMax;
		
		if(this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MIN_VALUE;
		}

		itemMax = vetor[1];
		vetor[1] = vetor[n];
		n--;
		refaz(1);
		
		return itemMax;
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
			int filhoEsq, filhoDir, maiorFilho;
			
			filhoEsq = 2*i;
			filhoDir = 2*i + 1;
			
			maiorFilho = filhoEsq;
			
			if(filhoDir <= n)
			{
				if(vetor[ filhoDir ] > vetor[ filhoEsq ])
					maiorFilho = filhoDir;
			}

			if(vetor[ maiorFilho ] > x)
				vetor [ i ] = vetor[ maiorFilho ];
			else
				break;

			i = maiorFilho;
		}
		
		vetor[ i ] = x;
	}
	
	private void refaz(int esq, int dir) {
		int x = vetor[esq];
		int filho;
		
		for(; esq*2 <= n; esq = filho) {
			filho = esq*2;
			
			if(filho != dir && vetor[filho+1] > vetor[filho]) {
				filho++;
			}
			
			if(vetor[filho] > x) {
				vetor[esq] = vetor[filho];
			}else {
				break;
			}
		}
		
		vetor[esq] = x;
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

		while(x > vetor[pos/2])
		{
			vetor[pos] = vetor[ pos/2 ];
			pos /= 2;
		}
		
		vetor[pos] = x;
	}

	public void heapsort()
	{
		int x;           
		int resta = n;
		int raiz = 1;
		constroiHeap();
		
		while (resta > 1)
		{
			x = vetor[raiz];
			vetor[raiz] = vetor[resta];
			vetor[resta] = x;
			resta--;
			n--;
			refaz(raiz);
		}
	}
	
	public boolean verificaPropriedadeHeap(int[] vetor) {
		
		int verifica = (vetor.length-1)/2;
		
		for(int i = 1; i <= verifica; i++) {
			if(vetor[i] < vetor[i*2]){
				return false;
			}
			
			if((i*2)+1 <= vetor.length-1) {
				if(vetor[i] < vetor[(i*2)+1]){
					return false;
				}
			}
		}
		
		return true;
	}
	
	public int remove(int i) {
		
		if(this.vazia())
		{
			System.out.println("Fila de prioridades vazia!");
			return Integer.MIN_VALUE;
		}
		
		if(i <= 0 || i > tam) {
			return Integer.MIN_VALUE;
		}

		int temp = vetor[i];
		vetor[i] = vetor[1];
		vetor[1] = temp;
		
		return removeMax();
	}

}