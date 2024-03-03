package listaSingular;

public class Ex5 extends ListaGenerica<ListaLetras>{
	
	public Ex5(String frase) {
		insereFrase(frase);
	}

	private void insereFrase(String frase) {
		String[] partes = frase.split(" ");
		for(String i: partes) {
			Character c = i.charAt(i.length()-1);
			
			if((c == '.') || (c == ',') || (c == ';') || (c == ':') || (c == '!') || (c == '?')) {
				String subs = i.substring(0, i.length()-1);
				insere(new ListaLetras(subs));
				insere(new ListaLetras(c.toString()));
			}else {
				insere(new ListaLetras(i));
			}
			
		}
	}
	
	public String retornaFrase() {
		Elo<ListaLetras> p;
		Elo<ListaLetras> ant = null;
		String frase = new String();
		char c;
		
		for(p = prim; p != null; p = p.prox) {
			if(ant == null) {
				frase = p.dado.retornaLetrasInvertidas();
			}else {
				c = ant.dado.retornaLetraPrim();
				if((c == '.') || (c == ',') || (c == ';') || (c == ':') || (c == '!') || (c == '?')) {
					frase = frase+p.dado.retornaLetrasInvertidas();
				}else {
					frase = frase+" "+p.dado.retornaLetrasInvertidas();
				}
			}
			
			ant = p;
		}
		
		return frase;
		
	}
}
