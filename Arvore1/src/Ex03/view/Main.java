package Ex03.view;

import model.matheus.libArvoreChar.Arvore;

public class Main
{
    public static void main(String[] args) {
        char[] vetor = {'M', 'F', 'S', 'D', 'J', 'P', 'U', 'A', 'E', 'H', 'Q', 'T', 'W', 'K'};
        Arvore tree = new Arvore();

        for (char e : vetor)
            tree.insert(e);

        try {
            tree.remove('F');
            tree.remove('U');
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
a) A criação de um vetor fixo com os valores {M, F, S, D, J, P, U, A, E, H, Q, T, W, K}
b) A inicialização de uma Árvore de Busca Binária
c) A inserção dos dados do vetor na árvore
d) A remoção de F e U
e) O atravessamento pre, in, é posfixo dos valores pós remoção
 */