package org.example;

public class ContaBancaria {
    private double saldo,numero;

    public ContaBancaria(double saldo, double numero){
        this.saldo = saldo;
        this.numero = numero;
    }
    public Double getSaldo(){
        return saldo;
    }
    public Double getNumero(){
        return numero;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setNumero(double numero){
        this.numero = numero;
    }
    public static void main(String[] args){
        ContaBancaria conta = new ContaBancaria(5000,06304973110d);

        conta.setNumero(064147522d);
        conta.setSaldo(5500);

        System.out.println("Saldo: R$ " + conta.getSaldo());
        System.out.println("Número da Conta: " + conta.getNumero());


    }

}
