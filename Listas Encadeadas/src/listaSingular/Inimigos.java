package listaSingular;

public class Inimigos extends ListaGenerica<Inimigo>{
	public Inimigos() {
		super();
	}
	
	public void inserir(Inimigo inimigo) {
		Elo<Inimigo> p = new Elo<>(inimigo);
		p.prox = prim;
		prim = p;
	};
	
	
	public Inimigo localizar(Inimigo inimigo) {
		Elo<Inimigo> p;
		
		for(p = prim; p != null; p = p.prox)
		{
			if(p.dado == inimigo)
				return p.dado;
		}
		
		return null;
	};
	
	public int efetuarDano(Inimigo inimigo, double dano) {
		Elo<Inimigo> p;
		
		for(p = prim; p != null; p = p.prox)
		{
			if(p.dado == inimigo) {
				p.dado.setVida(p.dado.getVida()-(int)dano);
				if(p.dado.getVida() <= 0) {
					remove(inimigo);
				}
				return p.dado.getVida();			
			}
		}
		
		return Integer.MIN_VALUE;
	};

}
