package listaSingular;

public class ListaGenericaOrdenada<T> extends ListaGenerica<T>{
	
	public class EloNome extends Elo<T> implements Comparable<T>{
		public EloNome()
		{
			super();
		}
		
		public EloNome(T elem)
		{
			super(elem);
		}
		
		public EloNome(T elem, Elo<T> proxElem)
		{
			super(elem, proxElem);
		}
		
		@Override
		public int compareTo(T str) {
			String nome1 = (String) dado;
			String nome2 = (String) str;
			int tamanho1 = nome1.length();
		    int tamanho2 = nome2.length();
		    int tamanhoMin = Math.min(tamanho1, tamanho2);
			
		    for (int i = 0; i < tamanhoMin; i++) {
		        int char1 = nome1.charAt(i);
		        int char2 = nome2.charAt(i);
		        
		        if(char1 < char2){
		        	return 1;
		        }else if(char1 > char2){
		        	return -1;
		        }
		    }

		    if(tamanho1 < tamanho2){
		        return 1;
		    }else if(tamanho1 > tamanho2){
		        return -1;
		    }else{
		    	return 0;
		    }
		}
	}
	
	
	public void insereNome(T novo)
	{
		EloNome p, q;
		EloNome ant = null;
		
		q = new EloNome(novo);
		
		for (p = (ListaGenericaOrdenada<T>.EloNome) prim; (p != null) && (p.compareTo(novo) > 0); p = (ListaGenericaOrdenada<T>.EloNome) p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;
		
		q.prox = p;
	}

	public boolean removeNome(T elem)
	{
		EloNome p;
		EloNome ant = null;
		
		for(p = (ListaGenericaOrdenada<T>.EloNome) prim; ((p != null) && (p.compareTo(elem) > 0)); p = (ListaGenericaOrdenada<T>.EloNome) p.prox)
			ant = p;
		
		if ((p == null) || (p.dado != elem))
			return false;
		
		if (p == prim)
			prim = prim.prox;
		else
			ant.prox = p.prox;
		
		p = null;
		
		return true;
	}
	
	
}
