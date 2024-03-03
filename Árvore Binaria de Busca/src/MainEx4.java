public class MainEx4
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
		
		System.out.println("Resultado da operação:");
		System.out.println(arvoreBinaria4.removeForaIntervalo(4, 28));
		arvoreBinaria4.mostra();
		
	}
	
}
