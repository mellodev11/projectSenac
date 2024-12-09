package org.example;

public class Cidade {
  private   double populacao;
  private   String nome;

    public Cidade(String nome, int populacao){
        this.nome = nome;
        this.populacao = populacao;

    }

    public double getPopulacao(){
        return populacao;
    }

    public String getNome(){
        return nome;
    }

    public void setPopulacao(Double populacao){
        this.populacao = populacao;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public static void main(String[] args){
        Cidade cidade = new Cidade("Brasília", 2817000);

        cidade.setNome("DF");
        cidade.setPopulacao(280000d);

        System.out.println("Nome: " + cidade.getNome());
        System.out.printf("A população é %.2f%n", cidade.getPopulacao());


    }







}
