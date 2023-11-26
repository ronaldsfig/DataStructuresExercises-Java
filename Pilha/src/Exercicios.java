import java.util.Scanner;

public class Exercicios {
	private String expressao;
	private Scanner keyboard;
	private int tamanhoPilhas;
	
	public Exercicios(int tamanho) {
		expressao = new String();
		keyboard = new Scanner(System.in);
		tamanhoPilhas = tamanho;
	}
	
	public void lerExpressao() {
		System.out.println("Entre com a expressao: ");
		expressao = keyboard.nextLine();
	}
	
	public void Exercicio1() {
	    PilhaGenerica<Character> pilha = new PilhaGenerica<>(tamanhoPilhas);
	    this.lerExpressao();
	    boolean desempilhar = false;

	    for (int i = 0; i < expressao.length(); i++) {
	        char c = expressao.charAt(i);

	        if ((c == 'A') || (c == 'B')) {
	            if (desempilhar == false) {
	                pilha.push(c);
	            } else {
	                char r = pilha.pop();
	                if (c != r) {
	                    System.out.println("FALSO: y não é o inverso de x");
	                    break;
	                }
	            }
	        } else if (c == 'C') {
	            if (i != expressao.length() - 1) {
	                desempilhar = true;
	            }
	        }
	        if ((i == expressao.length() - 1) && (desempilhar == true)) {
	            System.out.println("VERDADEIRO: y é o inverso de x");
	        }
	    }
	}
	
	public void Exercicio2() {
		PilhaGenerica<Character> pilha = new PilhaGenerica<>(tamanhoPilhas);
		PilhaGenerica<Character> pilha2 = new PilhaGenerica<>(tamanhoPilhas);
		this.lerExpressao();
		boolean desempilhar = false;
		int topo = 0;
		int topoFixo = 0;
		int qualPilha = 0;
		
		for(int i=0; i<expressao.length(); i++) {
			char c = expressao.charAt(i);
			char r;
			
			if((c=='A') || (c=='B')){
				if(desempilhar==false) {
					pilha.push(c);
				}else if(qualPilha == 0){
					r = pilha.pop();
					
					if(c != r) {
						System.out.println("FALSO: y não é o inverso de x");
						break;
					}else {
						pilha2.push(c);
						
						topo -= 1;
						if(topo == 0) {
							qualPilha = 1;
							topo = topoFixo;
						}
					}
				}else if(qualPilha == 1) {
					r = pilha2.pop();
					
					if(c != r) {
						System.out.println("FALSO: y não é o inverso de x");
						break;
					}else {
						pilha.push(c);
						topo -= 1;
						if(topo == 0) {
							qualPilha = 0;
							topo = topoFixo;
						}
					}
				}
			}else if(c=='D') {
				if((i != expressao.length()-1) && (desempilhar == false)) {
					topo = i;
					topoFixo = i;
					desempilhar = true;
				}
			}
			if(i == expressao.length()-1 && (desempilhar == true)) {
				System.out.println("VERDADEIRO: y é o inverso de x");
			}
		}
	}
	
	public void Exercicio3() {
		char[] vet = new char[tamanhoPilhas*2];
		PilhaGenerica<Character> pilha = new PilhaGenerica<>(tamanhoPilhas);
		PilhaGenerica<Character> pilha2 = new PilhaGenerica<>(tamanhoPilhas);
		int opc = 0;
		int i = -1;
		int j = tamanhoPilhas-1;
		char c;
		
		do{
			System.out.println("1- Adiciona char na pilha 1");
			System.out.println("2- Adiciona char na pilha 2");
			System.out.println("3- Tirar char na pilha 1");
			System.out.println("4- Tirar char na pilha 2");
			System.out.println("5- Exibir vetor");			
			System.out.println("0- Sair");
			opc = keyboard.nextInt();
			
			switch(opc) {
				case 1:
					System.out.println("Digite o char:");
					c = keyboard.next().charAt(0);
					
					if(!pilha.cheia()) {
						pilha.push(c);
						vet[++i] = c;
					}else {
						if(!pilha2.cheia()) {
							pilha2.push(c);
							vet[++j] = c;
						}
					}
					break;
					
				case 2:
					System.out.println("Digite o char:");
					c = keyboard.next().charAt(0);
					
					if(!pilha2.cheia()) {
						pilha2.push(c);
						vet[++j] = c;
					}else {
						if(!pilha.cheia()) {
						pilha.push(c);
						vet[++i] = c;
						}
					}
					break;
					
				case 3:
					if(!pilha.vazia()) {
						vet[pilha.retornaTopoLength()-1] = '\0';
						--i;
						pilha.pop();
;					}
					break;
					
				case 4:
					if(!pilha2.vazia()) {
						pilha2.pop();
						--j;
						vet[tamanhoPilhas+pilha2.retornaTopoLength()] = '\0';
					}
					break;
				
				case 5:
					for(int p = 0; p<vet.length; p++) {
						System.out.println("Posição "+p+ " - Valor: "+vet[p]);
					}
					break;
				
				default:
					break;
			}
			
		}while(opc != 0);
	}
	
