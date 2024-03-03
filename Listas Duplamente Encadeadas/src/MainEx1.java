import listaDuplamente.ListaDuplamente;

public class MainEx1 {
	public static void main(String[] args) {
		ListaDuplamente l1 = new ListaDuplamente();
		ListaDuplamente l2 = new ListaDuplamente();
		
		l1.insere(1);
		l1.insere(5);
		l1.insere(3);
		l1.insere(4);
		l1.insere(2);

		l2.insere(1);
		l2.insere(7);
		l2.insere(4);
		l2.insere(9);
		l2.insere(3);
		
		System.out.println("LISTA 1");
		l1.imprime();
		
		System.out.println("");
		System.out.println("LISTA 2");
		l2.imprime();
		
		ListaDuplamente l3 = ListaDuplamente.intersecao(l1, l2);
		System.out.println("");
		System.out.println("LISTA 3");
		l3.imprime();

	}

}
