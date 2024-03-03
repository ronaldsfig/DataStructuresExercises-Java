package listaSingular;

public class ListaGenerica<T>
{
	protected Elo<T> prim;
	
	protected class Elo<T> implements Comparable<T>
	{
		protected T dado;
		protected Elo<T> prox;
		
		public Elo()
		{
			prox = null;
		}
		
		public Elo(T elem)
		{
			dado = elem;
			prox = null;
		}
		
		public Elo(T elem, Elo<T> proxElem)
		{
			dado = elem;
			prox = proxElem;
		}
		
		public int compareTo(T obj) {
			// TODO Auto-generated method stub
			return 0;
		}
	}
	
	
	public ListaGenerica()
	{
		prim = null;
	}
	
	
	public boolean vazia()
	{
		return prim == null;
	}
	
	
	public void insere(T novo)
	{
		Elo<T> p = new Elo<T>(novo);
		p.prox = prim;
		prim = p;
	}
	

	public boolean busca(T elem)
	{
		Elo<T> p;
		
		for(p = prim; p != null; p = p.prox)
		{
			if(p.dado == elem)
				return true;
		}
		
		return false;
	}


	public boolean remove(T elem)
	{
		Elo<T> p;
		Elo<T> ant = null;
		
		for(p = prim; ((p != null) && (p.dado != elem)); p = p.prox)
			ant = p;
		

		if (p == null)
			return false;
		
		if (p == prim)
			prim = prim.prox;
		else
			ant.prox = p.prox;
		

		p = null;
		
		return true;
	}
	
	
	public void imprime()
	{
		Elo<T> p;
		
		System.out.println("Elementos da lista:");
		
		for(p = prim; p != null; p = p.prox)
		{
			System.out.print(p.dado + " ");
		}
		
		System.out.println();
	}
	
	public int tamanho()
	{
		int tam = 0;
		Elo<T> p = prim;
		
		while(p != null)
		{
			tam++;
			p = p.prox;
		}
		
		return tam;
	}
	
	public Elo<T> getPrim(){
		return prim;
	}

}