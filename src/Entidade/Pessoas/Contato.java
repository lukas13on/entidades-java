package Entidade.Pessoas;

import Enumerador.Pessoas.Contato.Tipo;

public class Contato {
    private Tipo tipo;
    private String email;
    private String celular;
    private String telefone;

    public Contato(Tipo tipo, String email, String celular, String telefone) {
        this.tipo = tipo;
        this.email = email;
        this.celular = celular;
        this.telefone = telefone;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
