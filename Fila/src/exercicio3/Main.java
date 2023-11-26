package exercicio3;

public class Main {
	public static void main(String[] args) {
		PilhaGenerica<?> p1 = new PilhaGenerica<>(3);
		FilaGenerica<?> f1 = new FilaGenerica<>(3);
		
		FilaGenerica<PilhaGenerica<?>> filaDePilhas = new FilaGenerica<PilhaGenerica<?>>(3);
		FilaGenerica<FilaGenerica<?>> filaDeFilas = new FilaGenerica<FilaGenerica<?>>(3);
		PilhaGenerica<FilaGenerica<?>> pilhaDeFilas = new PilhaGenerica<FilaGenerica<?>>(3);
		
		System.out.println("Fila de Pilhas:");
		filaDePilhas.insere(p1);
		filaDePilhas.insere(p1);
		filaDePilhas.insere(p1);
		filaDePilhas.imprime();
		
		System.out.println("Fila de Filas:");
		filaDeFilas.insere(f1);
		filaDeFilas.insere(f1);
		filaDeFilas.insere(f1);
		filaDePilhas.imprime();
		
		System.out.println("Pilha de Filas:");
		pilhaDeFilas.push(f1);
		pilhaDeFilas.push(f1);
		pilhaDeFilas.push(f1);
		while(!pilhaDeFilas.vazia()) {
			System.out.println(pilhaDeFilas.pop());
		}
		
	}

}
