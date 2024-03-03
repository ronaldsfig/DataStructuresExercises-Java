public class MainEx5 {
    public static void main(String[] args) {
        Ex5RedBlackBST<Integer, String> st = new Ex5RedBlackBST<Integer, String>();
        
        st.put(70, "");
        st.put(19, "");
        st.put(11, "");
        st.put(89, "");
        st.put(13, "");
        st.put(17, "");
        
        /*
        st.put(23, "");
        st.put(15, "");
        st.put(41, "");
        st.put(11, "");
        st.put(13, "");
        st.put(14, "");
        st.put(50, "");
        st.put(38, "");
        */

        st.mostra();
    }
}
