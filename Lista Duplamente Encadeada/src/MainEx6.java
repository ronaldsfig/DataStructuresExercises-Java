import listaDuplamente.Atendente;

public class MainEx6 {
	public static void main(String[] args) {
		Atendente atendente = new Atendente("Ronaldo");
		atendente.addChamadaNaLinha(11984762542L, 434);
		atendente.addChamadaNaLinha(21996627850L, 131);
		atendente.addChamadaNaLinha(13974431177L, 528);
		atendente.addChamadaNaLinha(21982401509L, 159);
		atendente.addChamadaNaLinha(21998547762L, 131);
		
		atendente.exibirLinhaTelefonica();
		
		atendente.atenderChamadaDaLinha();
		atendente.atenderChamadaDaLinha();
		
		atendente.exibirLinhaTelefonica();
	}
}
