package org.example;

public class Curso {
    String nome;
    float horas;

    public Curso(String nome, float horas){
        this.nome = nome;
        this.horas = horas;
    }

    public float getHoras(){
        return horas;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setHoras(float horas){
        this.horas = horas;
    }

    public static void main(String[] args) {
        Curso curso = new Curso("Programação Orientada a Objetos", 40);
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Horas: " + curso.getHoras());

        curso.setNome("Programação Funcional");
        curso.setHoras(35);

        System.out.println("Curso atualizado: " + curso.getNome());
        System.out.println("Horas atualizadas: " + curso.getHoras());
    }




}
