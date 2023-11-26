package exercicio1;

import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		SistemaOperacional so = new SistemaOperacional();
		Scanner scanner = new Scanner(System.in);
		int escolha;
		Processo item;

		do
		{
			escolha = so.menu();

			switch(escolha) {
			case 0:
				//N�o faz nada
				break;
			case 1:
				item = new Processo();
				if ( ! so.addProcesso(item) )
					System.out.println("Fila de processos cheia.");
				break;
			case 2:
				item = so.executarProcesso();
				if (item != null)
					System.out.println("Processo executado.");
				else
					System.out.println("Fila de processos vazia.");
				break;
			case 3:
				item = new Processo();
				if ( ! so.addInterrupcao(item) )
					System.out.println("Fila de processos cheia.");
				break;
			case 4:
				item = so.cancelarProcesso();
				if (item != null)
					System.out.println("Processo executado.");
				else
					System.out.println("Fila de processos vazia.");
				break;
			case 5:
				System.out.println("Processos em andamento:");
				so.imprime();
				break;
			}

		}while(escolha != 0);

		scanner.close();
	}
}