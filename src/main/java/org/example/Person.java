package org.example;

public class Person {
    private int idade;
    private String nome;

    public Person(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;

    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
        if (idade >= 18){
            System.out.println(nome + " é maior de idade!");
        }else {
            System.out.println(nome + " é menor de idade!");
        }
    }
    public static void main(String[] args){
        Person p = new Person(70,"Zezin");

        p.setIdade(16);
        p.setNome("Rodinaldo");

        System.out.println("Seu nome é "+p.getNome());
        System.out.println("Sua idade é "+p.getIdade());



    }






}
