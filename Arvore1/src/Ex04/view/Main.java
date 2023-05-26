package Ex04.view;

import br.edu.fateczl.arvoreint.Arvore;

public class Main
{
    public static void main(String[] args) {
        int[] vetor = {7, 8, 3, 4, 2, 1, 6, 5};
        Arvore tree = new Arvore();

        for (int e : vetor)
            tree.insert(e);

        try {
            tree.remove(7);
            tree.remove(6);
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
a) A criação de um vetor fixo com os valores {7, 8, 3, 4, 2, 1, 6, 5}
b) A inicialização de uma Árvore de Busca Binária
c) A inserção dos dados do vetor na árvore
d) A remoção de 7 e 6
e) O atravessamento pre, in, é posfixo dos valores pós remoção
 */