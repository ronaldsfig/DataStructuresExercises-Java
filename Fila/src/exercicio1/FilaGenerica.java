package exercicio1;

import java.util.Vector;

public class FilaGenerica<T>
{
	/* Atributos protected para serem usados na subclasse. */
	protected int tamanho;	/* Tamanho do vetor */
	protected Vector<T> vetor;	/* Vetor de elementos */
	protected int ini;	/* Posicao do proximo elemento a ser retirado */
	protected int n;	/* Numero de elementos na fila */
	
	public FilaGenerica(int tam)
	{
		tamanho = tam;
		vetor = new Vector<T>(tamanho);
		ini = 0;
		n = 0;
	}
	
	public boolean vazia()
	{
		return (n == 0);
	}
	
	public boolean cheia()
	{
		return (n == tamanho);
	}
	
	//Retiramos o elemento do in�cio da fila
	public T remove()
	{
		T elemento;
		
		if (!this.vazia())
		{
			elemento = vetor.get(ini);
			ini = (ini + 1) % tamanho;
			n--;
			return elemento;
		} 

		return null;
	}
	
	//Inserimos o elemento no final da fila
	public boolean insere(T elemento)
	{
	  int fim;
	  
	  if ( !cheia() ) {
	    fim = (ini + n) % tamanho;
	    vetor.add(fim, elemento);
	    n++;
	    return true;
	  } 
	  else
	    return false;
	}
	
	public int getTamanho() {
		return this.tamanho;
	}
	
	public int getIni() {
		return this.ini;
	}
	
	public int getN() {
		return this.n;
	}
	
	public Vector<T> getVetor() {
		return this.vetor;
	}
}