package listaSingular;

public class Diretorios<T> extends ListaGenerica<T>{
	
	private String nome;
	
	public Diretorios(String nome){
		super();
		this.nome = nome;
	}
	
	public boolean buscaPorProfundidade(Diretorios<?> alvo) {
        return buscaPorProfundidade(prim, alvo);
    }

	private boolean buscaPorProfundidade(Elo<T> p, Diretorios<?> alvo) {
	    Elo<T> q = p;

	    while (q != null) {
	        if (q.dado == alvo) {
	            imprimePorProfundidade((Diretorios<T>) q.dado, "");
	            return true;
	        }
	        
	        if (q.dado instanceof Diretorios<?>) {
	            Diretorios<T> d = (Diretorios<T>) q.dado;
	            if (buscaPorProfundidade(d.getPrim(), alvo)) {
	                return true;
	            }
	        }
	        
	        q = q.prox;
	    }

	    return false;
	}
    
    private boolean imprimePorProfundidade(Diretorios<T> dir, String prefixo) {
    	Elo<T> p = dir.prim;
    	System.out.println(prefixo + dir.nome);
    	
    	while(p != null) {
            if(p.dado instanceof Diretorios<?>) {
            	Diretorios<T> d = (Diretorios<T>) p.dado; 
            	imprimePorProfundidade(d, prefixo+"\t");
            	p = p.prox;
            }else if (p.dado instanceof Arquivo){
            	Arquivo a = (Arquivo) p.dado;
            	System.out.println(prefixo + "\t" + a.getNome());;
                p = p.prox;
            }
    	}
    	
    	return true;
    }
    
	
}

