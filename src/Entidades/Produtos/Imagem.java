package Entidades.Produtos;

public class Imagem {
    private String idImagem;
    private String nome;
    private String caminho;
    private String formato;
    private int comprimento;
    private int altura;

    public Imagem(String idImagem, String nome, String caminho, String formato, int comprimento, int altura) {
        this.idImagem = idImagem;
        this.nome = nome;
        this.caminho = caminho;
        this.formato = formato;
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public String getIdImagem() {
        return this.idImagem;
    }

    public void setIdImagem(String idImagem) {
        this.idImagem = idImagem;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCaminho() {
        return this.caminho;
    }

    public void setCaminho(String caminho) {
        this.caminho = caminho;
    }

    public String getFormato() {
        return this.formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getComprimento() {
        return this.comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getAltura() {
        return this.altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
