package org.example;

public class Pessoa {
    String nome,email,endereco,sexo,estadoCivil,profissao,nacionalidade;
    Double idade , telefone,cpf,salario,filhos;

    public Pessoa(String nome, String email, String sexo, String estadoCivil, String profissao, String nacionalidade, Double idade, Double telefone, Double cpf, Double salario, Double filhos){
        this.nome = nome;
        this.email = email;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
        this.salario = salario;
        this.filhos = filhos;
        this.endereco = endereco;
    }
    void exibirDetalhes(){
       System.out.println("Nome"+nome+"Email"+email+"Sexo"+sexo+"Profissão"+profissao+"Nacionalidade"+nacionalidade);
        System.out.println("Idade: "+idade+" Telefone: "+telefone+" CPF: "+cpf+" Salario: "+salario+" Filhos: "+filhos);
    }
    public String getNome(){
        return nome;
    }
    public String getEmail(){
        return email;
    }
    public String getSexo(){
        return sexo;
    }
    public String getProfissao(){
        return profissao;
    }
    public String getNacionalidade(){
        return nacionalidade;
    }
    public Double getIdade(){
        return idade;
    }
    public Double getTelefone(){
        return telefone;
    }
    public Double getCpf(){
        return cpf;
    }
    public Double getSalario(){
        return salario;
    }
    public Double getFilhos(){
        return filhos;
    }
     public String getEndereco(){
        return endereco;
     }
    public void setNome(String nome){
        this.nome = nome;
        if(nome ==  null || nome == ""){
            System.out.println("Nome não pode ser nulo ou vazio");
        }else {
            System.out.println("Nome alterado para: "+nome);
        }
    }
    public void setIdade(Double idade){
        this.idade = idade;
        if(idade <0){
            System.out.println("Idade não pode ser negativa");
        }
        System.out.println("Idade alterada para: "+idade);
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
        if(endereco ==  null){
            System.out.println("Endereço não pode ser nulo");
        } else {
            System.out.println("Endereço alterado para: "+endereco);
        }
    }
    public void setTelefone(Double email){
        this.telefone = telefone;
        if (telefone <11){
            System.out.println("Telefone inválido");
        }else {
            System.out.println("Telefone alterado para: "+telefone);
        }
    }
















}





