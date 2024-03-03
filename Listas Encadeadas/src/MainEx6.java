import listaSingular.Arquivo;
import listaSingular.Diretorios;

public class MainEx6 {
	public static void main(String[] args) {
		// Para mudar a busca só mudar o diretório (nó) em buscaPorProfundidade lá embaixo//
		Diretorios<Object> No0 = new Diretorios<>("C:/");
		
		Diretorios<Object> No1 = new Diretorios<>("Jogos");
		Diretorios<Object> No2 = new Diretorios<>("Faculdade");
		Diretorios<Object> No3 = new Diretorios<>("Filmes");
		
		Arquivo No11 = new Arquivo("Campo Minado");
		Arquivo No12 = new Arquivo("Paciência");
		Arquivo No13 = new Arquivo("World of Warcraft");
		Diretorios<Object> No21 = new Diretorios<>("EDD1");
		Diretorios<Object> No22 = new Diretorios<>("EDD2");
		Diretorios<Object> No23 = new Diretorios<>("AA");
		Diretorios<Object> No24 = new Diretorios<>("ACEs");
		Diretorios<Object> No25 = new Diretorios<>("TPD");
		Diretorios<Object> No31 = new Diretorios<>("Super-Heróicos");
		Diretorios<Object> No32 = new Diretorios<>("Drama");
		Diretorios<Object> No33 = new Diretorios<>("Comédias Românticas");
		
		Diretorios<Object> No241 = new Diretorios<>("ACE1");
		Diretorios<Object> No242 = new Diretorios<>("ACE2");
		Diretorios<Object> No243 = new Diretorios<>("ACE3");
		Diretorios<Object> No311 = new Diretorios<>("Marvel");
		Diretorios<Object> No312 = new Diretorios<>("DC");
		Arquivo No321 = new Arquivo("Brilho Eterno de Uma Mente Sem Lembranças");
		Diretorios<Object> No331 = new Diretorios<>("(Pasta Vazia)");
		
		Arquivo No3111 = new Arquivo("Vingadores");
		Arquivo No3112 = new Arquivo("Homem-Aranha");
		Arquivo No3121 = new Arquivo("Superman");
		
		No0.insere(No3);
		No0.insere(No2);
		No0.insere(No1);
		
		No1.insere(No13);
		No1.insere(No12);
		No1.insere(No11);
		
		No2.insere(No25);
		No2.insere(No24);
		No2.insere(No23);
		No2.insere(No22);
		No2.insere(No21);
		
		No24.insere(No243);
		No24.insere(No242);
		No24.insere(No241);
		
		No3.insere(No33);
		No3.insere(No32);
		No3.insere(No31);
		
		No31.insere(No312);
		No31.insere(No311);
		
		No311.insere(No3112);
		No311.insere(No3111);
		
		No312.insere(No3121);
		
		No32.insere(No321);
		
		No33.insere(No331);
		
		No0.buscaPorProfundidade(No3);
		
	}
}
