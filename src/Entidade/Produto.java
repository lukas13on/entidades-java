package Entidade;

import Entidade.Produtos.Atributo;
import Entidade.Produtos.Dimensao;
import Entidade.Produtos.Estoque;
import Entidade.Produtos.Imagem;
import Entidade.Produtos.Variacao;
import Enumerador.Produtos.Tipo;

public class Produto {
    private String idProduto;
    private Tipo tipo;
    private String titulo;
    private String descricao;
    private double preco;
    private Dimensao dimensao;
    private Atributo[] atributos;
    private Variacao[] variacoes;
    private Imagem[] imagens;
    private Estoque estoque;

    // produto teste
    public Produto(String titulo) {
        this.titulo = titulo;
    }

    // produto simples
    public Produto(String idProduto, String titulo, String descricao, double preco, Dimensao dimensao,
            Imagem[] imagens,
            Atributo[] atributos, Estoque estoque) {
        this.setTipo(Tipo.SIMPLES);
        this.idProduto = idProduto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.dimensao = dimensao;
        this.imagens = imagens;
        this.atributos = atributos;
        this.estoque = estoque;
    }

    // produto variavel
    public Produto(String idProduto, String titulo, String descricao, Dimensao dimensao,
            Variacao[] variacoes,
            Atributo[] atributos) {
        this.setTipo(Tipo.VARIAVEL);
        this.idProduto = idProduto;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dimensao = dimensao;
        this.variacoes = variacoes;
        this.atributos = atributos;
        this.setPrecoMedio();
    }

    public String getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Dimensao getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    public Atributo[] getAtributos() {
        return this.atributos;
    }

    public void setAtributos(Atributo[] atributos) {
        this.atributos = atributos;
    }

    public Variacao[] getVariacoes() {
        return this.variacoes;
    }

    public void setVariacoes(Variacao[] variacoes) {
        this.variacoes = variacoes;
    }

    public Imagem[] getImagens() {
        return this.imagens;
    }

    public void setImagens(Imagem[] imagens) {
        this.imagens = imagens;
    }

    public void setEstoque(Estoque estoque) {
        this.estoque = estoque;
    }

    private void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setPrecoMedio() {
        int preco = 0;
        for (Variacao variacao : this.variacoes) {
            if (variacao.getPreco() > 0) {
                preco += variacao.getPreco();
            }
        }
        preco = preco / this.variacoes.length;
        this.preco = preco;
    }

}
