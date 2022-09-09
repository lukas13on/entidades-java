package Entidade.Produtos.Estoques;

import Entidade.Deposito;

public class Lancamento {
    private String idProduto;
    private String idVariacao;
    private Deposito deposito;
    private int quantidade;

    public Lancamento(String idProduto, String idVariacao, Deposito deposito, int quantidade) {
        this.idProduto = idProduto;
        this.idVariacao = idVariacao;
        this.deposito = deposito;
        this.quantidade = quantidade;
    }

    public String getIdProduto() {
        return this.idProduto;
    }

    public void setIdProduto(String idProduto) {
        this.idProduto = idProduto;
    }

    public String getIdVariacao() {
        return this.idVariacao;
    }

    public void setIdVariacao(String idVariacao) {
        this.idVariacao = idVariacao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Deposito getDeposito() {
        return this.deposito;
    }

    public void setDeposito(Deposito deposito) {
        this.deposito = deposito;
    }
    
}
