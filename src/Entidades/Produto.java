package Entidades;

import Entidades.Produtos.Atributo;
import Entidades.Produtos.Dimensao;
import Entidades.Produtos.Estoque;
import Entidades.Produtos.Variacao;

public class Produto {
    private String idProduto;
    private String titulo;
    private String descricao;
    private double preco;
    private int quantidade;
    private Dimensao dimensao;
    private Atributo[] atributos;
    private Variacao[] variacoes;
    // fazer estoques
    private Estoque[] estoques;

    public Produto(String titulo, String descricao, double preco, Dimensao dimensao, Variacao[] variacoes,
            Atributo[] atributos) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.preco = preco;
        this.dimensao = dimensao;
        this.variacoes = variacoes;
        this.atributos = atributos;
        // fazer estoques
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

    public Atributo[] getAttributos() {
        return this.atributos;
    }

    public void setAttributos(Atributo[] attributos) {
        this.atributos = attributos;
    }

    public Variacao[] getVariacoes() {
        return this.variacoes;
    }

    public void setVariacoes(Variacao[] variacoes) {
        this.variacoes = variacoes;
    }

    public Dimensao getDimensao() {
        return this.dimensao;
    }

    public void setDimensao(Dimensao dimensao) {
        this.dimensao = dimensao;
    }

    public Estoque[] getEstoque() {
        return this.estoques;
    }

    public void setEstoque(Estoque[] estoques) {
        this.estoques = estoques;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Atributo[] getAtributos() {
        return this.atributos;
    }

    public void setAtributos(Atributo[] atributos) {
        this.atributos = atributos;
    }

    public Estoque[] getEstoques() {
        return this.estoques;
    }

    public void setEstoques(Estoque[] estoques) {
        this.estoques = estoques;
    }

    public String getVariacao() {
        String resultado = "{";
        Boolean fecha;
        int i = 0;

        for (Variacao variacao : this.variacoes) {
            resultado += "{";
            resultado += " idVariacao='" + variacao.getIdVariacao() + "'";
            resultado += ", preco='" + variacao.getPreco() + "'";
            fecha = i == this.variacoes.length - 1 ? true : false;
            resultado += fecha ? "}" : "},";
            i++;
        }

        resultado += "}";

        return resultado;
    }

    public String getAtributo() {
        String resultado = "{";
        Boolean fecha;
        int i = 0;

        for (Atributo atributo : this.atributos) {
            resultado += "{";
            resultado += " idAtributo='" + atributo.getIdAtributo() + "'";
            resultado += ", nome'" + atributo.getNome() + "'";
            resultado += ", valor='" + atributo.getValor() + "'";
            fecha = i == this.atributos.length - 1 ? true : false;
            resultado += fecha ? "}" : "},";
            i++;
        }

        resultado += "}";

        return resultado;
    }

    @Override
    public String toString() {
        return "{" +
                " titulo='" + getTitulo() + "'" +
                ", descricao='" + getDescricao() + "'" +
                ", preco='" + getPreco() + "'" +
                ", attributos='" + getAtributo() + "'" +
                ", variacoes='" + getVariacao() + "'" +
                ", dimensao='" + getDimensao() + "'" +
                ", estoque='" + getEstoque() + "'" +
                "}";
    }

}
