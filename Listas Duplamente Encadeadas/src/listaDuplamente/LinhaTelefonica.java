package listaDuplamente;

public class LinhaTelefonica
{
	protected Chamada prim;
	
	protected class Chamada
	{
		protected long numero;
		protected int distancia; //em kilometros
		protected Chamada ant;
		protected Chamada prox;
		
		public Chamada()
		{
			ant = null;
			prox = null;
		}
		
		public Chamada(long num, int dist)
		{
			numero = num;
			distancia = dist;
			ant = null;
			prox = null;
		}
		
		public Chamada(long num, int dist, Chamada antElem, Chamada proxElem)
		{
			numero = num;
			distancia = dist;
			ant = antElem;
			prox = proxElem;
		}
	}
	
	public LinhaTelefonica()
	{
		prim = null;
	}
	
	/* Testa se a lista est� vazia. */
	public boolean vazia()
	{
		return prim == null;
	}
	
	/* Insere elemento no in�cio da lista. */
	public void insere(long novo, int dist)
	{
		Chamada p, q;
		Chamada ult = null;
		
		q = new Chamada(novo, dist);
		
		if (prim == null) {
			prim = q;
			return;
		}
		
		for (p = prim; ((p != null) && (p.distancia >= dist)); p = p.prox) {
			ult = p;
		}
		
		if(p == null) {
			ult.prox = q;
			q.ant = ult;
			return;
		}
		
		if(p.ant == null) {
			p.ant = q;
			q.prox = p;
			prim = q;
		}else {
			p.ant.prox = q;
			q.ant = p.ant;
			p.ant = q;
			q.prox = p;
		}
		
	}
	
	/* M�todo auxiliar para busca. */
	private Chamada busca(long elem)
	{
		Chamada p = null;
		
		for( p = prim; ((p != null) && (p.numero != elem)); p = p.prox);

		return p;      
	}
	
	/* Remove da lista o primeiro elemento com valor igual a "elem". Retorna true se removeu. */
	public boolean remove(long elem)
	{
		Chamada p = null;
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
		Chamada p;
		
		System.out.println("Elementos da lista:");
		
		for(p = prim; p != null; p = p.prox)
		{
			System.out.println("Número: "+ p.numero + " |À uma distância de " + p.distancia + "kms");
		}
		
		System.out.println();
	}
	
	public void atenderChamada() {
		remove(prim.numero);
	}
}
