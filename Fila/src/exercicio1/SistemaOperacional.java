package exercicio1;
import java.util.Scanner;

public class SistemaOperacional {
	private FilaDuplaGenerica<Processo> processos;
	
	public SistemaOperacional() {
		this.processos = new FilaDuplaGenerica<>(4);
	}
	
	public boolean addProcesso(Processo processo) {
		return processos.insere(processo);
	}
	
	public Processo executarProcesso() {
		return (Processo) processos.remove();
	}
	
	public boolean addInterrupcao(Processo processo) {
		return processos.insereInicio(processo);
	}
	
	public Processo cancelarProcesso() {
		return (Processo) processos.removeFim();
	}
	
	public void imprime() {
		int i, j;
		
		if(processos.vazia())
			System.out.println("Fila est� vazia");
		else
			for (i = processos.getIni(), j = 1; j <= processos.getN(); j = j + 1, i = (i + 1) % processos.getTamanho()) {
			    Object elemento = processos.getVetor().get(i);
			    if (elemento instanceof Processo) {
			        Processo processo = (Processo) elemento;
			        System.out.println(j + " - Id: " + processo.getIdentificador() + " | Adicionado em: " + processo.getTempo());
			    }
			}
	}

	public int menu() {
		Scanner scanner = new Scanner(System.in);
		int escolha;
		
		System.out.println("--------------------------");
		System.out.println("Selecione a opcao:");
		System.out.println("1. Adicionar processo.");
		System.out.println("2. Executar processo.");
		System.out.println("3. Adicionar interrupção.");
		System.out.println("4. Cancelar último processo.");  
		System.out.println("5. Imprimir processos.");
		System.out.println("0. Fim.");
		System.out.println("Opcao: ");
		escolha = scanner.nextInt();
		
		return escolha;
	}
	
}
