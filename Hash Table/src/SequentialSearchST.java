
public class SequentialSearchST<Key, Value> {
    private int n;           // number of key-value pairs
    private Node first;      // the linked list of key-value pairs
    private int comparacoes;

    private class Node {
        private Key key;
        private Value val;
        private Node next;

        public Node(Key key, Value val, Node next)  {
            this.key  = key;
            this.val  = val;
            this.next = next;
        }
    }


    public SequentialSearchST() {
    }


    public int size() {
        return n;
    }


    public boolean isEmpty() {
        return size() == 0;
    }


    public boolean contains(Key key) {
    	Value contains = get(key);
    	comparacoes = 0;
        return contains != null;
    }


    public Value get(Key key) {
        for (Node x = first; x != null; x = x.next) {
        	comparacoes += 1;
            if (key.equals(x.key))
                return x.val;
        }
        return null;
    }


    public void put(Key key, Value val) {
        if (val == null) {
            delete(key);
            return;
        }

        for (Node x = first; x != null; x = x.next) {
            if (key.equals(x.key)) {
                x.val = val;
                return;
            }
        }
        first = new Node(key, val, first);
        n++;
    }


    public void delete(Key key) {
        first = delete(first, key);
    }

    
    private Node delete(Node x, Key key) {
        if (x == null) return null;
        if (key.equals(x.key)) {
            n--;
            return x.next;
        }
        x.next = delete(x.next, key);
        return x;
    }
    
    
    public Iterable<Key> keys()  {
        Queue<Key> queue = new Queue<Key>();
        for (Node x = first; x != null; x = x.next)
            queue.enqueue(x.key);
        return queue;
    }

    
    public String keysToString()  {
    	StringBuilder keysBuilder = new StringBuilder();
        for(Node node = first; node != null; node = node.next) {
        	keysBuilder.append(node.key+" -> ");
        }
        keysBuilder.append("null");
        String keys = keysBuilder.toString();
        return keys;
    }
    
    
    public int getComparacoes() {
    	int comp = comparacoes;
    	comparacoes = 0;
    	return comp;
    }
    

}