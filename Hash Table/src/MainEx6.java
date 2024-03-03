
public class MainEx6 {
	public static void main(String args[]) {
        Ex6SeparateChainingHashST<Character, String> stRBT = new Ex6SeparateChainingHashST<Character, String>(100);
        SeparateChainingHashST<Character, String> st = new SeparateChainingHashST<Character, String>(100);
        
        char[] texto = ExperimentosEx6.entrada;

        long t1, t2;
        
        System.out.println("Experimento 1: inserção de 300 elementos");
        t1 = System.nanoTime();
	        for(char character: texto) {
	        	st.put(character, "");
	        }
	    t2 = System.nanoTime();
	    System.out.println("Tempo da Separate Chaining Convencional: "+ ((t2 - t1)/300));
	    
	   
        t1 = System.nanoTime();
	        for(char character: texto) {
	        	stRBT.put(character, "");
	        }
	    t2 = System.nanoTime();
	    System.out.println("Tempo da Separate Chaining com RBT: "+ ((t2 - t1)/300));
        
	    
	    System.out.println("");
	    
	    
        System.out.println("Experimento 2: busca de 300 elementos");
        t1 = System.nanoTime();
	        for(char character: texto) {
	        	st.get(character);
	        }
	    t2 = System.nanoTime();
	    System.out.println("Tempo da Separate Chaining Convencional: "+ ((t2 - t1)/300));
	    
	   
        t1 = System.nanoTime();
	        for(char character: texto) {
	        	stRBT.get(character);
	        }
	    t2 = System.nanoTime();
	    System.out.println("Tempo da Separate Chaining com RBT: "+ ((t2 - t1)/300));
        
	    
	    System.out.println("");
	    
	    
        System.out.println("Experimento 3: deletar 300 elementos");
        t1 = System.nanoTime();
	        for(char character: texto) {
	        	st.delete(character);
	        }
	    t2 = System.nanoTime();
	    System.out.println("Tempo da Separate Chaining Convencional: "+ ((t2 - t1)/300));
	    
	   
        t1 = System.nanoTime();
	        for(char character: texto) {
	        	stRBT.delete(character);
	        }
	    t2 = System.nanoTime();
	    System.out.println("Tempo da Separate Chaining com RBT: "+ ((t2 - t1)/300));
	}
}
