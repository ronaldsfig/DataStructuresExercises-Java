public class MainEx2
{
	public static void main(String args[])
	{
		// Deixei as figuras das árvores que criei nos exercícios na pasta "Figuras das árvores que criei"
		
		int[] nos = new int[10];
		nos[0] = 4;
		nos[1] = 9;
		nos[2] = 15;
		nos[3] = 16;
		nos[4] = 7;
		nos[5] = 8;
		nos[6] = 6;
		nos[7] = 2;
		nos[8] = 1;
		nos[9] = 3;
		
		ArvBinBusca<Integer, Integer> arvoreBinaria1 = ArvBinBusca.constroiArvore(nos);
		arvoreBinaria1.mostra();
		
	}
	
}