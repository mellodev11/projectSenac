package org.example;

public class Carro {
        String marca, cor, modelo;


        void acelerar(){
            System.out.println("O carro está acelerando");
        }
        void frear(){
            System.out.println("O carro está freando");
        }
        void virar(String direcao){
            System.out.println("O carro virando para "+ direcao+".");
        }

        public  Carro(String marca, String cor, String modelo){
            this.marca = marca;
            this.cor = cor;
            this.modelo = modelo;
        }

        public String getMarca(){
            return marca;
        }
        public String getCor(){
            return cor;
        }
        public String getModelo(){
            return modelo;
        }



        public static void main(String[]args) {
            Carro carro = new Carro("Toyota", "vermelho", "xls");


            System.out.println("marca = "+ carro.getMarca());
            System.out.println("cor = "+ carro.getCor());
            System.out.println("modelo = "+ carro.getModelo());

            carro.acelerar();
            carro.frear();
            carro.virar(" esquerda");

        }
    }















