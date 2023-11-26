package listaSingular;

public class ListaOrdenada extends Lista
{
	/* Insere elemento na lista na posi��o adequada, mantendo-a ordenada. */
	public void insere(int novo)
	{
		Elo p, q;
		Elo ant = null;
		
		q = new Elo(novo);
		
		for (p = prim; ((p != null) && (p.dado < novo)); p = p.prox)
			ant = p;
		
		if (ant == null)
			prim = q;
		else
			ant.prox = q;
		
		q.prox = p;
	}

	/* Remove da lista o primeiro elemento com valor igual a �elem". Ret. true se removeu. */
	public boolean remove(int elem)
	{
		Elo p;
		Elo ant = null; /* refer�ncia para anterior */
		
		for(p = prim; ((p != null) && (p.dado < elem)); p = p.prox)
			ant = p;
		
		/* Se p � null ou p.dado != elem, ent�o n�o encontrou elemento. */
		if ((p == null) || (p.dado != elem))
			return false;
		
		if (p == prim)
			prim = prim.prox; /* Remove elemento do in�cio. */
		else
			ant.prox = p.prox;  /* Remove elemento do meio. */
		
		/* Remove a �ltima refer�ncia para o elo a ser removido. Dessa forma,
		 * o Garbage Collector ir� liberar essa mem�ria. */
		p = null;
		
		return true;
	}
	
	public static ListaOrdenada IntercalarListasOrdenadas(ListaOrdenada l1, ListaOrdenada l2) {
		ListaOrdenada listaResultante = new ListaOrdenada();
		Elo p = l1.prim;
		Elo q = l2.prim;
		
		while((p != null) || (q != null)) {
			if(p != null) {
				listaResultante.insere(p.dado);
				p = p.prox;
			}
			if(q != null) {
				listaResultante.insere(q.dado);
				q = q.prox;
			}
		}
		
		return listaResultante;
		
	}
	
	
	
}