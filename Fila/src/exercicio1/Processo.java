package exercicio1;
import java.util.Random;
import java.time.LocalTime;

public class Processo {

	private int identificador;
	private LocalTime tempo;
	
	public Processo() {
		Random rand = new Random();
		
		identificador = rand.nextInt(1000);
		tempo = LocalTime.now();
		}
	
	public int getIdentificador() {
		return this.identificador;
	}
	
	public LocalTime getTempo() {
		return this.tempo;
	}
}
