package org.example;

public class NewFilme {
    String titulo;
    int classint;




    public NewFilme(String titulo, int classint){
    this.titulo = titulo;
    this.classint = classint;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getClassint(){
        return classint;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setClassint(int classint){
        this.classint = classint;
        if(classint >=18){
            System.out.println("Você pode assistir esse filme");
        }else{
            System.out.println("Você não pode assistir esse filme");
        }
    }

    public static void main(String[] args){
        NewFilme filme = new NewFilme("Titanic", 17);
        System.out.println("Nome do filme: " + filme.getTitulo());
        System.out.println("Classificação: " + filme.getClassint());



        filme.setTitulo("Novo Filme Serra elétrica");
        filme.setClassint(15);

        System.out.println("Nome do filme"+filme.getTitulo());
        System.out.println("Classificação: " + filme.getClassint());


    }



















}
