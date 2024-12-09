package org.example;

public class Livro {
    String titulo,autor,ano,nome;

    public Livro(String titulo,String autor,String ano,String nome){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.nome = nome;



    }

    public String getName(){
        return nome;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public String getAno(){
        return ano;
    }



    public static void main(String[] args){
        Livro livro = new Livro("Senhor dos aneis","Robert","1995","Mello");


        System.out.println("Nome: " + livro.getName());
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano: " + livro.getAno());










    }




}
