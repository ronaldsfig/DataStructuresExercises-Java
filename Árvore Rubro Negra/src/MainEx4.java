public class MainEx4 {
    public static void main(String[] args) {
        RedBlackBST<Integer, String> st = new RedBlackBST<Integer, String>();
        /*
        st.put(70, "");
        st.put(19, "");
        st.put(11, "");
        st.put(89, "");
        st.put(13, "");
        st.put(17, "");
        */
        
        st.put(23, "Vinte e três");
        st.put(15, "Quinze");
        st.put(41, "Quarenta e um");
        st.put(11, "Onze");
        st.put(13, "Treze");
        st.put(14, "Quatorze");
        st.put(50, "Cinquenta");
        st.put(38, "Trinta e oito");

        st.mostra();
        long t1, t2;
        
        System.out.println("");
        System.out.println("Primeira busca do nó 14 / Tempo de execução:");
        t1 = System.currentTimeMillis();
        	System.out.printf("%s",st.get(14));
        t2 = System.currentTimeMillis();
        System.out.printf(" / %d", t2 - t1);
        
        System.out.println("");
        System.out.println("Segunda busca do nó 14 / Tempo de execução:");
        t1 = System.currentTimeMillis();
    		System.out.printf("%s",st.get(14));
    	t2 = System.currentTimeMillis();
    	System.out.printf(" / %d", t2 - t1);
    }
}

