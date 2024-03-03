
public class MainEx4 {
	public static void main(String args[]) {
        LinearProbingHashST<Character, String> st = new LinearProbingHashST<Character, String>(4);
        st.putEx4('E', "");
        st.putEx4('A', "");
        st.putEx4('S', "");
        st.putEx4('Y', "");
        st.putEx4('Q', "");
        st.putEx4('U', "");
        st.putEx4('T', "");
        st.putEx4('I', "");
        st.putEx4('O', "");
        st.putEx4('N', "");
        
        st.imprime();
	}
}
