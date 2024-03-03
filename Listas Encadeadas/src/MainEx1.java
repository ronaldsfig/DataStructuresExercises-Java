import listaSingular.Lista;

public class MainEx1 {
	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.insere(1);
		lista.insere(2);
		lista.insere(3);
		lista.insere(4);
		lista.insere(5);
		
		lista.remove(2);
		lista.remove(4);
		
		System.out.println(lista.tamanhoEx1());
	}
}
