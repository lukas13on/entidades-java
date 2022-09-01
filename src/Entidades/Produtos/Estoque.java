package Entidades.Produtos;

import Entidades.Produtos.Estoques.Lancamento;

public class Estoque {
    private Lancamento[] lancamentos;
    private int quantidade;

    public Estoque(Lancamento[] lancamentos) {
        this.lancamentos = lancamentos;
        this.setQuantidade();
    }

    public Lancamento[] getLancamentos() {
        return this.lancamentos;
    }

    public void setLancamentos(Lancamento[] lancamentos) {
        this.lancamentos = lancamentos;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade() {
        int quantidade = 0;
        for (Lancamento lancamento : this.lancamentos) {
            if (lancamento.getQuantidade() >= 0) {
                quantidade += lancamento.getQuantidade();
            } else {
                quantidade -= lancamento.getQuantidade();
            }
        }
        this.quantidade = quantidade;
    }

}
