
public class MainEx1 {
    public static void main(String[] args) {
        SeparateChainingHashST<Character, String> st = new SeparateChainingHashST<Character, String>(5);
        // E A S Y Q U T I O N
   
        st.putEx1('E', "");
        st.putEx1('A', "");
        st.putEx1('S', "");
        st.putEx1('Y', "");
        st.putEx1('Q', "");
        st.putEx1('U', "");
        st.putEx1('T', "");
        st.putEx1('I', "");
        st.putEx1('O', "");
        st.putEx1('N', "");
        st.imprime();

    }
}
