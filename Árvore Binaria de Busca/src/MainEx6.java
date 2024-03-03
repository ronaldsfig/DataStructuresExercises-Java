public class MainEx6
{
	public static void main(String args[])
	{
		ArvBinBusca<Integer, String> arvoreBinaria1 = new ArvBinBusca<>();
		ArvBinBusca<Integer, String> arvoreBinaria3 = new ArvBinBusca<>();
		
		arvoreBinaria1.put(4, "");
		arvoreBinaria1.put(9, "");
		arvoreBinaria1.put(15, "");
		arvoreBinaria1.put(16, "");
		arvoreBinaria1.put(7, "");
		arvoreBinaria1.put(8, "");
		arvoreBinaria1.put(6, "");
		arvoreBinaria1.put(2, "");
		arvoreBinaria1.put(1, "");
		arvoreBinaria1.put(3, "");
		
		arvoreBinaria3.put(7, "");
		arvoreBinaria3.put(9, "");
		arvoreBinaria3.put(15, "");
		arvoreBinaria3.put(16, "");
		arvoreBinaria3.put(13, "");
		arvoreBinaria3.put(5, "");
		arvoreBinaria3.put(6, "");
		arvoreBinaria3.put(3, "");
		arvoreBinaria3.put(1, "");
		arvoreBinaria3.put(0, "");
		arvoreBinaria3.put(2, "");
		
		System.out.println("A árvore 1 é balanceada?");
		System.out.println(arvoreBinaria1.eBalanceada());
		
		System.out.println("A árvore 3 é balanceada?");
		System.out.println(arvoreBinaria3.eBalanceada());
	}
	
}