package org.example;

public class Filme {

    String titulo, diretor, autor ,ator;

    public Filme(String titulo, String diretor, String autor, String ator){
        this.titulo = titulo;
        this.diretor = diretor;
        this.autor = autor;
        this.ator = ator;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getDiretor(){
        return diretor;
    }
    public String getAutor(){
        return autor;
    }
    public String getAtor(){
        return ator;
    }
    public static void main(String[] args){

        Filme filme = new Filme("Tropa de elite","José padilha","Padilha","Wagner Moura");
        System.out.println("Título: " + filme.getTitulo());
        System.out.println("Diretor: " + filme.getDiretor());
        System.out.println("Autor: " + filme.getAutor());
        System.out.println("Ator: " + filme.getAtor());







    }







}
