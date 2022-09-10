package Controlador;

public class Rota {
    private int metodo;
    private String caminho;
    private String grupo;
    private Visual visual;

    public static final int GET = 0;
    public static final int POST = 1;

    public Rota(int metodo, String caminho, Visual visual) {
        this.metodo = metodo;
        this.caminho = caminho;
        this.visual = visual;
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

    public Visual getVisual() {
        return this.visual;
    }

    public void setVisual(Visual visual) {
        this.visual = visual;
    }

    public String getGrupo() {
        return this.grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        return "{" +
                " metodo='" + getMetodo() + "'" +
                ", caminho='" + getCaminho() + "'" +
                ", grupo='" + getGrupo() + "'" +
                ", visual='" + getVisual() + "'" +
                "}";
    }

}
