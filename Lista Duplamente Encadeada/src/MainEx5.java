import listaDuplamente.ListaDuplamente;

public class MainEx5 {
	public static void main(String[] args) {
		ListaDuplamente lista = new ListaDuplamente();
		ListaDuplamente l2 = new ListaDuplamente();
		
		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		lista.insere(5);
		
		l2.insere(1);
		l2.insere(2);
		l2.insere(3);
		l2.insere(4);
		l2.insere(5);
		
		System.out.println(lista.verificaIgualdade(l2));
	}
}
