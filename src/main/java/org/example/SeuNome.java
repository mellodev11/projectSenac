package org.example;

public class SeuNome {
    String name,proficao,endereco,email;
    int idade;

    public SeuNome(String name,String proficao,String endereco,String email,int idade) {
        this.name = name;
        this.proficao = proficao;
        this.endereco = endereco;
        this.email = email;
        this.idade = idade;

    }

    public String getName(){
        return name;
    }

    public String getProficao(){
        return proficao;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getEmail(){
        return email;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setName(String name){
        this.name = name;
    }

    public void setProficao(String proficao){
        this.proficao = proficao;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setEmail(String email){
        this.email = email;
    }


    public static void main(String[]args){
        SeuNome meuNome = new SeuNome("Robert","desempregado","Brazlandia","robertmello11@gmail.com",25);

        System.out.println("Meu nome é: " + meuNome.getName() );
        System.out.println("Minha profissão é: " + meuNome.getProficao() );
        System.out.println("Meu endereço é: " + meuNome.getEndereco() );
        System.out.println("Meu email é: " + meuNome.getEmail() );
        System.out.println("Minha idade é: " + meuNome.getIdade() );

        meuNome.setIdade(26);

        System.out.println("Minha nova idade é: " + meuNome.getIdade() );





    }































}
