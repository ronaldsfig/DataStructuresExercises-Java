package exercicio5;

import filaCircularSimples.Fila;

public class GeradorBinario {

    public static void gerarRepresentacoesBinarias(int N) {
        Fila fila = new Fila(N*2);

        for (int i=1; i<=N; i++) {
            fila.insere(i);
        }

        while (!fila.vazia()) {
            int numero = fila.remove();
            System.out.println(Integer.toBinaryString(numero));
        }
    }
    
}