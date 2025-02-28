package br.com.fiap.biblioteca.teste;

import br.com.fiap.biblioteca.model.Livro;

import javax.swing.*;

public class TesteBiblioteca {

    public static void main(String[] args) {

        Livro livro1 = new Livro();
        System.out.println(livro1);
        livro1.titulo = "Dom Casmurro";
        livro1.isbn = "2222222-00";
        livro1.setNumeroPaginas(30);
        livro1.autor = "Machado de Assis";

        Livro livro2 = new Livro("Amor de Perdição");
        System.out.println(livro2);
        livro2.autor = "Machado de Assis";
        livro2.setNumeroPaginas(410);
        livro2.isbn = "333333-99";

        Livro livro3 = new Livro("O demônio e a Srta. Prim", "Paulo Coelho");
        livro3.isbn = "686868-00";
        livro3.setNumeroPaginas(349);

       livro1.exibirInformacoes();
       livro2.exibirInformacoes();
       livro3.exibirInformacoes();

       Livro.testar();

        //JFrame tela = new JFrame();
        //tela.setSize(500, 500);
        //tela.setTitle("Live FIAP 27-02");
        //tela.setVisible(true);

        int pags = livro3.getNumeroPaginas();
        System.out.println(pags);
        System.out.println(livro1.getNumeroPaginas());

    }
}
