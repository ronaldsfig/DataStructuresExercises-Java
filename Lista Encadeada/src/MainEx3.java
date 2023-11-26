import listaSingular.ListaGenericaOrdenada;

public class MainEx3 {
	public static void main(String[] args) {
		ListaGenericaOrdenada<String> lista = new ListaGenericaOrdenada<String>();
		lista.insereNome("Ana");
		lista.insereNome("Ronaldo");
		lista.insereNome("Bianca");
		lista.insereNome("Abel");
		lista.insereNome("Max");
		lista.insereNome("Fernando");
		
		lista.imprime();
	}
}
