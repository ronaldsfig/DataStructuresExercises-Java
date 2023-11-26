
public class MainExercicio4 {
	public static void main(String args[]) {
		Exercicios e = new Exercicios(20);
		
		PilhaGenerica<Integer> pilha = new PilhaGenerica<>(10);
		pilha.push(1);
		pilha.push(2);
		pilha.push(3);
		pilha.push(4);
		pilha.push(5);
		pilha.push(6);
		pilha.push(7);
		pilha.push(8);
		
		// Retirar o número 4 da pilha //
		PilhaGenerica<Integer> pilhaResultante = e.Exercicio4(4, pilha);
		while(!pilhaResultante.vazia()) {
			System.out.println(pilhaResultante.pop());
		}
		
	}

}
