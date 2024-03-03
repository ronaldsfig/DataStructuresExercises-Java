import listaSingular.ListaCircular;

public class MainEx2 {
	public static void main(String[] args) {
		ListaCircular lista = new ListaCircular();
		lista.insere(1);
		lista.insere(3);
		lista.insere(5);
		lista.insere(7);
		lista.insere(9);
		
		ListaCircular l2 = new ListaCircular();
		l2.insere(2);
		l2.insere(4);
		l2.insere(6);
		l2.insere(8);
		l2.insere(10);
		
		ListaCircular merge = lista.merge(l2);
		merge.imprime();
	}
}
