package org.example;

public class Funcionario {
   private String nome;
   private double salario;

   public Funcionario(String nome, double salario){
       this.nome = nome;
       this.salario = salario;
   }

   public String getNome(){
       return nome;
   }

   public double getSalario(){
       return salario;
   }
   public void setNome(String nome){
       this.nome = nome;
   }

   public void setSalario(double salario){
       this.salario = salario;
   }
   public static void main(String[] args){
       Funcionario funcionario = new Funcionario("Cleiton", 5000.0);
       System.out.println("Nome: "+funcionario.getNome());
       System.out.println("Salário: "+funcionario.getSalario());
       funcionario.setNome("Potifá");
       funcionario.setSalario(6000.0);
       System.out.println("Nome atualizado: "+funcionario.getNome());
       System.out.println("Salário atualizado: "+funcionario.getSalario());
   }
}
