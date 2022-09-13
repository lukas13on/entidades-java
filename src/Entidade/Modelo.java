package Entidade;

import Controlador.Banco;

public class Modelo {
    private Banco banco = new Banco();
    private String tabela;

    public Modelo(String tabela) {
        this.tabela = tabela;
    }

    public String getTabela() {
        return this.tabela;
    }

    public void setTabela(String tabela) {
        this.tabela = tabela;
    }

    public Banco getBanco() {
        return this.banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

}
