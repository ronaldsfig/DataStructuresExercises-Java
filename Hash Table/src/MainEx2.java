
public class MainEx2 {
    public static void main(String[] args) {
        // S E A R C H X M P L
        char[] texto = {'S', 'E', 'A', 'R', 'C', 'H', 'X', 'M', 'P', 'L'};
        
        int[] aAndM = SeparateChainingHashST.hashPerfeita(texto);
        int aPerfeito = aAndM[0];
        int MPerfeito = aAndM[1];
        
        System.out.println("Valor perfeito para a: " + aPerfeito);
        System.out.println("Valor perfeito para M: " + MPerfeito);
        
        System.out.println("Implementação:");
        SeparateChainingHashST<Character, String> st = new SeparateChainingHashST<Character, String>(MPerfeito);
        st.putEx2(texto, aPerfeito);
        st.imprime();
        
    }
}
