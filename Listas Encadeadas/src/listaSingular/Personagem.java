package listaSingular;

public class Personagem {
	private int vida;
	private double danoPorSegundo;
	private Inimigos inimigos;
	
	 public Personagem(int vida, double danoPorSegundo) {
		 this.setVida(vida);
		 this.setDanoPorSegundo(danoPorSegundo);
		 this.inimigos = new Inimigos();
	 }

	 public void setVida(int vida) {
		 this.vida = vida;
	 };
	 
	 public int getVida() {
		 return vida;
	 };
	 
	 public void setDanoPorSegundo(double danoPorSegundo) {
		 this.danoPorSegundo = danoPorSegundo;
	 };
	 
	 public double getDanoPorSegundo() {
		 return danoPorSegundo;
	 };
	 
	 public void insereInimigo(Inimigo inimigo) {
		 inimigos.insere(inimigo);
	 };
	 
	public int atacaInimigo(Inimigo inimigo, int dano) {
		return inimigos.efetuarDano(inimigo, dano);
	 };
	 
	 public Inimigo localizarInimigo(Inimigo inimigo) {
		 return inimigos.localizar(inimigo);
	 }
}
