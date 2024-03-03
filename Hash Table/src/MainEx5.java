
public class MainEx5 {
    public static void main(String[] args) {
        SeparateChainingHashST<Character, String> st = new SeparateChainingHashST<Character, String>(3);
        // E A S Y Q U T I O N
        char[] texto = {'E', 'A', 'S', 'Y', 'Q', 'U', 'T', 'I', 'O', 'N'};
        
        for(char character: texto) {
        	st.putEx5(character, "");
        }

        st.imprime();
        System.out.println("");
        
        float media = 0;
        
        for(char character: texto) {
        	st.getEx5(character);
        	int comp = st.getComparacoes();
        	System.out.println("Comparações para busca do "+ character + ": "+ comp);
        	media += comp;
        }
        
        media = media/10;
        
        System.out.println("");
        System.out.println("Média de comparações: "+ media);

    }
}