	public <T> PilhaGenerica<T> Exercicio4(T elemento, PilhaGenerica<T> pilha) {
		PilhaGenerica<T> pilhaPrincipal = (PilhaGenerica<T>) pilha;
		PilhaGenerica<T> pilhaAuxiliar = new PilhaGenerica<>(tamanhoPilhas);
		
		while(!pilhaPrincipal.vazia()) {
			T retirado = pilhaPrincipal.pop();
			if(retirado.equals(elemento)) {
				while(!pilhaAuxiliar.vazia()) {
					pilhaPrincipal.push(pilhaAuxiliar.pop());
				}
				return pilhaPrincipal;
			}else {
				pilhaAuxiliar.push(retirado);
			}
		}
		return pilhaPrincipal;
	}
	
	public boolean Exercicio5() {
		PilhaGenerica<Character> pilha = new PilhaGenerica<>(tamanhoPilhas);
		this.lerExpressao();
		char c;
		
		for(int i = 0; i<expressao.length(); i++) {
			c = expressao.charAt(i);
			
			if((c == '(') || (c == '[') || (c == '{')) {
				pilha.push(c);
			}else {
				switch(c) {
					case ')':
						if (pilha.retornaTopo() == '(') {
							pilha.pop();
						}else if((pilha.retornaTopo() == '[') || (pilha.retornaTopo() == '{') || (pilha.retornaTopo() == null)){
							System.out.println("FALSO: Não está balanceado");
							return false;
						}
						break;
					case ']':
						if (pilha.retornaTopo() == '[') {
							pilha.pop();
						}else if((pilha.retornaTopo() == '{') || (pilha.retornaTopo() == '(') || (pilha.retornaTopo() == null)){
							System.out.println("FALSO: Não está balanceado");
							return false;
						}
						break;
					case '}':
						if (pilha.retornaTopo() == '{') {
							pilha.pop();
						}else if((pilha.retornaTopo() == '[') || (pilha.retornaTopo() == '(') || (pilha.retornaTopo() == null)){
							System.out.println("FALSO: Não está balanceado");
							return false;
						}
						break;
					default:
						break;
				}
			}
		}
		
		if(pilha.vazia()) {
			System.out.println("VERDADEIRO: Está balanceado");
			return true;
		}else {
			System.out.println("FALSO: Não está balanceado");
			return false;
		}
		
	}
	
	public void Exercicio6() {
		PilhaGenerica<Character> pilha = new PilhaGenerica<>(tamanhoPilhas);
		lerExpressao();
		StringBuilder novaExpressao = new StringBuilder(expressao.length());
		char c;
		
		for(int i = 0; i<expressao.length(); i++) {
			c = expressao.charAt(i);
			
			if(c == ' ') {
				while(!pilha.vazia()) {
					novaExpressao.append(pilha.pop());
				}
				novaExpressao.append(' ');;
			}else {
				pilha.push(c);
			}
		}
		while(!pilha.vazia()) {
			novaExpressao.append(pilha.pop());
		}
		
		System.out.println(novaExpressao.toString());
		
	}
	
	public void Exercicio7() {
		PilhaGenerica<Character> pilhaInfixa = new PilhaGenerica<>(tamanhoPilhas);
		PilhaGenerica<Integer> pilhaPosfixa = new PilhaGenerica<>(tamanhoPilhas);
		lerExpressao();
		int operandoX, operandoY;
		char c, h;
		
		for(int i = 0; i<expressao.length(); i++) {
			c = expressao.charAt(i);
			
			switch(expressao.charAt(i)) {
				case '(':
					pilhaInfixa.push(c);
					break;
				case ')':
					h = pilhaInfixa.pop();
					while((!pilhaInfixa.vazia()) && (h != '(')) {
						operandoX = pilhaPosfixa.pop();
						operandoY = pilhaPosfixa.pop();
						switch (h) {
						case '*':
							pilhaPosfixa.push(operandoX * operandoY);  break;
						case '+':
							pilhaPosfixa.push(operandoX + operandoY); break;
						case '/':
							pilhaPosfixa.push(operandoY / operandoX);  break;
						case '-':
							pilhaPosfixa.push(operandoY - operandoX);  break;
						}
						h = pilhaInfixa.pop();
					}
					break;
				case '+':
				case '-':
					pilhaInfixa.push(c);
					break;
				case '*':
				case '/':
					pilhaInfixa.push(c);
					break;
				default:
					if(c != ' ') {
						pilhaPosfixa.push(Character.getNumericValue(c));
					}
					break;
			}
		}
		
		System.out.println("Resposta: "+pilhaPosfixa.pop());
		
	}
	
	public void Exercicio8(int n) {
		PilhaGenerica<Integer> pilha = new PilhaGenerica<>(tamanhoPilhas);
		int[] numeros = new int[n];
		int paresOrdenados = 0;
		int elemento;
		
		for(int i = 0; i<numeros.length; i++) {
			numeros[i] = i+1;
			pilha.push(i+1);
		}
		
		while(!pilha.vazia()) {
			elemento = pilha.pop();
			if(pilha.retornaTopo() != null) {
				paresOrdenados += 1;
				System.out.println("("+elemento+","+pilha.retornaTopo()+")");
			}
		}
		
		System.out.println(paresOrdenados+" pares ordenados");
		
	}
	
}
