import java.util.Scanner;

import listaSingular.Inimigo;
import listaSingular.Personagem;

public class MainEx7 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Personagem personagem = new Personagem(100, 10);
		
		Inimigo minotauro = new Inimigo(18, 7);
		Inimigo orc = new Inimigo(20, 5);
		Inimigo troll = new Inimigo(15, 20);
		
		personagem.insereInimigo(minotauro);
		personagem.insereInimigo(orc);
		personagem.insereInimigo(troll);
		
		int opc = 0;
		do {
			System.out.println("1 - Lutar contra Minotauro");
			System.out.println("2 - Lutar contra Orc");
			System.out.println("3 - Lutar contra Troll");
			System.out.println("0 - Sair");
			System.out.println("Digite a opção desejada:");
			opc = keyboard.nextInt();
			
			switch(opc) {
				case 1:
					if(personagem.localizarInimigo(minotauro) != null) {
						int vidaInimigo = personagem.atacaInimigo(minotauro, (int)personagem.getDanoPorSegundo());
						if(vidaInimigo > 0) {
							System.out.println(personagem.getDanoPorSegundo()+" de dano causado. Vida do minotauro: "+vidaInimigo);
						}else {
							System.out.println("Minotauro morto! Ele foi removido da lista.");
						}
					}else {
						System.out.println("Inimigo não localizado.");
					}
				break;
			
				case 2:
					if(personagem.localizarInimigo(orc) != null) {
						int vidaInimigo = personagem.atacaInimigo(orc, (int)personagem.getDanoPorSegundo());
						if(vidaInimigo > 0) {
							System.out.println(personagem.getDanoPorSegundo()+" de dano causado. Vida do Orc: "+vidaInimigo);
						}else {
							System.out.println("Orc morto! Ele foi removido da lista.");
						}
					}else {
						System.out.println("Inimigo não localizado.");
					}
				break;
			
				case 3:
					if(personagem.localizarInimigo(troll) != null) {
						int vidaInimigo = personagem.atacaInimigo(troll, (int)personagem.getDanoPorSegundo());
						if(vidaInimigo > 0) {
							System.out.println(personagem.getDanoPorSegundo()+" de dano causado. Vida do troll: "+vidaInimigo);
						}else {
							System.out.println("Troll morto! Ele foi removido da lista.");
						}
					}else {
						System.out.println("Inimigo não localizado.");
					}
				break;
				
				default:
				break;
			}
			
		}while(opc != 0);
	}
}
