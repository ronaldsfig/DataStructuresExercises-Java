import listaDuplamente.ListaDuplamente;

public class MainEx4 {
	public static void main(String[] args) {
		ListaDuplamente lista = new ListaDuplamente();
		
		lista.insere(7);
		lista.insere(19);
		lista.insere(44);
		lista.insere(3);
		lista.insere(8);
		
		lista.imprime();
		lista.trocaElos(1, 3);
	}
}
