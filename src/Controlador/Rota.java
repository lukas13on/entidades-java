package Controlador;

import Visualizador.Visualizador;

public class Rota {
    private int metodo;
    private String caminho;
    private Visualizador visualizador;

    public static final int GET = 0;
    public static final int POST = 1;

    public Rota(int metodo, String caminho, Visualizador visualizador) {
        this.metodo = metodo;
        this.caminho = caminho;
        this.visualizador = visualizador;
    }

    public int getMetodo() {
        return this.metodo;
    }

    public void setMetodo(int metodo) {
        this.metodo = metodo;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public Visualizador getVisual() {
        return this.visualizador;
    }

    public void setVisual(Visualizador visualizador) {
        this.visualizador = visualizador;
    }

    @Override
    public String toString() {
        return "{" +
                " metodo='" + getMetodo() + "'" +
                ", caminho='" + getCaminho() + "'" +
                ", visual='" + getVisual() + "'" +
                "}";
    }

}
