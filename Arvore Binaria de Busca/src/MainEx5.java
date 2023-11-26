public class MainEx5
{
	public static void main(String args[])
	{
		ArvBinBusca<Integer, String> arvoreBinaria4 = new ArvBinBusca<>();
		
		arvoreBinaria4.put(10, "");
		arvoreBinaria4.put(20, "");
		arvoreBinaria4.put(6, "");
		arvoreBinaria4.put(2, "");
		arvoreBinaria4.put(4, "");
		arvoreBinaria4.put(18, "");
		arvoreBinaria4.put(35, "");
		arvoreBinaria4.put(17, "");
		arvoreBinaria4.put(19, "");
		arvoreBinaria4.put(29, "");
		arvoreBinaria4.put(45, "");
		arvoreBinaria4.put(43, "");
		arvoreBinaria4.put(27, "");
		arvoreBinaria4.put(30, "");
		arvoreBinaria4.put(26, "");
		arvoreBinaria4.put(28, "");
		arvoreBinaria4.put(1, "");
		arvoreBinaria4.put(3, "");
		arvoreBinaria4.put(7, "");
		arvoreBinaria4.put(9, "");
		
		ArvBinBusca.No primeiro = arvoreBinaria4.new No(30, "");
		ArvBinBusca.No segundo = arvoreBinaria4.new No(17, "");
		ArvBinBusca.No ancestral = arvoreBinaria4.obtemAncestralComum(primeiro, segundo);
		
		System.out.println("Chave do nó ancestral:");
		System.out.println(ancestral.chave);
		
	}
	
}

