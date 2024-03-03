package listaSingular;

public class ListaLetras extends ListaGenerica<Character>{

	public ListaLetras(String palavra) {
		insereLetras(palavra);
	}
	
	private void insereLetras(String palavra) {
		char[] chars = palavra.toCharArray();
		for(char i: chars) {
			insere(i);
		}
		
	}
	
	public char retornaLetraPrim() {
		return prim.dado;
	}
	
	public String retornaLetrasInvertidas() {
		Elo<Character> p;
		StringBuilder fraseTemp = new StringBuilder();
		
		for(p = prim; p != null; p = p.prox) {
			fraseTemp.append(p.dado);
		}
		
		String frase = fraseTemp.toString();
		return frase;
	}
}
