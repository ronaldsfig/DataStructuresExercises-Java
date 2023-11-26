package exercicio1;

public class FilaDuplaGenerica<T> extends FilaGenerica<Object>
{
	public FilaDuplaGenerica(int tam)
	{
		super(tam);
	}
	
	public boolean insereInicio(T elemento)
	{
		int prec;
		
		if (!cheia())
		{
			/* Insere na posi��o precedente ao in�cio */
			prec = (ini - 1 + tamanho) % tamanho;
			vetor.add(prec, elemento);
			ini = prec; /* Atualiza �ndice para in�cio */
			n++;
			return true;
		} 
		else
			return false;
	}
	
	public T removeFim()
	{
		T elemento;
		int ult;

		if (!this.vazia())
		{
			/* Retira o �ltimo elemento */
			ult = (ini + n - 1) % tamanho;
			elemento = (T) vetor.get(ult);
			n--;
			return elemento;
		} 
		
		return null;
	}
}
