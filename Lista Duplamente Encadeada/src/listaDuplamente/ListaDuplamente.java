package listaDuplamente;

public class ListaDuplamente
{
	/* Refer�ncia para primeiro elemento */
	protected Elo prim;
	
	protected class Elo
	{
		protected int dado;
		protected Elo ant;
		protected Elo prox;
		
		public Elo()
		{
			ant = null;
			prox = null;
		}
		
		public Elo(int elem)
		{
			dado = elem;
			ant = null;
			prox = null;
		}
		
		public Elo(int elem, Elo antElem, Elo proxElem)
		{
			dado = elem;
			ant = antElem;
			prox = proxElem;
		}
	}
	
	public ListaDuplamente()
	{
		prim = null;
	}
	
	/* Testa se a lista est� vazia. */
	public boolean vazia()
	{
		return prim == null;
	}
	
	/* Insere elemento no in�cio da lista. */
	public void insere(int novo)
	{
		Elo p;
		
		p = new Elo(novo);
		
		p.prox = prim;
		
		p.ant = null;
		
		if (prim != null)
			prim.ant = p;
		
		prim = p;
	}
	
	/* M�todo auxiliar para busca. */
	private Elo busca(int elem)
	{
		Elo p = null;
		
		for( p = prim; ((p != null) && (p.dado != elem)); p = p.prox);

		return p;      
	}
	
	/* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
	public boolean remove(int elem)
	{
		Elo p = null;
		p = busca(elem);

		if (p == null) return false;

		/* Retira primeiro elemento */
		if (p == prim) 
			prim = prim.prox;
		else 
			/* Retira elemento do meio */
			p.ant.prox = p.prox;

		/* Testa se � ultimo elemento */  
		if (p.prox != null)
			p.prox.ant = p.ant;

		p = null;

		return true;
	}
	
	/* Imprime todos os elementos da lista. */
	public void imprime()
	{
		Elo p;
		
		System.out.println("Elementos da lista:");
		
		for(p = prim; p != null; p = p.prox)
		{
			System.out.print(p.dado + " ");
		}
		
		System.out.println();
	}
	
	/* Imprime todos os elementos da lista em ordem reversa. */
	public void imprimeReversa()
	{
		Elo p;
		Elo ult = null;
		
		System.out.println("Elementos da lista em ordem reversa:");
		
		p = prim;
		
		while(p != null)
		{
			ult = p;
			p = p.prox;
		}
		
		for(p = ult; p != null; p = p.ant)
		{
			System.out.print(p.dado + " ");
		}
		
		System.out.println();
	}
	
	/* Resolu��o da quest�o 4 da lista auxiliar de Lista Encadeada. */
	public static ListaDuplamente concatena(ListaDuplamente l1, ListaDuplamente l2)
	{
		Elo p;
		
		/* Verifica se a lista l1 � vazia. */
		if(l1.prim == null)
		{
			l1.prim = l2.prim;
		}
		else
		{
			/* Primeiramente, precisamos obter o �ltimo elo da lista l1. */
			for(p = l1.prim; p.prox != null; p = p.prox);

			/* Faz o "prox" do �ltimo elemento da lista l1, apontado por "p",
			 * apontar para o "prim" da lista l2. */
			p.prox = l2.prim;
			
			/* Faz o "ant" do "prim" da lista l2 apontar para o �ltimo elemento da
			 * lista l1, apontado por "p". */
			l2.prim.ant = p;
		}
		
		/* Nesse ponto, os elementos de l2 j� est�o encadeados ao final de l1,
		 * como desejado. Assim, vamos deixar a lista l2 vazia. */
		l2.prim = null;
		
		return l1;
	}
	
	public static ListaDuplamente intersecao(ListaDuplamente l1, ListaDuplamente l2) {
		ListaDuplamente l3 = new ListaDuplamente();
		
		Elo p = l1.prim;
		
		while(p != null) {
			Elo q = l2.prim;
			
			while(q != null) {
				if(p.dado == q.dado) {
					l3.insere(p.dado);
				}
				q = q.prox;
			}
			
			p = p.prox;
		}
		
		return l3;
	}
	
	public void trocaElos(int indiceElo1, int indiceElo2) {
		Elo q = null;
		Elo r = null;
		Elo p;
		int i = indiceElo1;
		int j = indiceElo2;
		
		for(p = prim; (p != null) && (i >= 0); p = p.prox, i -= 1){
			q = p;
		}
		
		for(p = prim; (p != null) && (j >= 0); p = p.prox, j -= 1){
			r = p;
		}

	    if(q == null || r == null){
	        System.out.println("Um dos elos não foi encontrado");
	        return;
	    }

	    if(q.prox == r){
	        q.ant = r;
	        r.prox = q;
	        q.prox = r.prox;
	        r.ant = q.ant;
	        q.prox.ant = q;
	        r.ant.prox = r;
	    }else if(r.prox == q) {
	        r.ant = q;
	        q.prox = r;
	        r.prox = q.prox;
	        q.ant = r.ant;
	        r.prox.ant = r;
	        q.prox.ant = q;
	    }else{
	        Elo tempAntQ = q.ant;
	        Elo tempProxQ = q.prox;
	        Elo tempAntR = r.ant;
	        Elo tempProxR = r.prox;

	        q.ant = tempAntR;
	        r.ant = tempAntQ;
	        q.prox = tempProxR;
	        r.prox = tempProxQ;

	        if(tempProxQ != null){
	            tempProxQ.ant = r;
	        }
	        if(tempProxR != null){
	            tempProxR.ant = q;
	        }
	        if(tempAntQ != null){
	            tempAntQ.prox = r;
	        }
	        if(tempAntR != null){
	            tempAntR.prox = q;
	        }
	    }

	    if(q == prim){
	        prim = r;
	    }else if(r == prim) {
	        prim = q;
	    }

	    this.imprime();
	    System.out.println();
		
	}
	
	public boolean verificaIgualdade(ListaDuplamente lista2) {
		return verificaIgualdade(prim, lista2.prim);
	}
	
	public boolean verificaIgualdade(Elo p, Elo q) {
		Elo x = p;
		Elo y = q;
		
		if((x != null) && (y != null)) {
			if(x.dado == y.dado) {
				return verificaIgualdade(x.prox, y.prox);
			}else {
				return false;
			}
		}else if((x == null) && (y == null)){
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean removeTodasCopias(int k) {
		Elo p;
		boolean sucesso = false;
		
		for(p = prim; p != null; p = p.prox) {
			if(p.dado == k) {
				if(p == prim) {
					prim = prim.prox;
					if(prim != null) {
						prim.ant = null;
					}
				}else {
					if(p.prox != null) {
						p.ant.prox = p.prox;
						p.prox.ant = p.ant;
					}else {
						p.ant.prox = null;
					}
				}
				sucesso = true;
			}
		}
		
		return sucesso;
		
	}
	
}