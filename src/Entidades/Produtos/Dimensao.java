package Entidades.Produtos;

public class Dimensao {
    private double comprimento;
    private double largura;
    private double altura;
    private double peso;

    public Dimensao(double comprimento, double largura, double altura, double peso) {
        this.comprimento = comprimento;
        this.largura = largura;
        this.altura = altura;
        this.peso = peso;
    }

    public double getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return this.largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}
