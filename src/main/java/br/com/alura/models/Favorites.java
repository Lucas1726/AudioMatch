package br.com.alura.models;

public class Favorites {
    public void inclui(Classifiable item) {
        if (item.getClassificacao() >= 9) {
            System.out.println("Este conteúdo é um sucesso absoluto!");
        } else {
            System.out.println("Este conteúdo está sendo muito bem avaliado!");
        }
    }
}
