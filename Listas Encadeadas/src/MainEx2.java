import listaSingular.ListaOrdenada;

public class MainEx2 {
	public static void main(String[] args) {
		ListaOrdenada l1 = new ListaOrdenada();
		ListaOrdenada l2 = new ListaOrdenada();
		
		l1.insere(0);
		l1.insere(2);
		l1.insere(4);
		l1.insere(6);
		
		l2.insere(1);
		l2.insere(3);
		l2.insere(5);
		l2.insere(7);
		
		ListaOrdenada l3 = ListaOrdenada.IntercalarListasOrdenadas(l1, l2);
		l3.imprime();
		
	}
}
