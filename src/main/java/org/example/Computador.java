package org.example;

public class Computador {
        String monitor,processador,placaDeVideo,teclado;
    public Computador(String monitor,String processador,String placaDeVideo,String teclado) {
        this.monitor = monitor;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
        this.teclado = teclado;

    }

    public String getMonitor() {
        return monitor;
    }
    public String getProcessador() {
        return processador;
    }
    public String getPlacaDeVideo() {
        return placaDeVideo;
    }
    public String getTeclado() {
        return teclado;
    }

    public static void main (String[] args){
        Computador computador = new Computador("LG 240hz","Ryzen 5700x","3060ti","Logitech G Pro");

        System.out.println("Monitor: " + computador.getMonitor());
        System.out.println("Processador: " + computador.getProcessador());
        System.out.println("Placa de Video: " + computador.getPlacaDeVideo());
        System.out.println("Teclado: " + computador.getTeclado());

    }


















}
