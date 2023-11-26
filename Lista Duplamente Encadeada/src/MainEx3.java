import listaSingular.ListaCircular;

public class MainEx3 {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		
		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		
		ListaCircular l2 = lista.inverteLista();
		l2.imprime();
	}
}
