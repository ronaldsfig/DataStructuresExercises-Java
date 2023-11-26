import java.util.Vector;

public class PilhaGenerica<T> implements Comparable<T>
{
	private int n;
	private Vector<T> vetor;
	private int topo;
	
	public PilhaGenerica(int tamanho)
	{		
		n = tamanho;
		vetor = new Vector<T>(tamanho);
		topo = -1;
	}

	public boolean vazia()
	{
		return topo == -1 ? true : false; 
	}
	
	public boolean cheia()
	{
		return topo == n - 1 ? true : false;
	}
	
	public T pop()
	{
		T elemento;
		
		if (!this.vazia())
		{
			elemento = vetor.get(topo--);
			return elemento;
		}
		else
		{
			//Impress�o para fins did�ticos
			//System.out.println("Pilha vazia: pop nao funcionou.");
			return null;
		}
	}
	
	public boolean push(T elemento)
	{
		if (!this.cheia())
		{
			vetor.add(++topo, elemento);
			return true;
		}
		else
		{
			//Impress�o para fins did�ticos
			//System.out.println("Pilha cheia: push nao funcionou.");
			return false;
		}
	}
	
	public T retornaTopo()
	{
		T elemento;
		
	     if(!this.vazia()){
	        elemento = vetor.get(topo);         
	        return elemento;
	     }
	     else
	    	 //System.out.println("Pilha Vazia: não há elemento no topo.");
	    	 return null;
	}	
	
	
	// Método adicional para a realização do Ex3 //
	public int retornaTopoLength() {
		return topo+1;
	}
	
	// Método adicional para a realização do Ex4 //
	@Override
	public boolean equals(Object obj) {
		if(!this.vazia()) {
			T elementoDoTopo = this.retornaTopo();
			return elementoDoTopo.equals(obj);
		}else {
			return false;
		}
	}
	
	@Override
	public int compareTo(Object obj) {
		return 0;
	}
}