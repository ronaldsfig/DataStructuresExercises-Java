public class SeparateChainingHashST<Key, Value> {
    private static final int INIT_CAPACITY = 4;

    private int n;                                // number of key-value pairs
    private int m;                                // hash table size
    private SequentialSearchST<Key, Value>[] st;  // array of linked-list symbol tables
    public int comparacoes;


    public SeparateChainingHashST() {
        this(INIT_CAPACITY);
        comparacoes = 0;
    }


    public SeparateChainingHashST(int m) {
        this.m = m;
        st = (SequentialSearchST<Key, Value>[]) new SequentialSearchST[m];
        for (int i = 0; i < m; i++)
            st[i] = new SequentialSearchST<Key, Value>();
        comparacoes = 0;
    }
    

    private void resize(int chains) {
        SeparateChainingHashST<Key, Value> temp = new SeparateChainingHashST<Key, Value>(chains);
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys()) {
                temp.put(key, st[i].get(key));
            }
        }
        this.m  = temp.m;
        this.n  = temp.n;
        this.st = temp.st;
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
        
        if (n >= 10*m) resize(2*m);

        int i = hash(key);
        if (!st[i].contains(key)) n++;
        st[i].put(key, val);
    }


    public void delete(Key key) {
        if (key == null) throw new IllegalArgumentException("argument to delete() is null");

        int i = hash(key);
        if (st[i].contains(key)) n--;
        st[i].delete(key);
        
        if (m > INIT_CAPACITY && n <= 2*m) resize(m/2);
    }
    
    
    public Iterable<Key> keys() {
        Queue<Key> queue = new Queue<Key>();
        for (int i = 0; i < m; i++) {
            for (Key key : st[i].keys())
                queue.enqueue(key);
        }
        return queue;
    }
    

    // imprime a tabela hash
    public void imprime() {
        for(int i = 0; i < m; i++) {
        	System.out.println(i+": "+st[i].keysToString());
        }
    }
    
    
    private int hashEx1(Character key) {
    	int k = key - 'A'; // vai dar um valor entre 0 e 25, pq 'A' no ASCII é o primeiro elemento das letras maiúsculas do alfabeto, ou seja, o 65.

        int indice = (11 * k) % m;
        return indice;
    }
    
    public void putEx1(Character key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");

        int i = hashEx1(key);
        if (!st[i].contains((Key)key)) n++;
        st[i].put((Key)key, val);
    }
    
    
    public static int[] hashPerfeita(char[] chars) {
    	int[] aAndM = new int[2];
        boolean conflita;			

        // começa a busca pelo valor de M igual ao número de caracteres
        // por mais que pareça infinito o loop, ele só vai parar quando de alguma forma encontrar os int ideais para 'a' e 'M', independente da quantidade de operações e iterações posteriores
        for (int M = chars.length; ; M++) {
            conflita = false;
            boolean[] charsVerificados = new boolean[M];

            // itera sobre valores de 'a', usando um método para encontrar o próximo número primo
            for (int a = 1; a < M; a = proximoPrimo(a)) {
                conflita = false;

                // itera sobre os caracteres fornecidos
                for (char character : chars) {
                    int k = character - 'A';
                    int posicao = (a * k) % M;

                    // verifica se tem colisões
                    if (charsVerificados[posicao]) {
                        conflita = true;
                        break;
                    } else {
                        charsVerificados[posicao] = true;
                    }
                }

                // se não houver colisões, define aAndM com os valores ideais de 'a' e 'M'
                if (!conflita) {
                    aAndM[0] = a;
                    aAndM[1] = M;
                    return aAndM;
                }
            }
        }
        
    }
    
    private static int proximoPrimo(int numero) {
        numero++;
        while (true) {
            if (ePrimo(numero)) {
                return numero;
            }
            numero++;
        }
    }
    
    private static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    // fiz um outro put pra facilitar a implementação
    public void putEx2(char[] chars, int a) {
    	String valorIrrelevante = "";
    	
    	for(char character: chars) {
    		Character key = character;
    		int k = character - 'A';
    		int hash = (a * k) % m;
    		
    		if (!st[hash].contains((Key)key)) n++;
            st[hash].put((Key)key, (Value)valorIrrelevante);
    	}

    }
    
    
    private int hashEx5(Character key) {
    	int k = key - 'A';

        int indice = (17 * k) % m;
        return indice;
    }
    
    
    public void putEx5(Character key, Value val) {
        if (key == null) throw new IllegalArgumentException("first argument to put() is null");

        int i = hashEx1(key); // a hash do exercício 1 já corresponde ao primeiro hash solicitado
        int i2 = hashEx5(key);
        
        if(st[i].size() <= st[i2].size()) {
        	if (!st[i].contains((Key)key)) n++;
            st[i].put((Key)key, val);
        }else {
        	if (!st[i2].contains((Key)key)) n++;
            st[i2].put((Key)key, val);
        }
        	
    }
    
    
    public Value getEx5(Character key) {
        if (key == null) throw new IllegalArgumentException("argument to get() is null");
        
        int i = hashEx1(key);
        int i2 = hashEx5(key);
        
        Value getLista1 = st[i].get((Key)key);
        comparacoes += st[i].getComparacoes();
        
        if(getLista1 != null) {
        	return getLista1;
        }else {
        	Value getLista2 = st[i2].get((Key)key);
        	comparacoes += st[i2].getComparacoes();
        	return getLista2;
        }

    }
    
    // foi necessário tanto aqui quanto na classe sequential search para traçar a média solicitada
    public int getComparacoes() {
    	int comp = comparacoes;
    	comparacoes = 0;
    	return comp;
    }


}