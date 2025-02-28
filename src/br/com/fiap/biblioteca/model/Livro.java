package br.com.fiap.biblioteca.model;

public class Livro {

    public String titulo;
    public String autor;
    public String isbn;
    private int numeroPaginas;

    public Livro(String titulo){
        this.titulo = titulo;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro(){}

    public void setNumeroPaginas(int numeroPaginas){

        if (numeroPaginas >= 50){
            this.numeroPaginas = numeroPaginas;
        } else {
            System.out.println("O número de páginas do livro " + titulo + " deve ser maior ou igual a 50!");
        }


    }

    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void exibirInformacoes(){
        System.out.println("------------------");
        System.out.println("TÍTULO: " + titulo);
        System.out.println("AUTOR: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("NRO. PÁG.: " + numeroPaginas);
        System.out.println("------------------");
        System.out.println();
    }

    public static void testar(){
        System.out.println("Eu sou o método testar");

    }

}
