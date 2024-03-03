import listaDuplamente.ListaCircularDuplamente;
import listaDuplamente.ListaDuplamente;

public class Main {
	public static void main(String args[]) {
		ListaDuplamente lista = new ListaDuplamente();
		lista.insere(5);
		lista.insere(4);
		lista.insere(3);
		lista.insere(2);
		lista.insere(1);
	
		lista.imprime();

	}
}
