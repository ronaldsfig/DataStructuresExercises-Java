package listaSingular;

public class Ex4 extends ListaGenerica<String>{
	
	public Ex4(String frase) {
		insereFrase(frase);
	}
	
	private void insereFrase(String frase) {
		String[] partes = frase.split(" ");
		for(String i: partes) {
			Character c = i.charAt(i.length()-1);
			
			if((c == '.') || (c == ',') || (c == ';') || (c == ':') || (c == '!') || (c == '?')) {
				String subs = i.substring(0, i.length()-1);
				insere(subs);
				insere(c.toString());
			}else {
				insere(i);
			}
			
		}
	}
	
	public String retornaFrase() {
		Elo<String> p;
		Elo<String> ant = null;
		String frase = new String();
		char c;
		
		for(p = prim; p != null; p = p.prox) {
			if(ant == null) {
				frase = p.dado;
			}else {
				c = ant.dado.charAt(ant.dado.length()-1);
				if((c == '.') || (c == ',') || (c == ';') || (c == ':') || (c == '!') || (c == '?')) {
					frase = p.dado+frase;
				}else {
					frase = p.dado+" "+frase;
				}
			}
			
			ant = p;
		}
		
		return frase;
		
	}
	
}
