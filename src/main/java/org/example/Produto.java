package org.example;

public class Produto {
    String name;
    int quantity;

    public Produto(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity <=0){
            System.out.println("Quantidade não pode ser negativa ou zero");
            this.quantity = 0;
        }else {
            System.out.println("Quantidade atualizada com sucesso");
        }

    }
    public static void main(String[] args){
        Produto produto = new Produto("Whey Protein",3);
        System.out.println("Nome: " + produto.getName());
        System.out.println("Quantidade "+ produto.getQuantity());

        produto.setName("Whey Protein 30%");
        System.out.println("Nome: " + produto.getName());

        produto.setQuantity(0);
        System.out.println("Quantidade "+ produto.getQuantity());









    }












}
