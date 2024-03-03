public class Ex6SeparateChainingHashST<Key extends Comparable<Key>, Value> {
    private static final int INIT_CAPACITY = 4;

    private int n;                                // number of key-value pairs
    private int m;                                // hash table size
    private RedBlackBST<Key, Value>[] st;  // usei a minha classe de RBT da lista 7


    public Ex6SeparateChainingHashST() {
        this(INIT_CAPACITY);
    }


    public Ex6SeparateChainingHashST(int m) {
        this.m = m;
        st = (RedBlackBST<Key, Value>[]) new RedBlackBST[m];
        for (int i = 0; i < m; i++)
            st[i] = new RedBlackBST<Key, Value>();
    }
    

    private int hashTextbook(Key key) {
        return (key.hashCode() & 0x7fffffff) % m;
    }


    private int hash(Key key) {
        int h = key.hashCode();
        h ^= (h >>> 20) ^ (h >>> 12) ^ (h >>> 7) ^ (h >>> 4);
        return h & (m-1);
    }


    public int size() {
        return n;
    }


    public boolean isEmpty() {
        return size() == 0;
    }


    public boolean contains(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to contains() is null");
        return get(key) != null;
    }


    public Value get(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        int i = hash(key);
        return st[i].get(key);
    }


    public void put(Key key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");
        if (val == null) {
            delete(key);
            return;
        }

        int i = hash(key);
        if (!st[i].contains(key)) n++;
        st[i].put(key, val);
    }


    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");

        int i = hash(key);
        if (st[i].contains(key)) n--;
        st[i].delete(key);
        
    } 
   

    // imprime a tabela hash
    public void imprime() {
        for(int i = 0; i < m; i++) {
        	System.out.println(i+": ");
        	if(!st[i].isEmpty()) {
        		st[i].mostra();
        	}else {
        		System.out.println("null");
        	}
        	System.out.println();
        	System.out.println("-------------");
        }
    }


}