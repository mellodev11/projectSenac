package org.example;

public class Cachorro {

    String  name;

    public Cachorro(String name) {
        this.name = name;
    }


    void beber(){
        System.out.println(name+" está bebendo");
    }
    void latir(){
        System.out.println(name+" está latindo");
    }
    void correr(){
        System.out.println(name+" está correndo");
    }
    void comer(){
        System.out.println(name+" está comendo");
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }




    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bug");
        System.out.println("O meu cachorro chamado "+cachorro.getName());
        cachorro.beber();
        cachorro.latir();
        cachorro.correr();
        cachorro.comer();

    }























}
