package listaDuplamente;

public class Atendente {
	private String nome;
	private LinhaTelefonica linhaTelefonica;
	
	public Atendente(String nome) {
		this.nome = nome;
		this.linhaTelefonica = new LinhaTelefonica();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void addChamadaNaLinha(long numero, int distancia) {
		linhaTelefonica.insere(numero, distancia);
	}
	
	public void atenderChamadaDaLinha() {
		linhaTelefonica.atenderChamada();
	}
	
	public void exibirLinhaTelefonica() {
		linhaTelefonica.imprime();
	}
}
