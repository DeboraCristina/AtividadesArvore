package Ex02.view;

import br.edu.fateczl.arvoreint.Arvore;

public class Main
{
    public static void main(String[] args) {
        int[] vetor = {34, 15, 41, 38, 47, 34, 49, 43};
        Arvore tree = new Arvore();

        for (int e : vetor)
            tree.insert(e);

        try {
            System.out.println();
            tree.prefixSearch();
            System.out.println();
            tree.infixSearch();
            System.out.println();
            tree.postfixSearch();
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
a) A criação de um vetor fixo com os valores {33, 15, 41, 38, 47, 34, 49, 43}
b) A inicialização de uma Árvore de Busca Binária
c) A inserção dos dados do vetor na árvore
d) O atravessamento pre, in, e posfixo dos valores
 */