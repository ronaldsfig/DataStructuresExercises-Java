package exercicio4;

import filaCircularDupla.FilaDupla;
import filaCircularSimples.Fila;

public class Main {
	public static void main(String[] args) {
		Fila fila = new Fila(3);
		fila.insere(1);
		fila.insere(2);
		fila.insere(3);
		
		FilaDupla filaDupla = Fila.implementaFilaDupla(fila);
		filaDupla.imprime();
		
	}
}
