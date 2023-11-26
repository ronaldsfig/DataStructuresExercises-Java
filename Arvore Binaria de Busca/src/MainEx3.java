public class MainEx3
{
	public static void main(String args[])
	{
		ArvBinBusca<Integer, String> arvoreBinaria1 = new ArvBinBusca<>();
		ArvBinBusca<Integer, String> arvoreBinaria2 = new ArvBinBusca<>();
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
		
		arvoreBinaria2.put(58, "");
		arvoreBinaria2.put(63, "");
		arvoreBinaria2.put(69, "");
		arvoreBinaria2.put(70, "");
		arvoreBinaria2.put(61, "");
		arvoreBinaria2.put(62, "");
		arvoreBinaria2.put(60, "");
		arvoreBinaria2.put(56, "");
		arvoreBinaria2.put(55, "");
		arvoreBinaria2.put(57, "");
		
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
		
		System.out.println("Árvore 1:");
		arvoreBinaria1.mostra();
		
		System.out.println("");
		
		System.out.println("Árvore 2:");
		arvoreBinaria2.mostra();
		
		System.out.println("");
		
		System.out.println("Árvore 3:");
		arvoreBinaria3.mostra();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Semelhança entre 1 e 2:");
		System.out.println(arvoreBinaria1.eSimilar(arvoreBinaria2));
		
		System.out.println("Semelhança entre 1 e 3:");
		System.out.println(arvoreBinaria1.eSimilar(arvoreBinaria3));
	}
	
}